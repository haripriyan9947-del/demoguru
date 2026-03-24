package demoguruSample1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Driver Files\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/");
		driver.findElement(By.linkText("New Tours")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Name:    ");
		String Firstname = sc.nextLine();
		driver.findElement(By.name("firstName")).sendKeys(Firstname);
		
		System.out.println("Last Name:   ");
		String Lastname = sc.nextLine();
		driver.findElement(By.name("lastName")).sendKeys(Lastname);
		
		System.out.println("Phone:       ");
		String Phonenumber = sc.nextLine();
		driver.findElement(By.name("phone")).sendKeys((Phonenumber));
		
		System.out.println("Email:     ");
		String Emailid = sc.nextLine();
		driver.findElement(By.name("userName")).sendKeys(Emailid);
		
		System.out.println("Address:     ");
		String Addresses = sc.nextLine();
		driver.findElement(By.name("address1")).sendKeys(Addresses);
		
		System.out.println("City:     ");
		String city = sc.nextLine();
		driver.findElement(By.name("city")).sendKeys(city);
		
		System.out.println("State/Province:      ");
		String state = sc.nextLine();
		driver.findElement(By.name("state")).sendKeys(state);
		
		System.out.println("Postal Code:     ");
		String code = sc.nextLine();
		driver.findElement(By.name("postalCode")).sendKeys(code);
		
		WebElement dropdown = driver.findElement(By.name("country"));
		Select dropdown1 =new Select(dropdown);
		dropdown1.selectByValue("INDIA");
		
		System.out.println("User Name:    ");
		String username = sc.nextLine();
		driver.findElement(By.name("email")).sendKeys(username);
		
		System.out.println("Password:    ");
		String password = sc.nextLine();
		driver.findElement(By.name("password")).sendKeys(password);
		
		System.out.println("Confirm Password:    ");
		String confirmpassword = sc.nextLine();
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.name("submit")).click();
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
