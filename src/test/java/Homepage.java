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
}
