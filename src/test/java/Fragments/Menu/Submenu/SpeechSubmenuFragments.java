package Fragments.Menu.Submenu;

import Constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.MenuUtils;

public class SpeechSubmenuFragments {
    WebDriver driver;
    MenuUtils menuUtils;
    private final Constants constants = new Constants();
    By datasetsMenu;
    By spontaneousDialogue = By.xpath("//*[text()='Spontaneous Dialogue']");
    By scriptedMonologue = By.xpath("//*[text()='Scripted Monologue']");


    public SpeechSubmenuFragments(WebDriver driver, By datasetsMenu) {
        this.driver = driver;
        this.menuUtils = new MenuUtils(this.driver);
        this.datasetsMenu = datasetsMenu;
    }

    void datasetsMenu(By elementToHover) {
       menuUtils.hoverMenuElement(elementToHover);
    }

    public void spontaneousDialogue() {
        datasetsMenu(this.datasetsMenu);
        menuUtils.selectSubmenu(spontaneousDialogue, constants.url.spontaneousDialogue);
    }

    public void scriptedMonologue() {
        datasetsMenu(this.datasetsMenu);
        menuUtils.selectSubmenu(scriptedMonologue, constants.url.scriptedMonologue);
    }
}
