package inclass.may03.MethodReference.Static;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Students {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer  grade;

}
