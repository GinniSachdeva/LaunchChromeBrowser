package launchBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver",
			"C:\\DXC Selenium Automation Class\\LaunchChromeBrowser\\SeleniumBrowserJars\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	driver.quit();
	}

}
