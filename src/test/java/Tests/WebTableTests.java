package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTests {
    public WebDriver driver; //variabila globala in Selenium - un tip de data speciala pentru Selenium

    @Test    //este metoda de test
    public void automationMethod() {
        driver = new ChromeDriver(); //deschide un browser - pe Edge nu da access din ThreadLocker
        driver.get("https://demoqa.com");  // accesam o pagina web
        driver.manage().window().maximize(); //facem browserul in modul maximize

        JavascriptExecutor js = (JavascriptExecutor) driver; //facem un scroll al paginii
        js.executeScript("window.scrollBy(0,400)");

        WebElement ElementsFiled = driver.findElement(By.xpath("//h5[text()='Elements']")); //declaram un element
        ElementsFiled.click(); //facem o actiune cu acest element declarat sus

        WebElement WebTableField = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        WebTableField.click();

        WebElement AddFieldButton = driver.findElement(By.id("addNewRecordButton"));
        AddFieldButton.click();

        WebElement FirstNameField = driver.findElement(By.id("firstName"));
        String FirstNameValue = "Ana";
        FirstNameField.sendKeys(FirstNameValue);

        WebElement LastNameField = driver.findElement(By.id("lastName"));
        String LastNameValue = "Corina";
        LastNameField.sendKeys(LastNameValue);

        WebElement EmailField = driver.findElement(By.id("userEmail"));
        String EmailValue = "corina@gmail.com";
        EmailField.sendKeys(EmailValue);

        WebElement AgeField = driver.findElement(By.id("age"));
        String AgeValue = "20";
        AgeField.sendKeys(AgeValue);

        WebElement SalaryField = driver.findElement(By.id("salary"));
        String SalaryValue = "100";
        SalaryField.sendKeys(SalaryValue);

        WebElement DepartmentField = driver.findElement(By.id("department"));
        String DepartmentValue = "IT";
        DepartmentField.sendKeys(DepartmentValue);

        WebElement SubmitButton = driver.findElement(By.id("submit"));
        SubmitButton.click();
    }
}
