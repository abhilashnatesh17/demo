package Testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class Frame extends Base {
	public void frameHandling()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe=driver.findElement(By.id("a077aa5e")); 
		driver.switchTo().frame(iframe); // switch chythale navigate avoolu
		WebElement img=driver.findElement(By.xpath("//img[@src='Jmeter720.png']")); //tag frame nte olliel kiakunath kondu click chythalum navigate avila
		img.click();															// so iframe tag locate chythe athine switch chyenam ennale ath click cheyan patollu
	}

	public static void main(String[] args) {
		Frame frame= new Frame();
		frame.InitializesBrower();
		frame.frameHandling();
		
		
		

	}

}
