package Fragments.Menu.Submenu;

import Constants.Constants;
import Utils.MenuUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubMenuCommonFragments {
    public WebDriver driver;
    public MenuUtils menuUtils;
    public final Constants constants = new Constants();
    public By menu;

    public SubMenuCommonFragments(WebDriver driver, By menu) {
        this.driver = driver;
        this.menuUtils = new MenuUtils(this.driver);
        this.menu = menu;
    }
}
