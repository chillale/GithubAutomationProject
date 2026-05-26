package pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlClass {
	public static WebDriver driver;

	public WebDriver url() {
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
		prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
		prefs.put("profile.default_content_setting_values.geolocation", 1);
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);

		options.addArguments("--use-fake-ui-for-media-stream");
		options.addArguments("--use-fake-device-for-media-stream");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://tayades.softmed.in/uat_billing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
