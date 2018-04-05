/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Deepali
 */
public class downloadbrochure {
    
    WebDriver driver;
  String baseUrl;
    
    public downloadbrochure() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void hello() {
    
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
                if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
                 
                WebDriverWait wait = new WebDriverWait(driver, 10);
                
                driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/div[2]/a")).click();
                String Parentwindow=driver.getWindowHandle();
                for(String subwindow:driver.getWindowHandles())
                {
                  driver.switchTo().window(subwindow);
                  
                }
               // System.out.println(driver.findElement(By.cssSelector(".modal-title")).getText());
               String text=driver.findElement(By.cssSelector(".modal-title")).getText();
               System.out.println(text);
               assertEquals("Your child’s academic advantage starts here.", text);
               //driver.close(); 
                
                //driver.switchTo().window(Parentwindow);
                //driver.close();
                
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepali\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        baseUrl ="https://www.kumon.com/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
