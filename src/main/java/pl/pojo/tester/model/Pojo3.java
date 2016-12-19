package pl.pojo.tester.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pojo3 {

    private int a;
    private int b;
    private int c;
    private Pojo pojo;

}
