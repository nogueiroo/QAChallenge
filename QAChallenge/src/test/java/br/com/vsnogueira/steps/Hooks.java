package br.com.vsnogueira.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before

	public void OpenBroswer() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
