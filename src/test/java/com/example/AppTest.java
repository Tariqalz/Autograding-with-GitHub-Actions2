package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
        assertEquals(313, app.add(25, 288));
        assertEquals(1025, app.add(347, 678));
    }
}
