/* Name-Vansh Sahni
 Section-D
Class Rollno-52
University Rollno-2012792
Father Name- Late BB Sahni
Subject Code-TCS651
Subject Name-DevOps
Enrollment NO-GE-172012792*/ 
public class FacebookSignUp {     //Driver For Facebook Signup
public ChromeDriver driver;
@BeforeMethod
public void Start(){

System.setProperty("webdriver.chrome.driver", "//home//craterzone//chromedriver");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
}
@AfterMethod
public void Close(){
driver.quit();
}
@Test
public void FbLgSu() throws InterruptedException{
//driver.findElementById("email").clear();
driver.findElementById("email").sendKeys("abc@gmail.com");
driver.findElementById("pass").sendKeys("abc");
driver.findElementById("u_0_v").click();
driver.findElementByXPath(".//*[@id='register_link']/strong/a").click();
driver.findElementByXPath(".//*[@id='u_0_0']").sendKeys("Vansh");
driver.findElementByXPath(".//*[@id='u_0_1']").sendKeys("Sahni");
driver.findElementByXPath(".//*[@id='u_0_2']").sendKeys("9999999999");
driver.findElementByXPath(".//*[@id='u_0_4']").sendKeys("9898989898");
driver.findElementByXPath(".//*[@id='u_0_5']").sendKeys("Vansh@123");
Select Days =new Select(driver.findElementById("day"));
Days.selectByValue("16");
Thread.sleep(1000);
Select Month =new Select(driver.findElementById("month"));
Month.selectByValue("8");
Thread.sleep(1000);
Select Year =new Select(driver.findElementById("year"));
Year.selectByValue("1998");
//driver.findElementByXPath(".//*[@id='u_0_b']/div[2]/a").click();
driver.findElementByXPath(".//*[@id='u_0_6']").click();
driver.findElementByXPath(".//*[@id='u_0_8']/p/a[1]").click();
driver.findElementByXPath(".//*[@id='u_0_8']/p/a[2]").click();
driver.findElementByXPath(".//*[@id='u_0_8']/p/a[3]").click();
driver.findElementByXPath(".//*[@id='u_0_9']").click();
}
