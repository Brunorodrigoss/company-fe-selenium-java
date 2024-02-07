package Fragments.Menu.Submenu;

import Common.MenuCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenerativeAiSubMenuFragments extends MenuCommon {
    By generativeAiDatasets = By.xpath("//*[text()='Generative AI Datasets']");
    By healthcarePromptAndResponseData = By.xpath("//*[text()='Healthcare Prompt and Response Data']");
    By stemQuestionAnswerPairs = By.xpath("//*[text()='STEM Question-Answer Pairs']");
    By generalKnowledgePromptAndResponseDataset = By.xpath("//*[text()='General Knowledge Prompt and Response Dataset']");

    public GenerativeAiSubMenuFragments(WebDriver driver, By menu) {
        super(driver, menu);
    }

    public void generativeAiDatasets() {
        selectSubmenu(
                this.menu,
                this.generativeAiDatasets,
                this.constants.url.baseUrl + this.constants.url.datasets.generativeAiDatasets
        );
    }

    public void healthcarePromptAndResponseData(){
        selectSubmenu(
                this.menu,
                this.healthcarePromptAndResponseData,
                this.constants.url.baseUrl + this.constants.url.datasets.healthcarePromptAndResponseData
        );
    }

    public void stemQuestionAnswerPairs(){
        selectSubmenu(
                this.menu,
                this.stemQuestionAnswerPairs,
                this.constants.url.baseUrl + this.constants.url.datasets.stemQuestionAnswerPairs
        );
    }

    public void generalKnowledgePromptAndResponseDataset() {
        selectSubmenu(
                this.menu,
                this.generalKnowledgePromptAndResponseDataset,
                this.constants.url.baseUrl + this.constants.url.datasets.generalKnowledgePromptAndResponseDataset
        );
    }
}
