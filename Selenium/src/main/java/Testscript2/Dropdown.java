package Testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Testscript.Base;

public class Dropdown extends Base {
	public void dropdownhandling()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectcolour=driver.findElement(By.cssSelector("select#single-input-field"));
		
		Select select=new Select(selectcolour); //create select class, select class provide chyuna method ane selectByValue, selectByVisibleText,selectByIndex
		select.selectByValue("Red"); // evda attribute value ane edukande
		select.selectByVisibleText("Red"); // should take text value , text value ane edukande 
		select.selectByIndex(1); // index value start from 0 , evda select ane 0 , red 1, yellow 2, green 3
	}

	public static void main(String[] args) {
		
		Dropdown dropdown=new Dropdown();
		dropdown.InitializesBrower();
		dropdown.dropdownhandling();

	}

}
