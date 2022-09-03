package azamat.db.servise.bilimBeruu;

import azamat.db.model.entity.bilimBeruu.Kindergartens;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface KindergartensService {
    Kindergartens saveKindergartens(Kindergartens kindergartens);

    Kindergartens update(Kindergartens kindergartens, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Kindergartens> getAll();
}
