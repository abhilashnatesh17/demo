package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	
	// these methods are Relative xpath method
	
	public void xpath()
	{
		// xpath syntax - //tag[@attribute='value']
		
		/* 
			// :-Select current node , tag ahne suchipikan vendita // enn kodukune
			@ :-Selects attribute , attribute ariyan vendi ane @ kodukune
			[]=to filter elements based on conditions.
		 */
		
		WebElement xpath=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement xpath1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement xpath2=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement xpath3=driver.findElement(By.xpath("//div[@id='message-two']"));
	}

	public void contains()
	{
		//contains syntax -  //tag[contains(@attribute,'value')]  
		WebElement contains=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement contains1=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement contains2=driver.findElement(By.xpath("//button[contains(@id,'button-t')]")); // full value kodukanam enn ila korach koduthalum identify chyum or athupole value starting thane edukanam enn ila ending korach words koduthalum varum
		WebElement contains3=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
	}
	public void startsWith()
	{
		//startsWith() syntax -  //tag[starts-with(@attribute,'value')]	
		WebElement startswith=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]")); //evida varumbo starting thane koduknam , Ending koduthilankilum no issue
		WebElement startswith1=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		WebElement startswith2=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement startswith3=driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
		
	}
	public void text()
	{
		//text syntax -  //tag[text()='text']
		WebElement text=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement text1=driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement text2=driver.findElement(By.xpath("//label[text()='Enter value B']"));
	}
	public void and()
	{
		
		//and() syntax - //tag[@attribute='value' and @attribute='value']
		
		WebElement and=driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		WebElement and1=driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
		WebElement and2=driver.findElement(By.xpath("//input[@type='text' and @id='value-a']"));
		WebElement and3=driver.findElement(By.xpath("//input[@type='text' and @id='value-b']"));
		
	}
	public void or()
	{
		//or() syntax - //tag[@attribute='value' or @attribute='value']
		
		WebElement or=driver.findElement(By.xpath("//button[@type='button' or @id='button-one']"));
	}
	public static void main(String[] args) {
		

	}

}
