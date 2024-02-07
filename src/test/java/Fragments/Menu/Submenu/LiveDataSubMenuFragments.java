package Fragments.Menu.Submenu;

import Common.MenuCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LiveDataSubMenuFragments extends MenuCommon {
    By podcastsDatasets = By.xpath("//*[text()='Podcasts Dataset']");
    By liveVoiceAssistantInquiries = By.xpath("//*[text()='Live Voice Assistant Inquiries']");

    public  LiveDataSubMenuFragments(WebDriver driver, By menu){
        super(driver, menu);
    }

    public void podcastsDatasets() {
        selectSubmenu(
                this.menu,
                this.podcastsDatasets,
                this.constants.url.baseUrl + this.constants.url.datasets.podcastsDatasets
        );
    }

    public void liveVoiceAssistantInquiries() {
        selectSubmenu(
                this.menu,
                this.liveVoiceAssistantInquiries,
                this.constants.url.baseUrl + this.constants.url.datasets.liveVoiceAssistantInquiries
        );
    }
}
