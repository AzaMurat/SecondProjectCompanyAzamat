package azmat.secondprojectcompany.db.servise.aiylCharba;

import azmat.secondprojectcompany.model.entity.aiylCharba.Laws;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LawsService {

    Laws saveLaws(Laws laws);

    Laws update(Laws laws, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Laws> getAll();

}
