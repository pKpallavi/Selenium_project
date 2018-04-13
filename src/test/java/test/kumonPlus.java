/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
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
public class kumonPlus {
    WebDriver driver;
    String baseUrl;
    
    public kumonPlus() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void kumonPlus() {
    System.out.println("kumon plus"); 
           
    driver = new FirefoxDriver(); 
    if (driver == null) fail (" driver is not initialize");
                
    driver.get(baseUrl);
    driver.findElement(By.linkText("kumon+")).click();
        String text = driver.findElement(By.tagName("title")).getText();
        System.out.println("title"+text);
//    driver.findElement(By.id("lblRegistrationText1")).click();
//    driver.findElement(By.id("txtFirstName")).clear();
//    driver.findElement(By.id("txtFirstName")).sendKeys("abc");
//    driver.findElement(By.id("txtLastName")).clear();
//    driver.findElement(By.id("txtLastName")).sendKeys("xyz");
//    new Select(driver.findElement(By.id("ddlCountry"))).selectByVisibleText("US");
//    driver.findElement(By.id("btnRegister")).click();
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
