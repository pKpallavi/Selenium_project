/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
     public void mousehover() {
         
         System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
                if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
                 
                WebDriverWait wait = new WebDriverWait(driver, 10);
                WebElement ele=driver.findElement(By.xpath(".//*[@id='head-nav']/ul/li[2]/a"));
               
               // ele.click();
                
               Actions act=new Actions(driver);
    
             
             
               act.moveToElement(ele).perform();
               
               System.out.println("Font color of How Kumon works after mouse hover : "+ele.getCssValue("color"));
               System.out.println("Font size of How Kumon works after mouse hover: "+ele.getCssValue("font-size"));
               //System.out.println("Font of How Kumon works after mouse hover: "+ele.getCssValue("background-color"));
               
              // String color=driver.findElement(By.linkText("ATTEND ORIENTATION")).getCssValue("color");
               //System.out.println(color);
               
                WebElement bcolor=driver.findElement(By.linkText("Own a Franchise"));
                
               System.out.println("background color of Own a Franchise before mouse hover : "+bcolor.getCssValue("background-color"));
               
                Actions butcolor=new Actions(driver);
               
               butcolor.moveToElement(bcolor).perform();
               
               System.out.println("background color of Own a Franchise after mouse hover : "+bcolor.getCssValue("background-color"));
               
         
          
               
               //assertEquals
               //ele.getCssValue(ele);
               
              //String color = driver.findElement(By.xpath(".//*[@id='head-nav']/ul/li[2]/a")).getCssValue("color");
               
               //System.out.println("Color: " + color); 
                
     
     }
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
        System.setProperty("webdriver.gecko.driver", "C:\\Data\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        baseUrl ="https://www.kumon.com/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
}
