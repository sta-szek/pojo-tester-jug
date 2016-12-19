package pl.pojo.tester.model;

import org.junit.Test;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsForAll;

public class Pojo2Test {

    @Test
    public void testPojo2() {
        final Class[] classes = {Pojo.class, Pojo2.class, Pojo3.class};

        assertPojoMethodsForAll(classes).areWellImplemented();
    }
}