package Setdefinishtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
	WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver=new ChromeDriver();
		   Thread.sleep(3000);
		   driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
	}
	
	@When("User clicking on signup button")
	public void user_clicking_on_signup_button() throws InterruptedException {
	driver.findElement(By.id("signup")).click();
	Thread.sleep(3000);
	}

	@Then("user entering email ID and password")
	public void user_entering_email_id_and_password() throws InterruptedException {
	    driver.findElement(By.id("email")).sendKeys("rushabh@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys("Rushabh@123");
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
	   driver.findElement(By.id("submit")).click(); 
	   Thread.sleep(3000);
	   driver.close();
	}

	@Then("user entering firstname and lastname")
	public void user_entering_firstname_and_lastname() throws InterruptedException {
	   driver.findElement(By.id("firstName")).sendKeys("Batch24");
	   Thread.sleep(3000);
	   driver.findElement(By.id("lastName")).sendKeys("Bugsupooter");
	}

	@Then("user click on cancel button")
	public void user_click_on_cancel_button() throws InterruptedException {
	    driver.findElement(By.id("cancel")).click();
	    Thread.sleep(3000);
	    driver.close();
	}
}
