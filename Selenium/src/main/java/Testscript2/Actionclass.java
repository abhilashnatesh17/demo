package Testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Testscript.Base;

public class Actionclass extends Base {
	
	public void action()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop=driver.findElement(By.id("mydropzone"));
		Actions action=new Actions(driver);	//mouse movement cheyunath kondu construtor parameter value pass cheyanam , construtor parameter value ane driver
		action.dragAndDrop(drag, drop).build().perform(); //drag and drop cheyan and build().perform() kode call chythalee eth wrk chyollu
		action.contextClick(drag).build().perform();//right click cheyan
		action.moveToElement(drag).build().perform();// mouse over cheyan
		action.doubleClick(drag).build().perform(); // doule click cheyan
	}

	public static void main(String[] args) {
		
		Actionclass actionclass=new Actionclass();
		actionclass.InitializesBrower();
		actionclass.action();
		

	}

}
