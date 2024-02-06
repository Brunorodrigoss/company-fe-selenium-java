package Utils;

import Constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuUtils {
    Constants constants = new Constants();
    WebDriver driver;

    public MenuUtils(WebDriver driver) {
        this.driver = driver;
    }
    public void hoverMenuElement(By elementToHover) {
        WebElement element = this.driver.findElement(elementToHover);
        Actions action = new Actions(this.driver);

        action.moveToElement(element).perform();
    }

    public void selectSubmenu(By menu, By submenu, String expectedUrl){
        this.hoverMenuElement(menu);

        this.driver.findElement(submenu).click();
        String currentUrl = this.driver.getCurrentUrl();

        assertEquals(currentUrl, constants.url.baseUrl + expectedUrl);
    }
}
