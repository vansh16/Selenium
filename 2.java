/* Name-Vansh Sahni
 Section-D
Class Rollno-52
University Rollno-2012792
Father Name- Late BB Sahni
Subject Code-TCS651
Subject Name-DevOps
Enrollment NO-GE-172012792*/ 
public class FacebookLogin {                             // Driver For Facebook Login 

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement Login = driver.findElement(By.id("u_0_v"));
        username.sendKeys("Vanshsahni16@gmail.com");
        password.sendKeys("Password");
        Login.click();
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
        WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
        navigationclick.click();
        if(logout.isEnabled() && logout.isDisplayed()) {
            logout.click();
        }
        else {
            System.out.println("Element not found");
        }

    }

}

