package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assesment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver lucy=new ChromeDriver();
		lucy.get("http://leaftaps.com/opentaps/control/main");
		lucy.manage().window().maximize();
		lucy.findElement(By.id("username")).sendKeys("demosalesmanager");
		lucy.findElement(By.id("password")).sendKeys("crmsfa");
		lucy.findElement(By.className("decorativeSubmit")).click();
		lucy.findElement(By.linkText("CRM/SFA")).click();
		lucy.findElement(By.linkText("Leads")).click();
        lucy.findElement(By.linkText("Find Leads")).click();
        lucy.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("nagedran");
        lucy.findElement(By.xpath("(//button[@type='button'])[7]")).click();
        Thread.sleep(2000);
        lucy.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
        String  txt1 = lucy.findElement(By.id("sectionHeaderTitle_leads")).getText();
        System.out.println(txt1); 
        lucy.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
        lucy.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("NGNration");
        lucy.findElement(By.xpath("//input[@value='Update']")).click();
        lucy.close();
        
	}

}
