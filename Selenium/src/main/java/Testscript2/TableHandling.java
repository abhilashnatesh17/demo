package Testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class TableHandling extends Base{
	public void tablePrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']")); // 
		System.out.println(table.getText()); // .getText() use cheyunath text print cheyan vendi
	}
	public void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]")); // tbody enn paryunath row select chyunath then tr[2] means eth row ane edukande enn, tr[] 1 2 3 eth venamkilum kodukm
		System.out.println(row.getText());
	}
	public void cellPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]")); // td koduthath specific value kitan 
		System.out.println(cell.getText());
	}
	public void columnPrint()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]")); // findelements enn ane use chyadath.bcuz group ayite identify cheyan endite		
			
										//foreach syntax - for(datatype variable name : array or collection){} - in java
		for(WebElement list:column)		//foreach syntax - for(Interface variable name : element name){} - in selenium									
		{								
			System.out.println(list.getText());				// list<webelement> use chyunath onnile koduthal elements use chyunath kond selenium provide chyunath ane
		}
																			
	}
	public static void main(String[] args) {
		TableHandling tablehandling = new TableHandling();
		tablehandling.InitializesBrower();
		//tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		//tablehandling.cellPrinting();
		tablehandling.columnPrint();
	}

}	
