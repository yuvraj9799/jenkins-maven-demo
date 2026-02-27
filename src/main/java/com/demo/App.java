package com.demo;

public class App {
    public static String getMessage() {
        return "Hello from Jenkins + Maven CI/CD!";
    }

    public static void main(String[] args) {
        System.out.println(getMessage());
        System.out.println("Build successful!");
    }
}
