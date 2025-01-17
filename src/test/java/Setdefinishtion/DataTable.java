
package Setdefinishtion;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable {
WebDriver driver;
	
	@Given("User is on Loginpage")
	public void user_is_on_loginpage() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   driver=new ChromeDriver();
	   Thread.sleep(3000);
	   driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	
	}

	@When("User enters username & password")
	public void user_enters_username_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	List<List<String>>data=dataTable.cells();
	
	driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
	
	 Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}



	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    driver.findElement(By.id("submit")).click();
	}

	@Then("User verifies the title")
	public void user_verifies_the_title() throws InterruptedException {
	   System.out.println("titel of the page"+driver.getTitle());
	Thread.sleep(2000);
	}
	@Then("User click on Sign up button")
	public void user_click_on_sign_up_button() {
	   driver.findElement(By.id("signup")).click();
	}

	@Then("User is entering personal info")
	public void user_is_entering_personal_info(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>>data1=dataTable.cells();
		
		driver.findElement(By.id("firstName")).sendKeys(data1.get(0).get(1));
		
		driver.findElement(By.id("lastName")).sendKeys(data1.get(1).get(1));
		
		driver.findElement(By.id("email")).sendKeys(data1.get(2).get(1));
		
		driver.findElement(By.id("password")).sendKeys(data1.get(3).get(1));
	}

	@Then("User click on Submit button")
	public void user_click_on_submit_button() {
	   driver.findElement(By.id("submit")).click();
	}

}
