package azamat.api.aiylCharbaApi;

import azamat.db.servise.aiylCharba.PastureServise;
import azamat.db.model.entity.aiylCharba.Pasture;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.LinkedHashMap;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/agriculture/pasture")
@AllArgsConstructor
@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
@Tag(name = "AiylCharba Pasture", description = "crud operations")
public class PastureApi {

    private PastureServise pastureServise;

    @Operation(summary = "Save Pasture by id ")
    @PostMapping("/save")
    public Pasture savePastureService(@RequestBody Pasture pasture) {
        return pastureServise.savePasture(pasture);
    }

    @Operation(summary = "Update Pasture by id")
    @PatchMapping("/{id}")
    public Pasture update(@RequestBody Pasture pasture,@PathVariable Long id) {
        return pastureServise.update(pasture,id);
    }

    @Operation(summary = "Delete Pasture by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> savePastureService(@PathVariable Long id) {
        return pastureServise.deleteById(id);
    }

    @Operation(summary = "Upload files", description = "Upload files to aws")
    @PostMapping("/upload-file/{id}")
    public LinkedHashMap<String, String> uploadFile(@RequestBody MultipartFile firstPhoto,
                                                    @PathVariable Long id) {
        return pastureServise.uploadFile(firstPhoto, id);
    }

}
