package pl.pojo.tester.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PojoTest {

    //
    // EQUALS

    @Test
    public void Should_Equal_Itself() {
        // given
        final Pojo pojo = new Pojo();

        // when
        final boolean result = pojo.equals(pojo);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void Should_Equal_Other_Instance() {
        // given
        final Pojo pojo1 = new Pojo();
        final Pojo pojo2 = new Pojo();

        // when
        final boolean result = pojo1.equals(pojo2);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void Should_Not_Equal_Null() {
        // given
        final Pojo pojo1 = new Pojo();

        // when
        final boolean result = pojo1.equals(null);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void Should_Not_Equal_Other_Instance_1() {
        // given
        final Pojo pojo1 = new Pojo();
        final Pojo pojo2 = new Pojo(123);

        // when
        final boolean result = pojo1.equals(pojo2);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void Should_Not_Equal_Other_Instance_2() {
        // given
        final Pojo pojo1 = new Pojo();
        final Pojo pojo2 = new Pojo(1, 5);

        // when
        final boolean result = pojo1.equals(pojo2);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void Should_Not_Equal_Other_Instance_3() {
        // given
        final Pojo pojo1 = new Pojo();
        final Pojo pojo2 = new Pojo(1, 2, 5);

        // when
        final boolean result = pojo1.equals(pojo2);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void Should_Not_Equal_Other_Class() {
        // given
        final Pojo pojo1 = new Pojo();

        // when
        final boolean result = pojo1.equals("string class");

        // then
        assertThat(result).isFalse();
    }


    //
    // HASHCODE

    @Test
    public void Should_Return_Same_Hashcode() {
        // given
        final Pojo pojo = new Pojo();

        // when
        final int result1 = pojo.hashCode();
        final int result2 = pojo.hashCode();

        // then
        assertThat(result1).isEqualTo(result2);
    }

    @Test
    public void Should_Return_Different_Hashcode_1() {
        // given
        final Pojo pojo1 = new Pojo();
        final Pojo pojo2 = new Pojo(2);

        // when
        final int result1 = pojo1.hashCode();
        final int result2 = pojo2.hashCode();

        // then
        assertThat(result1).isNotEqualTo(result2);
    }

    @Test
    public void Should_Return_Different_Hashcode_2() {
        // given
        final Pojo pojo1 = new Pojo();
        final Pojo pojo2 = new Pojo(2, 3);

        // when
        final int result1 = pojo1.hashCode();
        final int result2 = pojo2.hashCode();

        // then
        assertThat(result1).isNotEqualTo(result2);
    }

    @Test
    public void Should_Return_Different_Hashcode_3() {
        // given
        final Pojo pojo1 = new Pojo();
        final Pojo pojo2 = new Pojo(2, 3, 4);

        // when
        final int result1 = pojo1.hashCode();
        final int result2 = pojo2.hashCode();

        // then
        assertThat(result1).isNotEqualTo(result2);
    }

    //
    // TO STRING

    @Test
    public void Should_Return_Expected_String() {
        // given
        final Pojo pojo = new Pojo();
        final String expectedString = "Pojo{a=1, b=2, c=3}";

        // when
        final String result = pojo.toString();

        // then
        assertThat(result).isEqualTo(expectedString);
    }

}