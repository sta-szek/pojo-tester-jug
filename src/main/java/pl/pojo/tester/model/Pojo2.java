package pl.pojo.tester.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Pojo2 {

    private int a;
    private int b;
    private int c;
    private Pojo pojo;


}
