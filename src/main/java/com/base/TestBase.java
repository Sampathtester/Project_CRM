package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.model.Driver;

public class TestBase {

	FileInputStream file;
	public static Properties props;

	public WebDriver driver;

	public TestBase() {

		props = new Properties();

		try {

			file = new FileInputStream("./src/main/java/com/propertiesConfig/Propfile");
		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			props.load(file);
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void Setup() {
		String browsername = props.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("edge")) {
			driver = new FirefoxDriver();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(props.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
