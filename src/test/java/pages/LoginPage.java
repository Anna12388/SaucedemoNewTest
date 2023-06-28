package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USER_NAME = By.id("user-name");
    public static final By PASSWORD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("login_button");
    public static final By ERROR_MESSAGE = By.xpath("//h3[@data-test= 'error']");

    public LoginPage(WebDriver driver) {

        super(driver);
    }

   public void open(){
        driver.get("URL");
   }
   public void login(String userName,String password) {
        driver.findElement(USER_NAME).sendKeys(userName);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
   }
   public String getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();

    }
}
