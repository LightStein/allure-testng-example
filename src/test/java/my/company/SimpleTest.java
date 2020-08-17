package my.company;

import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

/**
 * @author baev (Dmitry Baev)
 */
public class SimpleTest {

    @Test
    public void simpleTest() {
        step("step 1");
        step("step 2");
        System.out.println(System.getProperty("user.dir"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}

