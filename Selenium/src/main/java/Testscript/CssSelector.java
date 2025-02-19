package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {

	public void tag_and_Id()
	{
		//Syntax - tag#id
		
		WebElement tagid1=driver.findElement(By.cssSelector("button#button-one")); //tag and attribute id ollile varuna text ane edukunath
		WebElement tagid2=driver.findElement(By.cssSelector("button#button-two"));
		WebElement tagid3=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagid4=driver.findElement(By.cssSelector("div#messag	e-one"));
	}
	public void tag_and_Class()
	{
		//Syntax - tag.class
		
		WebElement tagclass1=driver.findElement(By.cssSelector("div.header-top")); //tag and attribute class ollile varuna text ane edukunath
		WebElement tagclass2=driver.findElement(By.cssSelector("div.top-logo"));
		WebElement tagclass3=driver.findElement(By.cssSelector("div.mb-sec"));
	}
	public void tag_and_Attribute()
	{
		//Syntax - tag[attribute=value]
		
		WebElement tagattribute1=driver.findElement(By.cssSelector("button[id='button-one']")); //any attribute can be taken but id edukumbo kore unique ayite kitum
		WebElement tagattribute2=driver.findElement(By.cssSelector("button[id='button-two']"));
		WebElement tagattribute3=driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement tagattribute4=driver.findElement(By.cssSelector("div[id='message-one']"));
		
	}
	public void tag_Class_and_Attribute()
	{
		//Syntax - tag.classname[attribute=value]
		
		WebElement tagclassname1=driver.findElement(By.cssSelector("input.form-control[id='single-input-field']")); // tag.classname(eg:class attribute value)[attribute=value]
		WebElement tagclassname2=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement tagclassname3=driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
		WebElement tagclassname4=driver.findElement(By.cssSelector("div.my-2[id='message-one']"));
	}
	public static void main(String[] args) {
		
	}

}
