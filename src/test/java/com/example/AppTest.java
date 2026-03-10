package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testNetSalary() {
        double result = App.calculateNetSalary(50000);
        assertEquals(62500.0, result, 0.01);
    }
}
