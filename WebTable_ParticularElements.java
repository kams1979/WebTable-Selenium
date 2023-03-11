package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_ParticularElements {
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		  driver.manage().window().maximize();
		  //Particular Elements
		  WebElement findElement = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
		  String text = findElement.getText();
		  System.out.println(text);
		  
		
	}
 
  
}
