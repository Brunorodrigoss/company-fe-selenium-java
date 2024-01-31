package Fragments.Menu.Submenu;

import Constants.Constants;
import Utils.MenuUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MiscellaneousSubMenuFragments {
    WebDriver driver;
    MenuUtils menuUtils;
    private final Constants constants = new Constants();
    By menu;
    By healthScreeningReports = By.xpath("//*[text()='Health Screening Reports']");
    By medicalUserEngagementAnalytics = By.xpath("//*[text()='Medical User Engagement Analytics']");

    public MiscellaneousSubMenuFragments(WebDriver driver, By menu) {
        this.driver = driver;
        this.menuUtils = new MenuUtils(this.driver);
        this.menu = menu;
    }

    public void healthScreeningReports() {
        menuUtils.selectSubmenu(this.menu, this.healthScreeningReports, this.constants.url.healthScreeningReports);
    }

    public void medicalUserEngagementAnalytics() {
        menuUtils.selectSubmenu(this.menu, this.medicalUserEngagementAnalytics, this.constants.url.medicalUserEngagementAnalytics);
    }
}
