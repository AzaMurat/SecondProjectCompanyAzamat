package azmat.secondprojectcompany.model.FileInformation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "gallery")
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator ="hibernate_gen" )
    @SequenceGenerator(name = "hibernate_gen",sequenceName = "hibernate_seq",allocationSize = 1)
    @Column(name = "id",nullable = false)
    private Long id;

    private String firstPhoto;
    private String secondPhoto;
    private String thirdPhoto;
    private String file;

    private String keyOfFirstPhoto;
    private String keyOfSecondPhoto;
    private String keyOfThirdPhoto;
    private String KeyOfFile;
}
