package test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.apache.commons.lang3;
import org.apache.commons.lang3.StringEscapeUtils;

public class KumonMathProgram {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Data\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.kumon.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testKumonMathProgram() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        /*driver.findElement(By.linkText("PLAY VIDEO")).click();
    System.out.println("Play video link clicked");
    for (int second = 0;; second++) {
    	if (second >= 60) {fail("timeout"); System.out.println("Play button not found timeout"); return;}
    	try { if (isElementPresent(By.cssSelector("button.ytp-large-play-button.ytp-button"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    System.out.println("Play button found");
    driver.findElement(By.cssSelector("button.ytp-large-play-button.ytp-button")).click();
    System.out.println("Play button clicked");
    
    driver.findElement(By.cssSelector("div.modal-body.embed-responsive-4by3 > button.close")).click();
    System.out.println("Video close button clicked");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("WATCH HOW KUMON CAN BUILD AND ADVANCE YOUR CHILD'S MATH SKILLS".equals(driver.findElement(By.cssSelector("h2.jumbotron__header")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }*/

        try {
            assertEquals(driver.findElement(By.cssSelector("h1.header")).getText(), "THE KUMON MATH PROGRAM");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("img.inner-sub")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("h4")).getText(), "Just 30 minutes a day can build a lifetime of advantages");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("p")).getText(), "Enrolling in the Kumon Math Program will help build and advance your child's math skills, for an advantage in school and beyond.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            //String textactual, textexp;
            //textactual = driver.findElement(By.xpath("//p[2]")).getText();
            //textexp = String.valueOf("Daily Kumon Math Worksheets will take about 30 minutes to complete in two sessions a week at a Kumon Center, and then another five assignments to be completed at home. Your child will work at his or her own pace, mastering each new concept before moving on. With each worksheet, you’ll find your child accelerating important math skills. Many Kumon parents ultimately find their children mastering concepts that put them grade levels ahead of their peers.");
            assertEquals(driver.findElement(By.xpath("//p[2]")).getText(), "Daily Kumon Math Worksheets will take about 30 minutes to complete in two sessions a week at a Kumon Center, and then another five assignments to be completed at home. Your child will work at his or her own pace, mastering each new concept before moving on. With each worksheet, you’ll find your child accelerating important math skills. Many Kumon parents ultimately find their children mastering concepts that put them grade levels ahead of their peers.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.linkText("JOIN US FOR A PARENT ORIENTATION")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("JOIN US FOR A PARENT ORIENTATION")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertEquals(driver.findElement(By.cssSelector("div.container.text-center > h3")).getText(), "Kumon can take your child from counting to calculus and beyond.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0;; second++) {
            if (second >= 60) {
                fail("timeout");
            }
            try {
                if (isElementPresent(By.linkText("Ages 3-5"))) {
                    break;
                }
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        /*driver.findElement(By.linkText("Ages 3-5")).click();
        try {
            assertEquals(driver.findElement(By.xpath("//div[@id='item-1_3-6']/h5")).getText(), "Build your child’s math skills from an early age");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div[@id='item-2_3-6']/h5")).getText(), "You and the instructor are there to guide your child.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div[@id='item-3_3-6']/h5")).getText(), "As your child’s knowledge grows, so will a valuable sense of accomplishment.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        //driver.findElement(By.linkText("SAMPLE WORKSHEETS")).click();
        for (int second = 0;; second++) {
            if (second >= 60) {
                fail("timeout");
            }
            try {
                if (isElementPresent(By.linkText("Ages 6-12"))) {
                    break;
                }
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }*/

        driver.findElement(By.linkText("Ages 6-12")).click();
        try {
            assertEquals(driver.findElement(By.cssSelector("#item-1_6-12 > h5")).getText(), "Give your child an academic advantage in math.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("#item-2_6-12 > h5")).getText(), "Your child’s learning advances step by step.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("#item-3_6-12 > h5")).getText(), "You’ll watch your child’s knowledge advance and grow.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        //driver.findElement(By.linkText("SAMPLE WORKSHEETS")).click();
        for (int second = 0;; second++) {
            if (second >= 60) {
                fail("timeout");
            }
            try {
                if (isElementPresent(By.linkText("Ages 13+"))) {
                    break;
                }
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Ages 13+")).click();
        try {
            assertEquals(driver.findElement(By.cssSelector("#item-1_13-up > h5")).getText(), "Competing in today’s world takes advanced math skills.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("#item-2_13-up > h5")).getText(), "Your child advances independently, step by step.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("#item-3_13-up > h5")).getText(), "You’ll watch your child acquire vital skills.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        //driver.findElement(By.linkText("SAMPLE WORKSHEETS")).click();
        try {
            assertTrue(driver.findElement(By.cssSelector("article.topics > div.container.text-center > h3")).getText().matches("^What topics are covered in the Kumon Math Program[\\s\\S]$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("div.container.text-center > h4")).getText(), "The Kumon Math Worksheets can help your child learn basic skills all the way through high school-level math.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("div.col-sm-4 > ul > li")).getText(), "Counting and number sequencing");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div/div/div/ul/li[3]")).getText(), "Addition and subtraction");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div/div/div/ul/li[5]")).getText(), "Multiplication and division");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div/div/ul/li[7]")).getText(), "Fractions");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div/div/div[2]/ul/li")).getText(), "Order of operations");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div/div/div[2]/ul/li[3]")).getText(), "Positive and negative numbers");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div/div/div[2]/ul/li[5]")).getText(), "Solving equations");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div[2]/ul/li[7]")).getText(), "Graphs");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div[3]/ul/li")).getText(), "Algebra – Elementary to Advanced (algebraic expressions, linear equations, inequalities, functions, quadratic equations)");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div[3]/ul/li[3]")).getText(), "Trigonometry and Logarithms");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div[3]/ul/li[5]")).getText(), "Calculus");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("//div[3]/ul/li[7]")).getText(), "Probability and statistics");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("div.container > h2")).getText(), "START GIVING YOUR CHILD\nTHE ACADEMIC ADVANTAGE\nTO COMPETE IN TODAY’S WORLD");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("footer.cta > div.container > h3")).getText(), "Enroll in Kumon today!");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'ATTEND ORIENTATION')])[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'ATTEND ORIENTATION')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("(//a[contains(@href, 'locations')])[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(@href, 'locations')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Careers')])[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Careers')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Contact Us')])[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Environmental Initiatives')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Environmental Initiatives')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Kumon International')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Kumon International')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Newsroom')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Newsroom')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Own A Franchise')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Own A Franchise')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(@href, 'privacy-policy')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(@href, 'privacy-policy')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Site Map')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Site Map')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.cssSelector("p.copyright > span")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'How Kumon Works')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'How Kumon Works')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Math Program')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Math Program')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Reading Program')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Reading Program')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'FAQs')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'FAQs')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Study Tips & Resources')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Study Tips & Resources')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Contact Us')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'kumon+')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'kumon+')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Careers')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'About Kumon')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'About Kumon')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Own a Franchise')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//a[contains(text(),'Own a Franchise')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//a[contains(text(),'ATTEND ORIENTATION')]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(text(),'ATTEND ORIENTATION')]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
            assertTrue(isElementPresent(By.cssSelector("label.form-label")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("h3.tagline")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("span.futura.header-phone")).getText(), "1.800.ABC.MATH");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("div.header-top__logo.hide-text")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("div.header-top__logo.hide-text")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Select a language')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Select a language')])[2]")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'United States - English')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'United States - English')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Select a language')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Select a language')])[2]")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(@href, '/us-es/home')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(@href, '/us-es/home')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Select a language')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Select a language')])[2]")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(@href, '/ca-en/home')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Canada - English')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Select a language')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Select a language')])[2]")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(@href, '/ca-fr/accueil')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(@href, '/ca-fr/accueil')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Select a language')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Select a language')])[2]")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Mexico - English')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        //driver.findElement(By.xpath("(//a[contains(text(),'Mexico - English')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Select a language')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(text(),'Select a language')])[2]")).click();
        try {
          assertTrue(isElementPresent(By.xpath("(//a[contains(@href, '/mx-es/home')])[2]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//a[contains(@href, '/mx-es/home')])[2]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Math Program")).click();
        try {
          assertTrue(isElementPresent(By.id("zip")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("zip")).clear();
        driver.findElement(By.id("zip")).sendKeys("60089");
        try {
          assertTrue(isElementPresent(By.xpath("//button[@id='btnFindACenter']")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//button[@id='btnFindACenter']")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
