package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    public void switchToIFrame() {
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
    }

    public String getIFrameContent() {
        return driver.findElement(By.xpath("//body[@id='tinymce']/p")).getText();
    }
}
