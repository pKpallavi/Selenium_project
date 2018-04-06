/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Saurav
 */
public class kumonContactUs {
WebDriver driver;
String baseUrl;
    
    public kumonContactUs() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void ContactUs() {
    
        
        System.out.println("contact us"); 
           
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
                
    driver.get(baseUrl);
    
    
    //driver.findElement(By.xpath("(.//[@href='contact-us'])")).click();
    //driver.findElement(By.linkText("Contact Us")).click();
    //By css = By.cssSelector("a[href='/docs/configuration']");
    //WebElement element = driver.findElement(css);
    //((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
    driver.findElement(By.cssSelector("a[href='contact-us']")).click();
    driver.findElement(By.cssSelector("a[href='https://kumongroup.com/eng']")).click();
    //driver.findElement(By.linkText("https://kumongroup.com/eng")).click();
    driver.findElement(By.cssSelector("p.inqLink > a.bl-bigger")).click();
    driver.findElement(By.id("ms")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("abc");
    driver.findElement(By.name("email2")).clear();
    driver.findElement(By.name("email2")).sendKeys("abc@xyz.com");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("abc@xyz.com");
    driver.findElement(By.name("Country")).clear();
    driver.findElement(By.name("Country")).sendKeys("usa");
    driver.findElement(By.name("City")).clear();
    driver.findElement(By.name("City")).sendKeys("Illinois");
    driver.findElement(By.name("CountryCode")).clear();
    driver.findElement(By.name("CountryCode")).sendKeys("+1");
    driver.findElement(By.name("tel")).clear();
    driver.findElement(By.name("tel")).sendKeys("2241234567");
    driver.findElement(By.name("inquiry")).clear();
    driver.findElement(By.name("inquiry")).sendKeys("how many kumon franchises are there in illinois?");
    driver.findElement(By.name("post_flg")).click();
    driver.findElement(By.cssSelector("div.submit.confirm > input[type=\"submit\"]")).click();
                
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Data\\geckodriver-v0.19.1-win64\\geckodriver.exe");
         baseUrl ="https://www.kumon.com/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
}
