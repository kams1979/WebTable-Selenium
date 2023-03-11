package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificColumn {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	  driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	  driver.manage().window().maximize();
	  //All Elements
	  List<WebElement> findElement = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
	  for (WebElement webElement : findElement) {
		  System.out.println(webElement.getText());
}
}
}