package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandling {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pramoth\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();              
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/"); 
		
		WebElement dropDown=driver.findElement(By.xpath("//div[@class='information closable']/following-sibling::p/child::select"));
		
//		dropDown.click();

//		Actions action =new Actions(driver);
//		
//		action.moveToElement(dropDown);
		
		List<WebElement> options=dropDown.findElements(By.tagName("option"));
		
		for(WebElement option: options) {
			
			if(option.getText().equals("India")) {
				option.click();
				
			System.out.println(option.getText());
				
			}
			
		}
	}

}
