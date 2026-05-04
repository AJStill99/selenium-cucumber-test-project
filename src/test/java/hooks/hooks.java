package hooks;

import base.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class hooks extends DriverManager {

    @Before
    public void before() {
        setup();
    }

    @After
    public void after() {
        teardown();
    }
}
