package by.itacademy.shikinnikita.taf.sites.tests;

import by.itacademy.shikinnikita.taf.sites.pages.PizzatempoPage;
import by.itacademy.shikinnikita.taf.sites.steps.PizzaTempoStep;
import by.itacademy.shikinnikita.taf.sites.utils.Util;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;
    Faker faker;
    PizzaTempoStep pizzaTempoStep;

    @BeforeEach
    public void WarmUp() {
        driver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
        faker = new Faker();
        pizzaTempoStep = new PizzaTempoStep(driver);
    }

    @Test
    public void TestWithEmptyEmailAndPassword() {
        pizzatempoPage.clickButtonEnter();
    }

    @Test
    public void TestWithIncorrectEmail() {
     pizzaTempoStep.FillLoginFormAndSubmit("mail","");
    }

    @Test
    public void TestWithEmptyEmailAndAnyPassword() {
        pizzaTempoStep.FillLoginFormAndSubmit("", Util.generatePassword());
    }

    @Test
    public void TestWithCorrectEmailAndEmptyPassword() {
        pizzaTempoStep.FillLoginFormAndSubmit(Util.generateEmail(),"");
    }

    @Test
    public void TestWithCorrectEmailAndPassword() {
        pizzaTempoStep.FillLoginFormAndSubmit(Util.generateEmail(),Util.generatePassword());
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
