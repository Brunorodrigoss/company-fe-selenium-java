package Fragments.Menu;

import Common.MenuCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndustriesMenuFragments extends MenuCommon {
    By insurance = By.xpath("//*[text()='Insurance']");
    By finance = By.xpath("//*[text()='Finance']");
    By telecommunications = By.xpath("//*[text()='Telecommunications']");
    By retail = By.xpath("//*[text()='Retail']");

    public IndustriesMenuFragments(WebDriver driver, By industriesMenu) {
        super(driver, industriesMenu);
    }

    public void insurance() {
        selectSubmenu(
                this.menu,
                this.insurance,
                this.constants.url.resourcesBaseUrl + this.constants.url.industries.insurance
        );
    }

    public void finance() {
        selectSubmenu(
                this.menu,
                this.finance,
                this.constants.url.resourcesBaseUrl + this.constants.url.industries.finance
        );
    }

    public void telecommunications() {
        selectSubmenu(
                this.menu,
                this.telecommunications,
                this.constants.url.resourcesBaseUrl + this.constants.url.industries.telecommunications
        );
    }

    public void retail() {
        selectSubmenu(
                this.menu,
                this.retail,
                this.constants.url.resourcesBaseUrl + this.constants.url.industries.retail
        );
    }
}
