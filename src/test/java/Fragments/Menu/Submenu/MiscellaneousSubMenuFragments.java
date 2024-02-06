package Fragments.Menu.Submenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MiscellaneousSubMenuFragments extends SubMenuCommonFragments {

    By healthScreeningReports = By.xpath("//*[text()='Health Screening Reports']");
    By medicalUserEngagementAnalytics = By.xpath("//*[text()='Medical User Engagement Analytics']");

    public MiscellaneousSubMenuFragments(WebDriver driver, By menu) {
        super(driver, menu);
    }

    public void healthScreeningReports() {
        menuUtils.selectSubmenu(this.menu, this.healthScreeningReports, this.constants.url.datasets.healthScreeningReports);
    }

    public void medicalUserEngagementAnalytics() {
        menuUtils.selectSubmenu(this.menu, this.medicalUserEngagementAnalytics, this.constants.url.datasets.medicalUserEngagementAnalytics);
    }
}
