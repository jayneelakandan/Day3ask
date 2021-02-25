package org.test.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\NEELAKANDAN\\DayThreeTask\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.findElement(By.xpath("//span[@title='Trainer']")).click();
	WebElement txt1=driver.findElement(By.xpath("//p[contains(text(),'currently focuses on teaching')]"));
	String text1=txt1.getText();
	driver.close();
	System.out.println(text1);

}
}
