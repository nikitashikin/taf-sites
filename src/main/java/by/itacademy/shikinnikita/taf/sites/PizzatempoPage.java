package by.itacademy.shikinnikita.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    ChromeDriver driver;
    String InputEmail = "astroauth_login";
    String InputPassword = "astroauth_pass";
    String ButtonEnter = "astroauth_submit";

    public PizzatempoPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public void clickButtonEnter() {
        WebElement buttonEnter = driver.findElement(By.name(ButtonEnter));
        buttonEnter.click();
    }

    public void sendKeysEmailInputField(String value) {
        WebElement inputEmail = driver.findElement(By.name(InputEmail));
        inputEmail.sendKeys(value);
    }

    public void sendKeysPasswordInputField(String value) {
        WebElement inputPassword = driver.findElement(By.name(InputPassword));
        inputPassword.sendKeys(value);
    }
}