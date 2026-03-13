package inclass.may03.Optional;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Emp {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer grade;

}
