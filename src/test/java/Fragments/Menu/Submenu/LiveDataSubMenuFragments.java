package Fragments.Menu.Submenu;

import Constants.Constants;
import Utils.MenuUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LiveDataSubMenuFragments {
    WebDriver driver;
    MenuUtils menuUtils;
    private final Constants constants = new Constants();
    By menu;
    By podcastsDatasets = By.xpath("//*[text()='Podcasts Dataset']");
    By liveVoiceAssistantInquiries = By.xpath("//*[text()='Live Voice Assistant Inquiries']");

    public  LiveDataSubMenuFragments(WebDriver driver, By menu){
        this.driver = driver;
        this.menuUtils = new MenuUtils(this.driver);
        this.menu = menu;
    }

    public void podcastsDatasets() {
        menuUtils.selectSubmenu(this.menu, this.podcastsDatasets, this.constants.url.podcastsDatasets);
    }

    public void liveVoiceAssistantInquiries() {
        menuUtils.selectSubmenu(this.menu, this.liveVoiceAssistantInquiries, this.constants.url.liveVoiceAssistantInquiries);
    }
}
