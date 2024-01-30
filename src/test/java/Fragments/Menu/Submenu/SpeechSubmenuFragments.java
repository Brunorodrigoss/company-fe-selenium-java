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
    By spontaneousIvr = By.xpath("//*[text()='Spontaneous IVR']");
    By phoneticLexica = By.xpath("//*[text()='Phonetic Lexica']");
    By exploreSpeechDatasets = By.xpath("//*[text()='Explore Speech Datasets']");


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

    public void spontaneousIvr() {
        datasetsMenu(this.datasetsMenu);
        menuUtils.selectSubmenu(spontaneousIvr, constants.url.spontaneousIvr);
    }

    public void phoneticLexica() {
        datasetsMenu(this.datasetsMenu);
        menuUtils.selectSubmenu(phoneticLexica, constants.url.phoneticLexica);
    }

    public void exploreSpeechDatasets() {
        datasetsMenu(this.datasetsMenu);
        menuUtils.selectSubmenu(exploreSpeechDatasets, constants.url.exploreSpeechDatasets);
    }
}
