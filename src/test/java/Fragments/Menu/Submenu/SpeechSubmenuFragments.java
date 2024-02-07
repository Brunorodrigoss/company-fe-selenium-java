package Fragments.Menu.Submenu;

import Common.MenuCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpeechSubmenuFragments extends MenuCommon {

    By spontaneousDialogue = By.xpath("//*[text()='Spontaneous Dialogue']");
    By scriptedMonologue = By.xpath("//*[text()='Scripted Monologue']");
    By spontaneousIvr = By.xpath("//*[text()='Spontaneous IVR']");
    By phoneticLexica = By.xpath("//*[text()='Phonetic Lexica']");
    By exploreSpeechDatasets = By.xpath("//*[text()='Explore Speech Datasets']");

    public SpeechSubmenuFragments(WebDriver driver, By menu) {
        super(driver, menu);
    }

    public void spontaneousDialogue() {
        selectSubmenu(
                this.menu,
                this.spontaneousDialogue,
                this.constants.url.baseUrl + this.constants.url.datasets.spontaneousDialogue
        );
    }

    public void scriptedMonologue() {
        selectSubmenu(
                this.menu,
                this.scriptedMonologue,
                this.constants.url.baseUrl + this.constants.url.datasets.scriptedMonologue
        );
    }

    public void spontaneousIvr() {
        selectSubmenu(
                this.menu,
                this.spontaneousIvr,
                this.constants.url.baseUrl + this.constants.url.datasets.spontaneousIvr
        );
    }

    public void phoneticLexica() {
        selectSubmenu(
                this.menu,
                this.phoneticLexica,
                this.constants.url.baseUrl + this.constants.url.datasets.phoneticLexica
        );
    }

    public void exploreSpeechDatasets() {
        selectSubmenu(
                this.menu,
                this.exploreSpeechDatasets,
                this.constants.url.baseUrl + this.constants.url.datasets.exploreSpeechDatasets
        );
    }
}
