package seleniumwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Miniproject {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajis\\eclipse-workspace\\Seleniumpractise\\ChromeDriver\\chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	ChromeOptions incog = op.addArguments("incognito");
	
	WebDriver driver = new ChromeDriver(incog);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
	WebElement signinbutton = driver.findElement(By.xpath("//a[@class='login']"));
	signinbutton.click();
	
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("balajidstestengineer@gmail.com");
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
	pass.sendKeys("Sivan@1995");
	
	WebElement login = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	login.click();
	
	
	Actions ac = new Actions(driver);
	WebElement womenbutt = driver.findElement(By.xpath("//a[text()='Women']"));
	ac.moveToElement(womenbutt).build().perform();;
	
	WebElement tshirtbut = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
	tshirtbut.click();
	
	WebElement dressimage = driver.findElement(By.xpath("//a[@class='quick-view-mobile']"));
	
	ac.moveToElement(dressimage).build().perform();
	ac.click(dressimage).build().perform();;
	WebElement iframeaddtocart = driver.findElement(By.xpath("//iframe[@vspace='0']"));
	driver.switchTo().frame(iframeaddtocart);
	WebElement addtocartbutt = driver.findElement(By.xpath("//button[@name='Submit']"));
	addtocartbutt.click();
	driver.switchTo().defaultContent();
	
	WebElement proceedtocheckbutt = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
proceedtocheckbutt.click();
WebElement proceedtocheck2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
proceedtocheck2.click();
WebElement proceedbut3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
proceedbut3.click();
WebElement checkboxagree = driver.findElement(By.xpath("//input[@type='checkbox']"));
checkboxagree.click();

WebElement proceedbut4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
proceedbut4.click();

WebElement payonbankbutton = driver.findElement(By.xpath("(//a[contains(text(),'Pay ')])[1]"));
payonbankbutton.click();
WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
confirmorder.click();



}
}
