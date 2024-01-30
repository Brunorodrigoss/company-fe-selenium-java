package Fragments.Menu;

import Fragments.Menu.Submenu.LiveDataSubMenuFragments;
import Fragments.Menu.Submenu.SpeechSubmenuFragments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatasetsMenuFragments {
    WebDriver driver;
    By datasetsMenu;

    public SpeechSubmenuFragments speech;
    public LiveDataSubMenuFragments liveData;

    public DatasetsMenuFragments(WebDriver driver, By datasetsMenu){
        this.driver = driver;
        this.datasetsMenu = datasetsMenu;
        this.speech = new SpeechSubmenuFragments(this.driver, this.datasetsMenu);
        this.liveData = new LiveDataSubMenuFragments(this.driver, this.datasetsMenu);

    }
}