package proba_za_projekat07_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class otvaranje_stranice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//		driver.manage().window().maximize();

		driver.get("https://s.bootsnipp.com/iframe/Dq2X");

	}

}
