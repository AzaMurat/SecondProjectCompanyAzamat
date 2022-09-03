package azamat.db.servise.bilimBeruu;

import azamat.db.model.entity.bilimBeruu.Circles;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CirclesService {
    Circles saveCircles(Circles circles);

    Circles update(Circles circles, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Circles> getAll();
}
