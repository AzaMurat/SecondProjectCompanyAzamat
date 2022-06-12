package azmat.secondprojectcompany.db.servise.salamattykdySaktoo;

import azmat.secondprojectcompany.model.entity.salamattykSaktoo.Insurance;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InsuranceService {
    Insurance saveInsurance(Insurance insurance);

    Insurance update(Insurance insurance, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Insurance> getAll();
}
