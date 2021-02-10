import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {

    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args){
        //System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        System.setProperty("webdriver.chrome.driver", "/Users/mahnaz/Desktop/Cyan Login/LoginAuth/chromedriver.exe");
    }

    @Test(testName = "Submit a WebForm")
    public static void submitForm(String username, String password) {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterTxtUsername(webForm.txtUsername);
        //driver.get("tomsmith");
        webForm.enterTxtPassword(webForm.txtPassword);
        //driver.get("SuperSecretPassword!");
        webForm.pressSubmitButton();

    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close( );

    }


}
