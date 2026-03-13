package inclass.may06.FlatMap;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Student {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer grade;
    private List<String> emails;

}
