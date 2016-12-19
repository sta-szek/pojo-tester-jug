package pl.pojo.tester.model;

import org.junit.Test;
import pl.pojo.tester.api.ClassAndFieldPredicatePair;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

public class Pojo2Test {

    @Test
    public void testPojo2() {
        final ClassAndFieldPredicatePair baseClass = new ClassAndFieldPredicatePair(Pojo2.class);
        final ClassAndFieldPredicatePair[] compositeClasses = new ClassAndFieldPredicatePair[]{
                new ClassAndFieldPredicatePair(Pojo.class),
                new ClassAndFieldPredicatePair(Pojo3.class)
        };

        assertPojoMethodsFor(baseClass, compositeClasses).areWellImplemented();
    }
}