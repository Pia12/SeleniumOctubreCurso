package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	static WebDriver driver;

	public static void main(String[] args) {
		//* creando objetos de la clase chromedirver
		// opciones que inice de modo incognito
		ChromeOptions opcion = new ChromeOptions();
		// inice modo incogniyo yy maximzado
		opcion.addArguments("--incognito");
		opcion.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver(opcion);
	    
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.close();
	}

}
