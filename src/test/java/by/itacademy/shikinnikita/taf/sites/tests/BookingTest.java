package by.itacademy.shikinnikita.taf.sites.tests;

import by.itacademy.shikinnikita.taf.sites.pages.BookingPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookingTest {
    @Test
    public void testWithEmptyEmail() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        BookingPage bookingPage = new BookingPage();
        driver.get("https://www.booking.com/");

        Thread.sleep(2000);
        WebElement buttonEnter = driver.findElement(By.cssSelector(bookingPage.buttonEnterSelector));
        buttonEnter.click();


        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("");

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmailXpath));
        driver.quit();

    }

    @Test
    public void testWithIncorrectEmail() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        BookingPage bookingPage = new BookingPage();
        driver.get("https://www.booking.com/");

        Thread.sleep(2000);
        WebElement buttonEnter = driver.findElement(By.cssSelector(bookingPage.buttonEnterSelector));
        buttonEnter.click();


        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("mail");

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmailXpath));
        driver.quit();

    }
    @Test
    public void testWithCorrectEmail() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        BookingPage bookingPage = new BookingPage();
        driver.get("https://www.booking.com/");

        Thread.sleep(2000);
        WebElement buttonEnter = driver.findElement(By.cssSelector(bookingPage.buttonEnterSelector));
        buttonEnter.click();


        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();
        driver.quit();
    }
    @Test
    public void testWithEmptyPassword() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        BookingPage bookingPage = new BookingPage();
        driver.get("https://www.booking.com/");

        Thread.sleep(2000);
        WebElement buttonEnter = driver.findElement(By.cssSelector(bookingPage.buttonEnterSelector));
        buttonEnter.click();


        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();

        Thread.sleep(2000);
        WebElement buttonSubmit = driver.findElement(By.xpath(bookingPage.buttonSubmitXpath));
        buttonSubmit.click();

        driver.quit();
    }
    @Test
    public void testWithAnyPassword() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        BookingPage bookingPage = new BookingPage();
        driver.get("https://www.booking.com/");

        Thread.sleep(2000);
        WebElement buttonEnter = driver.findElement(By.cssSelector(bookingPage.buttonEnterSelector));
        buttonEnter.click();


        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("test@mail.com");

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();

        Thread.sleep(2000);
        WebElement inputPassword = driver.findElement(By.cssSelector(bookingPage.inputPasswordSelector));
        inputPassword.sendKeys("123");

        WebElement buttonSubmit = driver.findElement(By.xpath(bookingPage.buttonSubmitXpath));
        buttonSubmit.click();

        driver.quit();

    }
}
