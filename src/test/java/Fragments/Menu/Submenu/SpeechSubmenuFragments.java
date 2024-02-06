package Fragments.Menu.Submenu;

import Constants.DatasetsConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpeechSubmenuFragments extends SubMenuCommonFragments {

    By spontaneousDialogue = By.xpath("//*[text()='Spontaneous Dialogue']");
    By scriptedMonologue = By.xpath("//*[text()='Scripted Monologue']");
    By spontaneousIvr = By.xpath("//*[text()='Spontaneous IVR']");
    By phoneticLexica = By.xpath("//*[text()='Phonetic Lexica']");
    By exploreSpeechDatasets = By.xpath("//*[text()='Explore Speech Datasets']");

    public SpeechSubmenuFragments(WebDriver driver, By menu) {
        super(driver, menu);
    }

    public void spontaneousDialogue() {
        menuUtils.selectSubmenu(this.menu, this.spontaneousDialogue, this.constants.url.datasets.spontaneousDialogue);
    }

    public void scriptedMonologue() {
        menuUtils.selectSubmenu(this.menu, this.scriptedMonologue, this.constants.url.datasets.scriptedMonologue);
    }

    public void spontaneousIvr() {
        menuUtils.selectSubmenu(this.menu, this.spontaneousIvr, this.constants.url.datasets.spontaneousIvr);
    }

    public void phoneticLexica() {
        menuUtils.selectSubmenu(this.menu, this.phoneticLexica, this.constants.url.datasets.phoneticLexica);
    }

    public void exploreSpeechDatasets() {
        menuUtils.selectSubmenu(this.menu, exploreSpeechDatasets, this.constants.url.datasets.exploreSpeechDatasets);
    }
}
