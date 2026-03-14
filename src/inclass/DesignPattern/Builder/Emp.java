package inclass.DesignPattern.Builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Emp {
    private int id;
    private String name;
    private double salary;
}
