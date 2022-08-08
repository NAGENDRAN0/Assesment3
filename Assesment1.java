package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assesment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeDriver goat=new ChromeDriver();
      goat.manage().window().maximize();
      goat.get("https://acme-test.uipath.com/login");
      goat.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
      goat.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
      goat.findElement(By.xpath("//button[@type='submit']")).click();
      System.out.println("URL"+goat.getCurrentUrl());
      goat.findElement(By.linkText("Log Out")).click();
      goat.close();
	}

}
