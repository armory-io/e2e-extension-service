package io.armory.e2e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtensionGreetingAppTest {
    @Test void appHasAGreeting() {
        ExtensionGreetingApp classUnderTest = new ExtensionGreetingApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
