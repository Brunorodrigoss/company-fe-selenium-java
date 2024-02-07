package Pages;

import Base.BasePage;
import Fragments.Menu.MenuFragments;
import org.openqa.selenium.WebDriver;

public class LiveVoiceAssistantInquiriesPage extends BasePage {
    public LiveVoiceAssistantInquiriesPage(WebDriver driver) {
        this.driver = driver;
        this.menu = new MenuFragments(this.driver);
    }

    public void setup() {
        this.driver.get(constants.url.baseUrl + constants.url.datasets.liveVoiceAssistantInquiries);
    }
}