package Testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class Checkbox extends Base {
	public void singleCheckBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement single=driver.findElement(By.id("gridCheck"));
		single.click();
	}
	public void singleCheckBox1()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement condition=driver.findElement(By.id("gridCheck"));
		
		if(condition.isSelected())
		{
			System.out.println("Check box is checked");
		}
		else
		{
			condition.click();
			System.out.println("Check box is not checked");
		}
	}
	public static void main(String[] args) {
		Checkbox checkbox= new Checkbox();
		checkbox.InitializesBrower();
		//checkbox.singleCheckBox();
		checkbox.singleCheckBox1();
		
	}

}
