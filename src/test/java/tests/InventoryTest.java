package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InventoryTest extends BaseTest{

    @Test
    public void addItemInTheCart(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        driver.findElement(By.id("react-burger-menu-btn")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_sidebar_link")));

        driver.findElement(By.id("about_sidebar_link")).click();
    }
}
