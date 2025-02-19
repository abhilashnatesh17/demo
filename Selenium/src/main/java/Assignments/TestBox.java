package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestBox extends BrowserInitilazation{
	
	public void testBoxForm()
	{
		driver.get("https://demoqa.com/text-box");
		WebElement name=driver.findElement(By.id("userName"));
		name.sendKeys("ABHI");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("abcd@gmail.com");
		
		WebElement currentaddress=driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("Park Centre, Technopark Campus, Thiruvananthapuram, Kerala 695581");
		
		WebElement permanentaddress=driver.findElement(By.id("permanentAddress"));
		permanentaddress.sendKeys("TechnoPark Phase II, Service Rd, Kulathoor, Thiruvananthapuram, Kerala 695583");
		
		WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
	}
		
	public static void main(String[] args) {
		TestBox testbox=new TestBox();
		testbox.browser();
		testbox.testBoxForm();

	}

}
