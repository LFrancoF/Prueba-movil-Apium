import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.junit.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class AppiumTest {

	static AppiumDriver<MobileElement> driverAppium;
	public static void main(String[] args) throws AssertionError{
		// TODO Auto-generated method stub
			try {
				openApp();
				System.out.println("Prueba finalizada: Ningun error");
			} catch (AssertionError ex) {
				System.out.println("Prueba finalizada: Errores encontrados: "+ex.getMessage());
			}
			
	}
	
	public static void openApp() throws AssertionError{
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("deviceName", "Galaxy M31");
			cap.setCapability("udid", "R58NB0XCQDT");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12");
			cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			cap.setCapability("appActivity", "Calculator");
			//URL url = new URL("http://0.0.0.0:4723/wd/hub");
			
			driverAppium = new AppiumDriver<MobileElement>(cap);
			
			MobileElement Button2 = driverAppium.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
			Button2.click();
			MobileElement Button5 = driverAppium.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
			Button5.click();
			MobileElement ButtonX = driverAppium.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
			ButtonX.click();
			Button2.click();
			Button5.click();
			MobileElement ButtonEqual = driverAppium.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
			ButtonEqual.click();
			
			Assert.assertEquals(driverAppium.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText(), "625");
			
			
			
			
	}

}
