package azmat.secondprojectcompany.model.entity.bilimBeruu;

import azmat.secondprojectcompany.model.FileInformation.Gallery;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "olympians")

public class Olympians {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "olympians_seq")
    @SequenceGenerator(name = "olympians_seq",
            sequenceName = "SEQ_OLYMPIANS", allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long id;
    private String text;

    @OneToOne(cascade = CascadeType.ALL)
    private Gallery gallery;

}