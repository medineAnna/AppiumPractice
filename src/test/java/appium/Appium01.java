package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium01 {
    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        //capabilities.setCapability("platformName","android");
        //capabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); //appium
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel13");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"/Users/medineannamammedova/AppiumPractice/src/app/app-release.apk");

        AndroidDriver<MobileElement> driver =new AndroidDriver<MobileElement>(new URL("http://127.0.0.1/ad/hub"),capabilities);
    }
}
