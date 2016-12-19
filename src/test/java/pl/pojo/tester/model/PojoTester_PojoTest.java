package pl.pojo.tester.model;

import org.junit.Test;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;


public class PojoTester_PojoTest {

    @Test
    public void testPojo() {
        assertPojoMethodsFor(Pojo.class).areWellImplemented();
    }

}