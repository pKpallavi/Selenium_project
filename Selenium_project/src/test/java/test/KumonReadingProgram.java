package test;

import static java.lang.System.exit;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KumonReadingProgram {
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
  public void testKumonReadingProgram() throws Exception {
    WebDriverWait wait2 = new WebDriverWait(driver, 10);
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    /*driver.findElement(By.linkText("PLAY VIDEO")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) {
            //fail("timeout"); 
            exit(1);
        }
    	try { if (isElementPresent(By.cssSelector("button.ytp-large-play-button.ytp-button"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    System.out.println("Play button found");
    ///html/body/div/div/div[4]/button
    //https://www.youtube.com/embed/y_lpPKEpMrQ
    driver.findElement(By.cssSelector("button.ytp-large-play-button.ytp-button")).click();
    System.out.println("Play button clicked");
    for (int second = 0;; second++) {
    	if (second >= 60) {
            //fail("timeout"); 
            exit(1);
        }
    	try { if (isElementPresent(By.xpath("//div[@id='videoModal']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    System.out.println("Close button found");
    driver.findElement(By.xpath("//div[@id='videoModal']")).click();
    System.out.println("Close button clicked");*/
    try {
      assertEquals(driver.findElement(By.cssSelector("h2.jumbotron__header")).getText(), "WATCH HOW\nKUMON CAN BUILD AND ADVANCE YOUR CHILD’S READING SKILLS");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("h1.header")).getText(), "THE KUMON READING PROGRAM");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img.inner-sub")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("h4")).getText(), "Kumon cultivates the reading skills that can create a lifetime of academic advantages.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("p")).getText(), "The Kumon Reading Program is designed to build the critical reading skills that will help your child develop a lifelong love of reading – and a solid foundation for academic success.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//p[2]")).getText(), "Daily Reading Worksheets will take about 30 minutes to complete – in two sessions a week at a Kumon Center, and another five assignments completed at home. Your child will work at his or her own pace, mastering each new reading concept before moving on. With each worksheet, your child’s overall reading and writing skills will advance incrementally. Many Kumon parents ultimately find their children mastering concepts that put them grade levels ahead of their peers.");
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
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertEquals(driver.findElement(By.cssSelector("div.container.text-center > h3")).getText(), "Advance your child’s reading skills from an early age, and throughout their school.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Ages 3-5")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ages 3-5")).click();
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-1_3-6 > h5")).getText(), "Kumon gives your child a head start in reading.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-1_3-6 > p")).getText(), "Enrolling your son or daughter in the Kumon Reading Program before school begins will build a solid reading foundation – and a love of reading that will provide an advantage each year in school.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-2_3-6 > h5")).getText(), "You and a Kumon Instructor help guide your child.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-2_3-6 > p")).getText(), "Your early reader will need additional guidance in completing Reading Worksheets. Two days a week at the Kumon Center, an instructor will be there to provide help with worksheets. At home, you’ll assist in the completion of worksheets during the 30 minutes a day of Kumon Reading time.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-3_3-6 > h5")).getText(), "As reading skills grow, so does a sense of accomplishment.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-3_3-6 > p")).getText(), "With every Reading Worksheet your child completes, you’ll see continued success and satisfaction. Best of all, school years begin with a foundation of knowledge and achievement.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Ages 6-12")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ages 6-12")).click();
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-1_6-12 > h5")).getText(), "Open your child’s world with a love of reading.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-1_6-12 > p")).getText(), "Building strong reading comprehension from an early age will prepare your child to advance through elementary school with confidence and appreciation for learning.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-2_6-12 > h5")).getText(), "Your child begins at the right level.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-2_6-12 > p")).getText(), "A Kumon Instructor will assess your child’s current reading skills and introduce the appropriate level of Kumon Reading Worksheets. This provides just the right start for building comprehension and writing skills.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-3_6-12 > h5")).getText(), "You’ll watch your child’s knowledge advance and broaden.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-3_6-12 > p")).getText(), "As each worksheet is completed, you’ll see your child building a stronger vocabulary, a more thorough understanding of the proper use of grammar, and an ability to interpret content that becomes strength in a wide range of classes.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Ages 13+")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Ages 13+")).click();
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-1_13-up > h5")).getText(), "Competing in today’s world takes advanced reading skills.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-1_13-up > p")).getText(), "As your child enters middle and high school, the Kumon Reading Program will help advance reading abilities and critical thinking, necessary for rigorous college courses.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-2_13-up > h5")).getText(), "Your child advances independently, step by step.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-2_13-up > p")).getText(), "Through the study of advanced fiction and non-fiction passages, your child will develop critical thinking skills by analyzing complex texts from literary criticism to academic, social, and political commentary. The ability to interpret diverse information and form a judgment becomes a valuable academic, and lifelong, skill.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-3_13-up > h5")).getText(), "You’ll see your child’s knowledge and abilities grow.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("#item-3_13-up > p")).getText(), "With each new advanced reading and comprehension skill, you’ll know you’re helping provide the tools your child needs to excel in the classroom.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    /*try {
      assertTrue(driver.findElement(By.cssSelector("article.topics > div.container.text-center > h3")).getText().matches("What topics are covered in the Kumon Reading Program?"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }*/
    try {
      assertEquals(driver.findElement(By.cssSelector("div.container.text-center > h4")).getText(), "The Kumon Reading Worksheets can take your child from letter sounds, to fairy tales, to Shakespeare:");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div/div/div/ul/li")).getText(), "Pre-Reading skills");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div/div/div/ul/li[3]")).getText(), "Vocabulary");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div/div/div/ul/li[5]")).getText(), "Grammar and punctuation");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div/div/div[2]/ul/li")).getText(), "Sentence building");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div/div/div[2]/ul/li[3]")).getText(), "Understanding paragraphs");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div/div/div[2]/ul/li[5]")).getText(), "Reading comprehension");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div[3]/ul/li")).getText(), "Summary");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div[3]/ul/li[3]")).getText(), "Interpretation");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div[3]/ul/li[5]")).getText(), "Critical reading");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("h3.reading-header")).getText(), "The Kumon Recommended Reading List");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("div.col-xs-12.text-center > p")).getText(), "The Kumon Recommended Reading List contains 380 books designed to help you as a parent select material that enhances your child’s appreciation for and understanding of the English language and helps to develop a lifelong love for reading. Many of the books on the Recommended Reading List have won literary awards such as the Newbery and Caldecott Medals, the Pulitzer Prize, and the National Book Award. The list covers a range of titles from read-aloud books to the classics. The rich literature exposes your child to history, the arts, science, and culture, and features a diversity of genres, writing styles, and authors.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("DOWNLOAD THE KUMON READING LIST")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("DOWNLOAD THE KUMON READING LIST")).click();
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
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'FIND A CENTER NEAR YOU')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'FIND A CENTER NEAR YOU')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Careers')])[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Environmental Initiatives')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Kumon International')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Newsroom')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Own A Franchise')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Site Map')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertEquals(driver.findElement(By.cssSelector("p.copyright > span")).getText(), "All rights reserved.");
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
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Math Program')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'Math Program')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Reading Program')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'Reading Program')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'FAQs')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'FAQs')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Study Tips & Resources')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'Study Tips & Resources')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Contact Us')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'kumon+')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'kumon+')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Careers')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'About Kumon')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'About Kumon')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Own a Franchise')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'Own a Franchise')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//a[contains(text(),'ATTEND ORIENTATION')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//a[contains(text(),'ATTEND ORIENTATION')]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
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
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Select a language')])[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Select a language')])[2]")).click();
    wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(@href, '/home')])[2]")));
    try {
      assertTrue(isElementPresent(By.xpath("(//a[contains(@href, '/home')])[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    //driver.findElement(By.xpath("(//a[contains(@href, '/home')])[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
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
    driver.findElement(By.linkText("Reading Program")).click();
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
    driver.findElement(By.xpath("(//a[contains(@href, '/ca-en/home')])[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
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
    driver.findElement(By.linkText("Reading Program")).click();
    try {
      assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Select a language')])[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Select a language')])[2]")).click();
    try {
      assertTrue(isElementPresent(By.xpath("(//a[contains(@href, '/mx-en/home')])[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//a[contains(@href, '/mx-en/home')])[2]")).click();
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
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
    driver.findElement(By.linkText("Reading Program")).click();
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
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Reading Program")).click();
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
