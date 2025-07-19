
package com.example.myapp;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Jenkins World!");
        App app = new App();
        System.out.println("Result: " + app.getMessage());
    }
    
    public String getMessage() {
        return "Welcome to DevOps with Jenkins and Maven!";
    }
    
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
