package by.itacademy.shikinnikita.taf.sites;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;
    Faker faker;

    @BeforeEach
    public void WarmUp() {
        driver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
        faker = new Faker();
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
        pizzatempoPage.sendKeysPasswordInputField(Util.generatePassword());
        pizzatempoPage.clickButtonEnter();
    }

    @Test
    public void TestWithCorrectEmailAndEmptyPassword() {
        pizzatempoPage.sendKeysEmailInputField(Util.generateEmail());
        pizzatempoPage.clickButtonEnter();
    }

    @Test
    public void TestWithCorrectEmailAndPassword() {
        pizzatempoPage.sendKeysEmailInputField(Util.generateEmail());
        pizzatempoPage.sendKeysPasswordInputField(Util.generatePassword());
        pizzatempoPage.clickButtonEnter();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
