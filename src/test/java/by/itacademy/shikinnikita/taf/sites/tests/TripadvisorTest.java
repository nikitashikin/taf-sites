package by.itacademy.shikinnikita.taf.sites.tests;

import by.itacademy.shikinnikita.taf.sites.pages.TripadvisorPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripadvisorTest {
    ChromeDriver driver;
    TripadvisorPage tripadvisorPage;

    @BeforeEach
    public void WarmUp() throws InterruptedException {
        driver = new ChromeDriver();
        tripadvisorPage = new TripadvisorPage();
        driver.get("https://www.tripadvisor.com/");
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(By.cssSelector("#onetrust-accept-btn-handler"));
        acceptCookies.click();
    }

    @Test
    public void testWithEmptyEmailAndPassword() throws InterruptedException {
        WebElement buttonEnter = driver.findElement(By.xpath(tripadvisorPage.buttonEnterXpath));
        buttonEnter.click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector(tripadvisorPage.iframeSelector)));
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();
        WebElement buttonSignIn = driver.findElement(By.xpath(tripadvisorPage.buttonSignInXpath));
        buttonSignIn.click();
    }
    @Test
    public void testWithIncorrectEmail() throws InterruptedException {
        WebElement buttonEnter = driver.findElement(By.xpath(tripadvisorPage.buttonEnterXpath));
        buttonEnter.click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector(tripadvisorPage.iframeSelector)));
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();
        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("mail");
        WebElement buttonSignIn = driver.findElement(By.xpath(tripadvisorPage.buttonSignInXpath));
        buttonSignIn.click();
    }
    @Test
    public void testWithCorrectEmailandEmptyPassword() throws InterruptedException {
        WebElement buttonEnter = driver.findElement(By.xpath(tripadvisorPage.buttonEnterXpath));
        buttonEnter.click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector(tripadvisorPage.iframeSelector)));
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();
        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.ru");
        WebElement buttonSignIn = driver.findElement(By.xpath(tripadvisorPage.buttonSignInXpath));
        buttonSignIn.click();
    }
    @Test
    public void testWithCorrectEmailandAnyPassword() throws InterruptedException {
        WebElement buttonEnter = driver.findElement(By.xpath(tripadvisorPage.buttonEnterXpath));
        buttonEnter.click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector(tripadvisorPage.iframeSelector)));
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();
        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.ru");
        WebElement inputPassword = driver.findElement(By.xpath(tripadvisorPage.inputPasswordXpath));
        inputPassword.sendKeys("123");
        WebElement buttonSignIn = driver.findElement(By.xpath(tripadvisorPage.buttonSignInXpath));
        buttonSignIn.click();
    }

   @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
