package stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {WebDriver driver = BaseClass.driver;

@Given("^User has launched the SwagLabs Application$")
public void user_has_launched_the_swaglabs_application() throws Throwable {
	
	 driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    
}

@Given("^User is on the home page$")
public void user_is_on_the_home_page() throws Throwable {
	WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
	ProductPageTitle.isDisplayed();
   
}

@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_something_and_something(String standard_user, String secret_sauce) throws Throwable {
	
	WebElement UserName = driver.findElement(By.xpath("//*[@id = 'user-name']"));
    UserName.sendKeys(standard_user);
    WebElement Password = driver.findElement(By.xpath("//*[@id = 'password']"));
    Password.sendKeys(secret_sauce); 
    
}

@When("^User select the \"([^\"]*)\"$")
public void user_select_the_something(String product) throws Throwable {
	WebElement btnProductSelect = driver.findElement(By.xpath("//*[text()='" + product + "']//following::button[1]"));
	btnProductSelect.click();
   
}

@Then("^User should be able to see homepage$")
public void user_should_be_able_to_see_homepage() throws Throwable {
	WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
	ProductPageTitle.isDisplayed();
    
}

@Then("^Product added successfully to the cart$")
public void product_added_successfully_to_the_cart() throws Throwable {
   
}

@Then("^User should be able to see products in the cart$")
public void user_should_be_able_to_see_products_in_the_cart() throws Throwable {
   
}

@And("^User click on the login button$")
public void user_click_on_the_login_button() throws Throwable {
	
	WebElement LoginButton = driver.findElement(By.xpath("//*[@id = 'login-button']"));
	LoginButton.click();
    
}

@And("^Click on Add to cart button$")
public void click_on_add_to_cart_button() throws Throwable {
 	WebElement AddCartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	AddCartLink .click();
    
   
}

@And("^User select products and add to the cart$")
public void user_select_products_and_add_to_the_cart(DataTable table) throws Throwable {
	
	String product1 = table.cell(0, 0);
	String product2 = table.cell(1, 0);
	String product3 = table.cell(2, 0);
	
	WebElement btnProductSelect1 = driver.findElement(By.xpath("//*[text()='" + product1 + "']//following::button[1]"));
	btnProductSelect1.click();
	WebElement btnProductSelect2 = driver.findElement(By.xpath("//*[text()='" + product2 + "']//following::button[1]"));
	btnProductSelect2.click();
	WebElement btnProductSelect3 = driver.findElement(By.xpath("//*[text()='" + product3 + "']//following::button[1]"));
	btnProductSelect3.click();
    
    
} }
