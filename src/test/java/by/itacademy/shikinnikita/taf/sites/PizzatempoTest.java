package by.itacademy.shikinnikita.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {


    @Test
    public void TestWithEmptyEmailAndPassword() {
        ChromeDriver driver = new ChromeDriver();
        PizzatempoPage pizzatempoPage = new PizzatempoPage();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.InputEmailXpath));
        inputEmail.sendKeys("");

        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.InputPasswordXpah));
        inputPassword.sendKeys("");

        WebElement buttonEnter = driver.findElement(By.xpath(pizzatempoPage.ButtonEnterXpath));
        buttonEnter.click();
        driver.quit();
    }

    @Test
    public void TestWithIncorrectEmail() {
        ChromeDriver driver = new ChromeDriver();
        PizzatempoPage pizzatempoPage = new PizzatempoPage();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();

        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.InputEmailXpath));
        inputEmail.sendKeys("mail");

        WebElement buttonEnter = driver.findElement(By.xpath(pizzatempoPage.ButtonEnterXpath));
        buttonEnter.click();
        driver.quit();

    }
    @Test
    public void TestWithEmptyEmailAndAnyPassword(){
        ChromeDriver driver = new ChromeDriver();
        PizzatempoPage pizzatempoPage = new PizzatempoPage();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();

        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.InputEmailXpath));
        inputEmail.sendKeys("");

        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.InputPasswordXpah));
        inputPassword.sendKeys("123");

        WebElement buttonEnter = driver.findElement(By.xpath(pizzatempoPage.ButtonEnterXpath));
        buttonEnter.click();
        driver.quit();
    }
    @Test
    public void TestWithCorrectEmailAndEmptyPassword(){
        ChromeDriver driver = new ChromeDriver();
        PizzatempoPage pizzatempoPage = new PizzatempoPage();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();

        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.InputEmailXpath));
        inputEmail.sendKeys("test@mail.com)");

        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.InputPasswordXpah));
        inputPassword.sendKeys("");

        WebElement buttonEnter = driver.findElement(By.xpath(pizzatempoPage.ButtonEnterXpath));
        buttonEnter.click();
        driver.quit();
    }
    @Test
    public void TestWithCorrectEmailAndPassword() {
        ChromeDriver driver = new ChromeDriver();
        PizzatempoPage pizzatempoPage = new PizzatempoPage();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();

        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.InputEmailXpath));
        inputEmail.sendKeys("test@mail.com)");

        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.InputPasswordXpah));
        inputPassword.sendKeys("123");

        WebElement buttonEnter = driver.findElement(By.xpath(pizzatempoPage.ButtonEnterXpath));
        buttonEnter.click();
        driver.quit();
    }
    }
