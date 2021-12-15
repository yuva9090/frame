package org.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//URL PASSING

		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		//XPATH FOR FRAME
		driver.switchTo().frame(0);

		WebElement frame = driver.findElement(By.xpath("//button[@id='Click']"));
		frame.click();
		
		//MOVING NEXT FRAME USING THIS DEFAULT CONTENT METHODS

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		
//XPATH FOR NESTED FRAME
		
		WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click1']"));

		frame1.click();
		
		
		driver.switchTo().defaultContent();
		
		//FIND TOTAL NUM OF FRAMES USING (findelements)
		
		
List<WebElement> framesize = driver.findElements(By.tagName("iframe"));
int size = framesize.size();	

System.out.println("The Frame size is :"+size);
	}

}
