package setups;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import helpers.GlobalVariables;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.io.IOException;

// This class sets up the Android Driver as well as starts up and shuts down the Appium service

public class DriverSetup{
    private static AppiumDriver appiumDriver;
    private static AppiumDriverLocalService service;

    public static AppiumDriver getAppiumDriver(){
        return appiumDriver;
    }

    // This method initializes the Android Driver
    public static void setDriver() throws IOException, DeviceNotFoundException {
        switch (System.getProperty("device")){
            case "android":
                Capabilities capabilities = new Capabilities();
                appiumDriver = new AndroidDriver(service, capabilities.android());
                System.out.println("Driver: " + appiumDriver + " is running!");
                break;
        }
    }

    // This method starts up the Appium service
    public static void startAppium() throws IOException {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();

        System.out.println("Appium Service: " + service_url + " is running!");
    }

    // This method shuts down the Appium service
    public static void stopAppium(){
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service: " + service_url + " is stopped!");
        service.stop();
    }
}