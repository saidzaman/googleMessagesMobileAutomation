package setups;

import com.testinium.deviceinformation.DeviceInfo;
import com.testinium.deviceinformation.DeviceInfoImpl;
import com.testinium.deviceinformation.device.DeviceType;
import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.model.Device;
import helpers.GlobalVariables;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

//This file is for setting up Android Driver capabilities

public class Capabilities {

    public DesiredCapabilities android() throws IOException, DeviceNotFoundException {
        DesiredCapabilities androidCapabilities = new DesiredCapabilities();
        DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ANDROID);

        Device device = deviceInfo.getFirstDevice();

        System.out.println("Platform Name: " + device.getDeviceProductName());
        System.out.println("Platform Version: " + device.getProductVersion());
        System.out.println("Device Name: " + device.getModelNumber());
        System.out.println("Device UDID: " + device.getUniqueDeviceID());

        androidCapabilities.setCapability("platformName", device.getDeviceProductName());
        androidCapabilities.setCapability("platformVersion", device.getProductVersion());
        androidCapabilities.setCapability("deviceName", device.getUniqueDeviceID());
        androidCapabilities.setCapability("appPackage", "com.google.android.apps.messaging");
        androidCapabilities.setCapability("appActivity","com.google.android.apps.messaging.ui.ConversationListActivity");

        return androidCapabilities;
    }
}
