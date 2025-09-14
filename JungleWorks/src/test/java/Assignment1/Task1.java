package Assignment1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
        Actions actions = new Actions(driver);

        // =============================
        // Step 1: Login
        // =============================
        WebElement Log = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[2]/div[2]/div/div/div/div/a/span"));
        Log.click();
        Thread.sleep(2000);
        System.out.println("Login button clicked"); 

        WebElement Mobile = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"));
        Mobile.sendKeys("soumyadeep1211s@gmail.com"); 
        Thread.sleep(2000);

        WebElement Continue = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button"));
        Continue.click();

        // Wait for OTP manually (automation cannot handle OTP)
        Thread.sleep(60000);

        // =============================
        // Step 2: Search for product
        // =============================
        WebElement Search = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/div/input"));
        Search.sendKeys("Belavita Perfume");
        Search.sendKeys(Keys.ENTER);
        System.out.println("Search submitted");

        // =============================
        // Step 3: Select first product
        // =============================
        WebElement Product1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]"));
        Product1.click();
        System.out.println("Product clicked");

        // Switch to new tab
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();

        String parentid = (String) it.next();
        String childid = (String) it.next();
        driver.switchTo().window(childid);
        System.out.println("Switched to product tab");

        // =============================
        // Step 4: Enter PIN and check availability
        // =============================
        Thread.sleep(10000);
        WebElement Pin = driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]"));
        Pin.sendKeys("144411");
        
        WebElement Check = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/span"));
        Check.click();
        Thread.sleep(5000);
        System.out.println("Pincode checked");

        // =============================
        // Step 5: Add to Cart
        // =============================
        WebElement Cart = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
        Cart.click();
        System.out.println("Product added to cart");

        // =============================
        // Step 6: Place Order
        // =============================
        Thread.sleep(10000);
        WebElement Place = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button/span"));
        Place.click();
        System.out.println("Proceeding to checkout");
        Thread.sleep(10000);

        // =============================
        // Step 7: Enter email and continue
        // =============================
        WebElement Con = driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button"));
        Con.click();
        System.out.println("Email entered and continued to payment");
        Thread.sleep(10000);
        
        // =============================
        // Step 8: Payment (Dummy)
        // =============================
                
        WebElement Bank=driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/section[1]/div/div/div/section/div/div[3]/div[1]/div/div/div/span"));
        Bank.click();
        Thread.sleep(5000);
        WebElement Pay=driver.findElement(By.xpath("//button[@class='Button-module_button__P7hTI font-m-semibold Button-module_neutral__OtiH- _8BvR7P']"));
        Pay.click();
        System.out.println("Automated the Checkout the process of Flipkart.");
        
        // =============================
        // Step 9: Close browser
        // =============================
        driver.quit();
    }
}
