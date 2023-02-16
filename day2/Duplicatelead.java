package assignment2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/contol/login");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	       driver.findElement(By.id("password")).sendKeys("crmsfa");
	       driver.findElement(By.className("decorativeSubmit")).click();
	       driver.findElement(By.linkText("CRM/SFA")).click();
	       driver.findElement(By.linkText("Leads")).click();
	       driver.findElement(By.linkText("Find Leads")).click();
	       driver.findElement(By.linkText("Email")).click();
	       driver.findElement(By.name("emailAddress")).sendKeys("malathymalu04@gmail.com");
	       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	       driver.findElement(By.linkText("10074")).click();
	       //driver.findElement(By.linkText("Duplicate Lead")).click();
	      
		  //  System.out.println(title);
	      // driver.findElement(By.linkText("Create Lead")).click();
	      
	}

}
