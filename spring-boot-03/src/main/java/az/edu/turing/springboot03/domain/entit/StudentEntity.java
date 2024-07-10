package az.edu.turing.springboot03.domain.entit;
import lombok.*;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor

public class StudentEntity {

    private Long id;
    private String name;
    private Integer age;
    private Boolean gender;
    private Double grade;

}
