package Common;

import Constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class MenuCommon {
    WebDriver driver;
    public Constants constants = new Constants();
    public By menu;

    public MenuCommon(WebDriver driver, By menu) {
        this.driver = driver;
        this.menu = menu;
    }

    public MenuCommon(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverMenuElement(By elementToHover) {
        WebElement element = this.driver.findElement(elementToHover);
        Actions action = new Actions(this.driver);

        action.moveToElement(element).perform();
    }
    void switchWindowTab(String originalWindow){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(numberOfWindowsToBe(2));

        for (String windowHandle: this.driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void selectSubmenu(By menu, By submenu, String expectedUrl){

        this.hoverMenuElement(menu);

        String originalWindow = this.driver.getWindowHandle();
        assert this.driver.getWindowHandles().size() == 1;

        this.driver.findElement(submenu).click();

        if (expectedUrl.contains("resources")) {
            switchWindowTab(originalWindow);
        }

        assertEquals(this.driver.getCurrentUrl(), expectedUrl);
    }
}
