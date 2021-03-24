package week2.day1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) throws IOException {
		//setup chrome driver
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://www.leafground.com/pages/table.html");
		//Maximize the browser
		driver.manage().window().maximize();
		List<WebElement> Tr = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println(Tr.size());
		
		List<WebElement> Mentorname = driver.findElements(By.xpath("//table[@id='table_id']//tr//td[5]"));
		for (WebElement Mentor : Mentorname) {
			System.out.println(Mentor.getText());
		}
		List<WebElement> Mentorname1 = driver.findElements(By.xpath("//table[@id='table_id']//tr//td[2]"));
		for (WebElement Mentor : Mentorname1) {
			System.out.println(Mentor.getText());
		
		}
WebElement checkbox = driver.findElement(By.xpath("//td[text()='30%']/following::input"));
checkbox.click();
System.out.println(checkbox.isSelected());

/*driver.get("http://leafground.com/home.html");
*File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
*File file  = new File("snap1.jpg");
*FileUtils.copyFile(screenshotAs,file);
*/


}
}
