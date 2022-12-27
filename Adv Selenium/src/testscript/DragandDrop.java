package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		System.setProperty("webdriver.gecko.driver", "./Sele/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src = driver.findElement(By.id("box3"));
		WebElement dst = driver.findElement(By.id("box103"));
		WebElement src1 = driver.findElement(By.id("box2"));
		WebElement dst1 = driver.findElement(By.id("box102"));
		WebElement src2 = driver.findElement(By.id("box1"));
		WebElement dst2 = driver.findElement(By.id("box101"));
		WebElement src3 = driver.findElement(By.id("box4"));
		WebElement dst3 = driver.findElement(By.id("box104"));
		WebElement src4 = driver.findElement(By.id("box5"));
		WebElement dst4 = driver.findElement(By.id("box105"));
		WebElement src5 = driver.findElement(By.id("box6"));
		WebElement dst5 = driver.findElement(By.id("box106"));
		WebElement src6 = driver.findElement(By.id("box7"));
		WebElement dst6 = driver.findElement(By.id("box107"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(src, dst).perform();
		Thread.sleep(2000);
		a.dragAndDrop(src1, dst1).perform();
		Thread.sleep(2000);
		a.dragAndDrop(src2, dst2).perform();
		Thread.sleep(2000);
		a.dragAndDrop(src3, dst3).perform();
		Thread.sleep(2000);
		a.dragAndDrop(src4, dst4).perform();
		Thread.sleep(2000);
		a.dragAndDrop(src5, dst5).perform();
		Thread.sleep(2000);
		a.dragAndDrop(src6, dst6).perform();
		Thread.sleep(2000);
		driver.close();
}}
