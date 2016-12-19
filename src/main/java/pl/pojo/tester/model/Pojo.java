package pl.pojo.tester.model;


public class Pojo {

    private int a;
    private int b;
    private int c;

    public Pojo(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Pojo(final int a, final int b) {
        this(a, b, 3);
    }

    public Pojo(final int a) {
        this(a, 2, 3);
    }

    public Pojo() {
        this(1, 2, 3);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Pojo pojo = (Pojo) o;

        if (a != pojo.a) return false;
        if (b != pojo.b) return false;
        return c == pojo.c;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(final int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(final int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(final int c) {
        this.c = c;
    }
}
