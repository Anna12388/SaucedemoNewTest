package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUploadedTest extends BaseTest{

    @Test
    public void uploadFile(){
        driver.get("https://the-internet.herokuapp.com/upload");
        File file = new File("src/test/resources/backiee-81271.jpg");

        driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());

        driver.findElement(By.id("file-submit")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class = 'example']/h3")).getText(), "File Uploaded!", " ");
    }
}
