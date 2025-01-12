package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTests {
    public WebDriver driver;

    @Test
    public void automationMethod() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement FormFiled = driver.findElement(By.xpath("//h5[text()='Forms']"));
        FormFiled.click();

        WebElement PracticeForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        PracticeForm.click();

        WebElement FirstNameField = driver.findElement(By.id("firstName"));
        String FirstNameValue = "Pac-Man";
        FirstNameField.sendKeys(FirstNameValue);

        WebElement LastNameField = driver.findElement(By.id("lastName"));
        String LastNameValue = "Pac-Man";
        LastNameField.sendKeys(LastNameValue);

        WebElement EmailField = driver.findElement(By.id("userEmail"));
        String EmailValue = "pacman@gmail.com";
        EmailField.sendKeys(EmailValue);

        WebElement MobileNumberField = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String MobileNumberValue = "1234567890";
        MobileNumberField.sendKeys(MobileNumberValue);

        WebElement PictureField = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/1.png");
        PictureField.sendKeys(file.getAbsolutePath());

        WebElement MaleField = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement FemaleField = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement OtherField = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String genderValue = "Female";
        if (genderValue.equals("Male")) {
            MaleField.click();
        } else if (genderValue.equals("Female")) {
            FemaleField.click();
        } else if (genderValue.equals("Other")) {
            OtherField.click();
        }

        WebElement CurrentAddressField = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String CurrentAddressValue = "Str. Nomatterway, no.4";
        CurrentAddressField.sendKeys(CurrentAddressValue);

        js.executeScript("window.scrollBy(0,500)");

        WebElement SubmitButton = driver.findElement(By.id("submit"));
        SubmitButton.click();

    }
}
