package by.itacademy.shikinnikita.taf.sites.steps;

import by.itacademy.shikinnikita.taf.sites.pages.PizzatempoPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaTempoStep {
    PizzatempoPage page;

    PizzaTempoStep(ChromeDriver driver){
        page =  new PizzatempoPage(driver);
    }

    public void FillLoginFormAndSubmit(String email, String password){
        page.sendKeysEmailInputField(email);
        page.sendKeysPasswordInputField(password);
        page.clickButtonEnter();


    }
}
