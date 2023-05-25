package by.itacademy.shikinnikita.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    ChromeDriver driver;
    String InputEmailXpath = "/html/body/div/div[1]/form/p[1]/input";
    String InputPasswordXpah = "/html/body/div/div[1]/form/p[2]/input[1]";
    String ButtonEnterXpath = "/html/body/div/div[1]/form/p[2]/input[2]";

    public PizzatempoPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public void clickButtonEnter() {
        WebElement buttonEnter = driver.findElement(By.xpath(ButtonEnterXpath));
        buttonEnter.click();
    }

    public void sendKeysEmailInputField(String value) {
        WebElement inputEmail = driver.findElement(By.xpath(InputEmailXpath));
        inputEmail.sendKeys(value);
    }

    public void sendKeysPasswordInputField(String value) {
        WebElement inputPassword = driver.findElement(By.xpath(InputPasswordXpah));
        inputPassword.sendKeys(value);
    }
}