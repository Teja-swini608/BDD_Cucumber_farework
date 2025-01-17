package Setdefinishtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	  
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\tejas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@When("user enters username")
	public void user_enters_username() throws InterruptedException {
	 driver.findElement(By.id("email")).sendKeys("rushabha@gmail.com");  
	 Thread.sleep(3000);
	}

	@When("user enters password")
	public void user_enters_password() throws InterruptedException {
	   driver.findElement(By.id("password")).sendKeys("Rushabha@123");
	   Thread.sleep(3000);
	}

	@Then("user clicks on loginbutton")
	public void user_clicks_on_loginbutton() throws InterruptedException {
	 driver.findElement(By.id("submit")).click();  
	 Thread.sleep(3000);
	}

	@Then("user verifying the title")
	public void user_verifying_the_title() {
	 String title= driver.getTitle();
	 System.out.println("get titel:- "+title);
	
	}
	
	
	
	
}
