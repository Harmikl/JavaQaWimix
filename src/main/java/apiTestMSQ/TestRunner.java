package apiTestMSQ;

import apiTests.APITest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * created by maksimkharmak , 22.08.21
 */
    @RunWith(JUnitPlatform.class)
    @SelectClasses(APITest.class)
    public class TestRunner {
    }

