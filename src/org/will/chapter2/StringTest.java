package org.will.chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    public void testIndexOf_characterFound() {
        String testValue = "Today is Monday";
        int expectedValue = 4;
        int returnValue = testValue.indexOf('y');
        Assertions.assertEquals(expectedValue, returnValue);
    }

    @Test
    public void testIndexOf_characterNotFound() {
        String testValue = "Today is Monday";
        int expectedValue = -1;
        int returnValue = testValue.indexOf('z');
        Assertions.assertEquals(expectedValue, returnValue);
    }

    @Test
    public void testDivision() {
        double value1 = 9.0;
        double value2 = 18.0;
        double expectedValue = 2;
        Assertions.assertEquals(expectedValue, value2 / value1);
    }
}
