package inclass.may06.FlatMap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Session {

    private Integer sessionId;
    private List<Student> student;

   /* public Session(int sessionId, Student student1, Student student2, Student student3, Student student4,Student student5, Student s) {
    }*/
}
