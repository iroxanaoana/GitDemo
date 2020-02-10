package maevenDemo;



import org.testng.annotations.Test;

public class SeleniumTest {

	public static void Connect() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	}
	
	@Test
	public void BrowserAutomation() {
		
		
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void elementsUI() {
		System.out.println("elementsUI");
		
	}

}
