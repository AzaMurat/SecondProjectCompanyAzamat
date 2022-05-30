package azmat.secondprojectcompany.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "salamattyk")
@RequiredArgsConstructor
@Getter
@Setter

public class SalamattyktySaktoo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_gen")
    @SequenceGenerator(name = "hibernate_gen", sequenceName = "hibernate_seg", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

}
