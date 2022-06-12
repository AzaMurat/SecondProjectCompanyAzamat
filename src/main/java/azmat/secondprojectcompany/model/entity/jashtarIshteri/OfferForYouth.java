package azmat.secondprojectcompany.model.entity.jashtarIshteri;

import azmat.secondprojectcompany.model.FileInformation.Gallery;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "offerForYouth")
public class OfferForYouth {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "off_seq")
    @SequenceGenerator(name = "off_seq",
            sequenceName = "SEQ_OFF", allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long id;

    private String offer;

    @OneToOne
    private Gallery gallery;
}
