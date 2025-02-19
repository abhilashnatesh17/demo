package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Radiobutton extends BrowserInitilazation {
	
	public void radioButton()
	{
			driver.navigate().to("https://demoqa.com/radio-button");
			WebElement radio=driver.findElement(By.xpath("//label[@for='yesRadio']"));
			radio.click();
	}
	public void radioCondition()
	{
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement condition=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		if(condition.isSelected())
		{
			System.out.println("Radio Button is selected");
		}
		else
		{
			condition.click();
			System.out.println("Radio Button is not selected");
		}
			
	}
	public static void main(String[] args) {
		Radiobutton radiobutton=new Radiobutton();
		radiobutton.browser();
		//radiobutton.radioButton();
		radiobutton.radioCondition();
				
	
	}

}
