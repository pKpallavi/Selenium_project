/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
public class kumonAboutUs {
     
    WebDriver driver;
    String baseUrl;
    
    public kumonAboutUs() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void kumonAboutUs() throws InterruptedException {
    
    System.out.println("kumon About Us"); 
           
    driver = new FirefoxDriver(); 
    if (driver == null) fail (" driver is not initialize");
    driver.get(baseUrl);
    
     driver.findElement(By.linkText("About Kumon")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("About Kumon".equals(driver.getTitle())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("li.sitemap-page-parent > a")).click();
    driver.findElement(By.linkText("See Details")).click();
    driver.findElement(By.cssSelector("a.bl-bigger")).click();
    driver.findElement(By.cssSelector("a.bl-bigger")).click();
    driver.findElement(By.cssSelector("a.bl-bigger")).click();
    
    //driver.findElement(By.linkText("About Kumon")).click();
   
    //driver.findElement(By.cssSelector("a[href='/about-kumon/kumon-method']")).click();
    // driver.findElement(By.linkText("The Kumon Method and Its Strengths")).click();
    //driver.findElement(By.cssSelector("h4")).click();
   // driver.findElement(By.linkText("1. Individualized Instruction")).click();
    //driver.findElement(By.linkText("2. Self-Learning")).click();
    //driver.findElement(By.linkText("3. Small-Step Worksheets")).click();
    //driver.findElement(By.linkText("4. Kumon Instructors")).click();
    driver.findElement(By.cssSelector("a > p")).click();
    driver.findElement(By.cssSelector("a > p")).click();
    driver.findElement(By.xpath("//body[@id='whats-kumon']/div[2]/div[3]/div/ul/li[2]/a/div[2]")).click();
    driver.findElement(By.cssSelector("article.link > a")).click();
    driver.findElement(By.linkText("Kumon's Goal")).click();
    driver.findElement(By.xpath("//body[@id='whats-kumon']/div[2]/div[3]/div/ul[2]/li[2]/a/div[2]")).click();
    driver.findElement(By.xpath("//body[@id='whats-kumon']/div[2]/div[3]/div/ul[2]/li[3]/a/div[2]")).click();
    driver.findElement(By.xpath("//body[@id='whats-kumon']/div[2]/div[2]/div[2]/div/ul[2]/li[4]/a/div[2]")).click();
    driver.findElement(By.xpath("//body[@id='whats-kumon']/div[2]/div[3]/div/ul[3]/li/a/div[2]")).click();
    driver.findElement(By.xpath("//body[@id='whats-kumon']/div[2]/div[3]/div/ul[3]/li[2]/a/div[2]")).click();
    driver.findElement(By.xpath("//body[@id='whats-kumon']/div[2]/div[3]/div/ul[3]/li[3]/a/div[2]")).click();
    driver.findElement(By.xpath("//body[@id='whats-kumon']/div[2]/div[3]/div/ul[3]/li[4]/a/div[2]")).click();
    driver.quit();
    
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurav\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
         baseUrl ="https://www.kumon.com/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
