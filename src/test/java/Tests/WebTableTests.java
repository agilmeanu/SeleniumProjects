package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTests {
        public WebDriver driver; //variabila globala in Selenium - un tip de data speciala pentru Selenium
    @Test    //este metoda de test
        public void automationMethod() {
                driver = new ChromeDriver(); //deschide un browser - pe Edge nu da access din ThreadLocker
                driver.get("https://demoqa.com");  // accesam o pagina web
                driver.manage().window().maximize(); //facem browserul in modul maximize

    }
}
