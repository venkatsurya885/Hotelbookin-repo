package hotelbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	WebDriver driver;
	
	@Given("user lonchuss the booking website url")
	public void user_lonchuss_the_booking_website_url() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.get("https://www.booking.com");
	    driver.manage().window().maximize();
	}

	@When("go to login credensial resgister")
	public void go_to_login_credensial_resgister() {
	  driver.findElement(By.xpath("//a[@aria-label='Register an account']//span[@class='e4adce92df'][normalize-space()='Register']")).click();
	}

	@When("enter the valid gmail id")
	public void enter_the_valid_gmail_id() {
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("venkatsurya962@gmail.com");
	}

	@When("Click the continue gmail")
	public void click_the_continue_gmail() {
		 driver.findElement(By.xpath("//span[normalize-space()='Continue with email']")).click();
	}

	@Then("user should logging succesfully")
	public void user_should_logging_succesfully() {
		driver.findElement(By.xpath("//div[@class='access-container bui_font_body']"));
		
	   	}

}
