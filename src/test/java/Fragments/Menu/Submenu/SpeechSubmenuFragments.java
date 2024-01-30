package Fragments.Menu.Submenu;

import Constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.MenuUtils;

public class SpeechSubmenuFragments {
    WebDriver driver;
    MenuUtils menuUtils;
    private final Constants constants = new Constants();
    By menu;
    By spontaneousDialogue = By.xpath("//*[text()='Spontaneous Dialogue']");
    By scriptedMonologue = By.xpath("//*[text()='Scripted Monologue']");
    By spontaneousIvr = By.xpath("//*[text()='Spontaneous IVR']");
    By phoneticLexica = By.xpath("//*[text()='Phonetic Lexica']");
    By exploreSpeechDatasets = By.xpath("//*[text()='Explore Speech Datasets']");


    public SpeechSubmenuFragments(WebDriver driver, By menu) {
        this.driver = driver;
        this.menuUtils = new MenuUtils(this.driver);
        this.menu = menu;
    }

    void datasetsMenu(By elementToHover) {
       menuUtils.hoverMenuElement(elementToHover);
    }

    public void spontaneousDialogue() {
        menuUtils.selectSubmenu(this.menu, this.spontaneousDialogue, this.constants.url.spontaneousDialogue);
    }

    public void scriptedMonologue() {
        menuUtils.selectSubmenu(this.menu, this.scriptedMonologue, this.constants.url.scriptedMonologue);
    }

    public void spontaneousIvr() {
        menuUtils.selectSubmenu(this.menu, this.spontaneousIvr, this.constants.url.spontaneousIvr);
    }

    public void phoneticLexica() {
        menuUtils.selectSubmenu(this.menu, this.phoneticLexica, this.constants.url.phoneticLexica);
    }

    public void exploreSpeechDatasets() {
        menuUtils.selectSubmenu(this.menu, exploreSpeechDatasets, this.constants.url.exploreSpeechDatasets);
    }
}
