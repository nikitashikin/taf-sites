package by.itacademy.shikinnikita.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;

    @BeforeEach
    public void WarmUp() {
        driver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
    }

    @Test
    public void TestWithEmptyEmailAndPassword() {
        pizzatempoPage.clickButtonEnter();
    }

    @Test
    public void TestWithIncorrectEmail() {
        pizzatempoPage.sendKeysEmailInputField("mail");
        pizzatempoPage.clickButtonEnter();
    }

    @Test
    public void TestWithEmptyEmailAndAnyPassword() {
        pizzatempoPage.sendKeysPasswordInputField("123");
        pizzatempoPage.clickButtonEnter();
    }

    @Test
    public void TestWithCorrectEmailAndEmptyPassword() {
        pizzatempoPage.sendKeysEmailInputField("test@mail.com");
        pizzatempoPage.clickButtonEnter();
    }

    @Test
    public void TestWithCorrectEmailAndPassword() {
        pizzatempoPage.sendKeysEmailInputField("test@mail.com");
        pizzatempoPage.sendKeysPasswordInputField("123");
        pizzatempoPage.clickButtonEnter();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
