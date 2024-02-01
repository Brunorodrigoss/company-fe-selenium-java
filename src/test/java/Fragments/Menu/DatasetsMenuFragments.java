package Fragments.Menu;

import Fragments.Menu.Submenu.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatasetsMenuFragments {
    WebDriver driver;
    By datasetsMenu;

    public SpeechSubmenuFragments speech;
    public LiveDataSubMenuFragments liveData;
    public GenerativeAiSubMenuFragments generativeAi;
    public MiscellaneousSubMenuFragments miscellaneous;
    public ImageAndVideoSubMenuFragments imageAndVideo;

    public DatasetsMenuFragments(WebDriver driver, By datasetsMenu){
        this.driver = driver;
        this.datasetsMenu = datasetsMenu;
        this.speech = new SpeechSubmenuFragments(this.driver, this.datasetsMenu);
        this.liveData = new LiveDataSubMenuFragments(this.driver, this.datasetsMenu);
        this.generativeAi = new GenerativeAiSubMenuFragments(this.driver, this.datasetsMenu);
        this.miscellaneous = new MiscellaneousSubMenuFragments(this.driver, this.datasetsMenu);
        this.imageAndVideo = new ImageAndVideoSubMenuFragments(this.driver, this.datasetsMenu);
    }
}