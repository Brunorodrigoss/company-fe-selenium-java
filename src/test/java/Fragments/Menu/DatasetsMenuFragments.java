package Fragments.Menu;

import Fragments.Menu.Submenu.SpeechSubmenuFragments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatasetsMenuFragments {
    WebDriver driver;
    By datasetsMenu;

    public SpeechSubmenuFragments speech;

    public DatasetsMenuFragments(WebDriver driver, By datasetsMenu){
        this.driver = driver;
        this.speech = new SpeechSubmenuFragments(this.driver, datasetsMenu);
        this.datasetsMenu = datasetsMenu;
    }
}