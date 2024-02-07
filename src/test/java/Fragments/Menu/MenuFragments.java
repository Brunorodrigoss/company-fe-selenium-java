package Fragments.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuFragments {
    WebDriver driver;
    By datasetsMenu = By.id("item-menu-1");
    By industriesMenu = By.id("item-menu-20");
    By servicesMenu = By.id("");
    By resourcesMenu = By.id("");
    By companyMenu = By.id("");
    By ethicalAiMenu = By.id("");

    public DatasetsMenuFragments datasets;
    public IndustriesMenuFragments industries;

    public MenuFragments(WebDriver driver){
        this.driver = driver;
        this.datasets = new DatasetsMenuFragments(this.driver, datasetsMenu);
        this.industries = new IndustriesMenuFragments(this.driver, industriesMenu);
    }
}
