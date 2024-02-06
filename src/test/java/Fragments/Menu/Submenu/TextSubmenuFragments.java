package Fragments.Menu.Submenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextSubmenuFragments extends SubMenuCommonFragments {

    By aspectBasedSentimentAnalysis = By.xpath("//*[text()='Aspect Based Sentiment Analysis']");
    By namedEntityRecognition = By.xpath("//*[text()='Named Entity Recognition']");
    By parallelCorpora = By.xpath("//*[text()='Parallel Corpora']");

    public TextSubmenuFragments(WebDriver driver, By menu) {
        super(driver, menu);
    }

    public void aspectBasedSentimentAnalysis() {
        menuUtils.selectSubmenu(this.menu, this.aspectBasedSentimentAnalysis, this.constants.url.datasets.aspectBasedSentimentAnalysis);
    }

    public void namedEntityRecognition() {
        menuUtils.selectSubmenu(this.menu, this.namedEntityRecognition, this.constants.url.datasets.namedEntityRecognition);
    }

    public void parallelCorpora() {
        menuUtils.selectSubmenu(this.menu, this.parallelCorpora, this.constants.url.datasets.parallelCorpora);
    }
}
