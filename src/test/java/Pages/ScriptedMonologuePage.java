package Pages;

import Base.BasePage;
import Fragments.Menu.MenuFragments;
import org.openqa.selenium.WebDriver;

public class ScriptedMonologuePage extends BasePage {
    public ScriptedMonologuePage(WebDriver driver) {
        this.driver = driver;
        this.menu = new MenuFragments(this.driver);
    }

    public void setup() {
        this.driver.get(constants.url.baseUrl + constants.url.datasets.scriptedMonologue);
    }
}