package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGetMessage() {
        String result = App.getMessage();
        assertEquals("Hello from Jenkins + Maven CI/CD!", result);
        System.out.println("Test passed!");
    }
}
