// File: src/test/java/com/example/myapp/AppTest.java
package com.example.myapp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    
    public AppTest(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }
    
    public void testApp() {
        assertTrue(true);
    }
    
    public void testGetMessage() {
        App app = new App();
        String result = app.getMessage();
        assertNotNull(result);
        assertTrue(result.contains("Welcome"));
    }
    
    public void testAddNumbers() {
        App app = new App();
        assertEquals(5, app.addNumbers(2, 3));
        assertEquals(10, app.addNumbers(7, 3));
    }
}
