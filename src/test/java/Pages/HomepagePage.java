package Pages;

import Fragments.Menu.MenuFragments;
import org.openqa.selenium.WebDriver;


public class HomepagePage {
    WebDriver driver;
    public MenuFragments menu;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
        this.menu = new MenuFragments(this.driver);
    }

    public void setup(String url) {
        this.driver.get(url);
    }
}
