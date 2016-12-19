package pl.pojo.tester.model;


import lombok.Data;


@Data
public class Pojo3 {

    private int a;
    private int b;
    private int c;
    private Pojo pojo;

    public Pojo3(final int a) {
        if (a != 123) {
            throw new RuntimeException("  excpetion");
        }
    }
}
