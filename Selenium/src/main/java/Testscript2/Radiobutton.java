package Testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class Radiobutton extends Base {

	public void radioButtonHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement button=driver.findElement(By.id("inlineRadio2"));
		button.click(); // select chyn vendi ola cmmt
		WebElement selectvalue=driver.findElement(By.id("button-one"));
		selectvalue.click();
		
	}
	public void radioButtonCondition()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement button1=driver.findElement(By.id("inlineRadio1"));
			
		if(button1.isSelected())
		{
			System.out.println("Radio button is selected"); // ee casil already select chythite ondo enn check chyuna condition ane koduthe.
		}
		else
		{	
			button1.click(); // click use chyunath kond evda nammale ane select chythe so ee condition ane wrk chyune
			System.out.println("Radio button is not selected");
		}
	}
	public static void main(String[] args) {
		Radiobutton radiobutton=new Radiobutton();
		radiobutton.InitializesBrower();
		radiobutton.radioButtonHandling();
		//radiobutton.radioButtonCondition();
	}

}
