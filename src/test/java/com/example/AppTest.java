package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Category(TestGroups.Add.class)
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
        assertEquals(313, app.add(25, 288));
        assertEquals(1025, app.add(347, 678));
    }

    @Category(TestGroups.Subtract.class)
    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(1, app.sub(3, 2));
        assertEquals(263, app.sub(288, 25));
        assertEquals(331, app.sub(678, 347));
    }

    @Category(TestGroups.Multiply.class)
    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals(6, app.multiply(2, 3));
        assertEquals(7200, app.multiply(25, 288));
        assertEquals(235266, app.multiply(347, 678));
    }
}
