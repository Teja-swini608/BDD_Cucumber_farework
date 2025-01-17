package Setdefinishtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hook {
WebDriver driver;
	
   @Before
public void brfore() throws InterruptedException {
	   
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   
	driver=new ChromeDriver();
	driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	System.out.println("before method");
}
   
   @After
   public void after() {
	driver.close();
	System.out.println("after method");
   }


   @Given("User is on lpage")
   public void user_is_on_lpage() {
       System.out.println("user is on login page");
   }

 
	@When("User enters email")
	public void user_enters_email() {
    driver.findElement(By.id("email")).sendKeys("rushabha@gmail.com");    
	}
	

	@When("user entering password")
	public void user_entering_password() throws InterruptedException {
		 driver.findElement(By.id("password")).sendKeys("Rushabha@123");
		   Thread.sleep(3000); 
	}

	@Then("User is click on submit button")
	public void user_is_click_on_submit_button() throws InterruptedException {
		driver.findElement(By.id("submit")).click();  
		 Thread.sleep(3000); 
	}
	

	@Then("User is verifying the title of the page")
	public void user_is_verifying_the_title_of_the_page() {
	   System.out.println("titel of the page:- "+driver.getTitle()); 
	}







}
