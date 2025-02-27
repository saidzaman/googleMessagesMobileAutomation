package setups;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

// This class provides a before and after hook which executes before and after a test run.
public class Hook{
    @Before
    public void before() throws IOException, DeviceNotFoundException {
        System.setProperty("device", "android");
        DriverSetup.startAppium();
        DriverSetup.setDriver();
    }

    @After
    public void after(){
        DriverSetup.getAppiumDriver().quit();
        DriverSetup.stopAppium();
    }
}
