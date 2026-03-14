package inclass.may03.ParallelStreamAndStream;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Emp {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;



}
