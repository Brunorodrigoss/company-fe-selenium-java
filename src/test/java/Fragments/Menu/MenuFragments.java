package Fragments.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuFragments {
    WebDriver driver;
    By datasetsMenu = By.id("item-menu-1");
    By industriesMenu = By.id("");
    By servicesMenu = By.id("");
    By resourcesMenu = By.id("");
    By companyMenu = By.id("");
    By ethicalAiMenu = By.id("");

    public DatasetsMenuFragments datasets;

    public MenuFragments(WebDriver driver){
        this.driver = driver;
        this.datasets = new DatasetsMenuFragments(this.driver, datasetsMenu);
    }

}
