package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Desktoppage {
	WebDriver driver;
	By desktop = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By all = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a");
	By product = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[1]/a/img");
	By numbers = By.xpath("//*[@id=\"input-limit\"]");
	By sorting = By.xpath("//*[@id=\"input-sort\"]");
	By product1 = By.xpath("//*[@id=\"content\"]/div[4]/div[6]/div/div[1]/a/img");
	By wishcomponent = By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]/i");

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\PROJECT-CTS\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void HomePage() // using webdriver get visting the testing website
	{
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}

	public void desktopselect() {
		driver.findElement(desktop).click();
		driver.findElement(all).click();
	}

	public void item() {
		driver.findElement(product).click();
		driver.close();
	}

	public void shownumbers() throws InterruptedException {
		WebElement a = driver.findElement(numbers);
		a.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		driver.close();
	}

	public void sorting() throws InterruptedException {
		WebElement a = driver.findElement(sorting);
		a.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		driver.close();
	}

	public void wish() {
		driver.findElement(product1).click();
		driver.findElement(wishcomponent).click();
		driver.close();
	}

}
