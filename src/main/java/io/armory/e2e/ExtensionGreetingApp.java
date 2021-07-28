package io.armory.e2e;

public class ExtensionGreetingApp {
    public String getGreeting() {
        return "Extension Greeting.";
    }

    public static void main(String[] args) {
        System.out.println(new ExtensionGreetingApp().getGreeting());
    }
}
