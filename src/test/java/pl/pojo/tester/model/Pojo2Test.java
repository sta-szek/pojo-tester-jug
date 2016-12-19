package pl.pojo.tester.model;

import org.junit.Test;
import pl.pojo.tester.api.ClassAndFieldPredicatePair;
import pl.pojo.tester.api.ConstructorParameters;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

public class Pojo2Test {

    @Test
    public void testPojo2() {
        final ClassAndFieldPredicatePair baseClass = new ClassAndFieldPredicatePair(Pojo2.class);
        final ClassAndFieldPredicatePair[] compositeClasses = new ClassAndFieldPredicatePair[]{
                new ClassAndFieldPredicatePair(Pojo.class),
                new ClassAndFieldPredicatePair(Pojo3.class)
        };
        final ConstructorParameters constructorParameters = new ConstructorParameters(new Object[]{123}, new Class[]{int.class});

        assertPojoMethodsFor(baseClass, compositeClasses).create(Pojo3.class, constructorParameters)
                                                         .areWellImplemented();
    }
}