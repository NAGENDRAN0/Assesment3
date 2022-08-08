package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver monk=new ChromeDriver();
		monk.get("http://leaftaps.com/opentaps/control/login");
		monk.manage().window().maximize();
		monk.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		monk.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		monk.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		monk.findElement(By.linkText("CRM/SFA")).click();
		monk.findElement(By.linkText("Create Contact")).click();
		monk.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Nagendran");
		monk.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("s");
		monk.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("nagen");
		monk.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("ss");
		monk.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("automation testing");
		monk.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("nagendran9@gmail.com");
		WebElement drive = monk.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
        Select d=new Select(drive);
        d.selectByVisibleText("Alabama");
        monk.findElement(By.xpath("//input[@type='submit']")).click();
        monk.findElement(By.linkText("Edit")).click();
        monk.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
        monk.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("abcde");
        monk.findElement(By.xpath("//input[@value='Update']")).click();
        String text1 = monk.findElement(By.id("sectionHeaderTitle_contacts")).getText();
        System.out.println(text1);
		
		
		
	}

}
