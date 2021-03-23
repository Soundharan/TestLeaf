package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/LookupLeads?id=&parm0=LookupLeads");
		String text = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']")).getText();
		System.out.println(text);
		
		
		//driver.findElement(By.xpath("//input[@id='username']"));
		//driver.findElement(By.xpath("//input[@id='password']"));
		//driver.findElement(By.xpath("//input[@value='Login']"));
		//driver.findElement(By.xpath("//div[@id='label']//a[1]"));
		//driver.findElement(By.xpath("//a[text()='Leads']"));
		//driver.findElement(By.xpath("//a[text()='Merge Leads']"));
		//driver.findElement(By.xpath("//a[text()='Merge Leads']"));
		//driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]"));
		
		//driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]"));
		//driver.findElement(By.xpath("(//a[text()='Merge']"));
		
		
		
		
		
		

	}

}
