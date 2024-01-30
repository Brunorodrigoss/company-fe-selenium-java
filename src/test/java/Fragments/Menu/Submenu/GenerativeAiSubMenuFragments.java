package Fragments.Menu.Submenu;

import Constants.Constants;
import Utils.MenuUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenerativeAiSubMenuFragments {
    WebDriver driver;
    MenuUtils menuUtils;
    private final Constants constants = new Constants();
    By menu;
    By generativeAiDatasets = By.xpath("//*[text()='Generative AI Datasets']");
    By healthcarePromptAndResponseData = By.xpath("//*[text()='Healthcare Prompt and Response Data']");
    By stemQuestionAnswerPairs = By.xpath("//*[text()='STEM Question-Answer Pairs']");
    By generalKnowledgePromptAndResponseDataset = By.xpath("//*[text()='General Knowledge Prompt and Response Dataset']");

    public GenerativeAiSubMenuFragments(WebDriver driver, By menu) {
        this.driver = driver;
        this.menuUtils = new MenuUtils(this.driver);
        this.menu = menu;
    }

    public void generativeAiDatasets() {
        menuUtils.selectSubmenu(this.menu, this.generativeAiDatasets, this.constants.url.generativeAiDatasets);
    }

    public void healthcarePromptAndResponseData(){
        menuUtils.selectSubmenu(this.menu, this.healthcarePromptAndResponseData, this.constants.url.healthcarePromptAndResponseData);
    }

    public void stemQuestionAnswerPairs(){
        menuUtils.selectSubmenu(this.menu, this.stemQuestionAnswerPairs, this.constants.url.stemQuestionAnswerPairs);
    }

    public void generalKnowledgePromptAndResponseDataset() {
        menuUtils.selectSubmenu(this.menu, this.generalKnowledgePromptAndResponseDataset, this.constants.url.generalKnowledgePromptAndResponseDataset);
    }


}
