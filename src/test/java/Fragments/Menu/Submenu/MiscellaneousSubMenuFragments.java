package Fragments.Menu.Submenu;

import Common.MenuCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MiscellaneousSubMenuFragments extends MenuCommon {

    By healthScreeningReports = By.xpath("//*[text()='Health Screening Reports']");
    By medicalUserEngagementAnalytics = By.xpath("//*[text()='Medical User Engagement Analytics']");

    public MiscellaneousSubMenuFragments(WebDriver driver, By menu) {
        super(driver, menu);
    }

    public void healthScreeningReports() {
        selectSubmenu(
                this.menu,
                this.healthScreeningReports,
                this.constants.url.baseUrl + this.constants.url.datasets.healthScreeningReports
        );
    }

    public void medicalUserEngagementAnalytics() {
        selectSubmenu(
                this.menu,
                this.medicalUserEngagementAnalytics,
                this.constants.url.baseUrl + this.constants.url.datasets.medicalUserEngagementAnalytics
        );
    }
}
