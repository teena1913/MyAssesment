package assignment2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editlead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
	   driver.get("http://leaftaps.com/opentaps/contol/login");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.findElement(By.id("username")).sendKeys("demoSalesManager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Find Leads")).click();
       driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Infanteena");
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       driver.findElement(By.linkText("10761")).click();
      String title = driver.getTitle();
  	  System.out.println(title);
     driver.findElement(By.linkText("Edit")).click();
     driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
     driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("tcs");
    driver.findElement(By.className("smallSubmit")).click();
	if(driver.getTitle().contains("tcs")) {
	System.out.println("the name is  changed ");	
	}
	else{
		System.out.println("the name is not changed");
	}

}
	}


