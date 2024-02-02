package Fragments.Menu.Submenu;

import Constants.Constants;
import Utils.MenuUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextSubmenuFragments {
    WebDriver driver;
    MenuUtils menuUtils;
    private final Constants constants = new Constants();
    By menu;
    By aspectBasedSentimentAnalysis = By.xpath("//*[text()='Aspect Based Sentiment Analysis']");
    By namedEntityRecognition = By.xpath("//*[text()='Named Entity Recognition']");
    By parallelCorpora = By.xpath("//*[text()='Parallel Corpora']");

    public TextSubmenuFragments(WebDriver driver, By menu) {
        this.driver = driver;
        this.menuUtils = new MenuUtils(this.driver);
        this.menu = menu;
    }

    public void aspectBasedSentimentAnalysis() {
        menuUtils.selectSubmenu(this.menu, this.aspectBasedSentimentAnalysis, this.constants.url.aspectBasedSentimentAnalysis);
    }

    public void namedEntityRecognition() {
        menuUtils.selectSubmenu(this.menu, this.namedEntityRecognition, this.constants.url.namedEntityRecognition);
    }

    public void parallelCorpora() {
        menuUtils.selectSubmenu(this.menu, this.parallelCorpora, this.constants.url.parallelCorpora);
    }


}
