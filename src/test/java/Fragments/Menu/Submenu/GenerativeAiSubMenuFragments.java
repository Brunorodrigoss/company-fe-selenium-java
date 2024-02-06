package Fragments.Menu.Submenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenerativeAiSubMenuFragments extends SubMenuCommonFragments {

    By generativeAiDatasets = By.xpath("//*[text()='Generative AI Datasets']");
    By healthcarePromptAndResponseData = By.xpath("//*[text()='Healthcare Prompt and Response Data']");
    By stemQuestionAnswerPairs = By.xpath("//*[text()='STEM Question-Answer Pairs']");
    By generalKnowledgePromptAndResponseDataset = By.xpath("//*[text()='General Knowledge Prompt and Response Dataset']");

    public GenerativeAiSubMenuFragments(WebDriver driver, By menu) {
        super(driver, menu);
    }

    public void generativeAiDatasets() {
        menuUtils.selectSubmenu(this.menu, this.generativeAiDatasets, this.constants.url.datasets.generativeAiDatasets);
    }

    public void healthcarePromptAndResponseData(){
        menuUtils.selectSubmenu(this.menu, this.healthcarePromptAndResponseData, this.constants.url.datasets.healthcarePromptAndResponseData);
    }

    public void stemQuestionAnswerPairs(){
        menuUtils.selectSubmenu(this.menu, this.stemQuestionAnswerPairs, this.constants.url.datasets.stemQuestionAnswerPairs);
    }

    public void generalKnowledgePromptAndResponseDataset() {
        menuUtils.selectSubmenu(this.menu, this.generalKnowledgePromptAndResponseDataset, this.constants.url.datasets.generalKnowledgePromptAndResponseDataset);
    }
}
