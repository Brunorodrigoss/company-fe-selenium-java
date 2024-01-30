import Constants.Constants;
import Pages.HomepagePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Homepage {
    private final Constants constants = new Constants();
    private WebDriver driver;
    private HomepagePage homepagePage;

    @BeforeAll
    public void setup() {
        System.setProperty(constants.config.driverKey, constants.config.driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(constants.config.driveImplicitlyWait, TimeUnit.SECONDS);

        homepagePage = new HomepagePage(driver);
        homepagePage.setup(constants.url.baseUrl);
    }

    @AfterAll
    public void tearDown() {
        this.driver.close();
    }

    @Test
    @DisplayName("When the user select the option Spontaneous Dialogue on menu, " +
            "Then the application will be redirect to Spontaneous Dialogue page")
    public void whenUserSelectTheOptionSpontaneousDialogue_ThenTheApplicationWillRedirectToSpontaneousDialoguePage() {
        homepagePage.menu.datasets.speech.spontaneousDialogue();
    }

    @Test
    @DisplayName("When the user select the option Scripted Monologue on menu, " +
            "Then the application will be redirect to Scripted Monologue page")
    public void whenUserSelectTheOptionScriptedMonologue_ThenTheApplicationWillRedirectToScriptedMonologuePage() {
        homepagePage.menu.datasets.speech.scriptedMonologue();
    }

    @Test
    @DisplayName("When the user select the option Spontaneous IVR on menu, " +
            "Then the application will be redirect to Spontaneous IVR page")
    public void whenUserSelectTheOptionSpontaneousIvr_ThenTheApplicationWillRedirectToSpontaneousIvrPage() {
        homepagePage.menu.datasets.speech.spontaneousIvr();
    }

    @Test
    @DisplayName("When the user select the option Phonetic Lexica on menu, " +
            "Then the application will be redirect to Phonetic Lexica page")
    public void whenUserSelectTheOptionPhoneticLexica_ThenTheApplicationWillRedirectToPhoneticLexicaPage() {
        homepagePage.menu.datasets.speech.phoneticLexica();
    }

    @Test
    @DisplayName("When the user select the option Explore Speech Datasets on menu, " +
            "Then the application will be redirect to Explore Speech Datasets page")
    public void whenUserSelectTheOptionExploreSpeechDatasets_ThenTheApplicationWillRedirectToExploreSpeechDatasetsPage() {
        homepagePage.menu.datasets.speech.exploreSpeechDatasets();
    }
}
