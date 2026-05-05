package hooks;

import base.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class GlobalHooks extends DriverManager { // The extends give us access to the DriverManager class in a clean way

    @Before
    public void before() {
        setup();
    }

    @After
    public void after() {
        teardown();
    }
}

// This is the global set-up
