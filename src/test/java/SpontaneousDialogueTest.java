import Base.BaseTestClass;
import Pages.SpontaneousDialoguePage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SpontaneousDialogueTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        spontaneousDialoguePage = new SpontaneousDialoguePage(driver);
        spontaneousDialoguePage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Spontaneous Dialogue on menu, " +
            "Then the application will be redirect to Spontaneous Dialogue page")
    public void whenUserSelectTheOptionSpontaneousDialogue_ThenTheApplicationWillRedirectToSpontaneousDialoguePage() {
        spontaneousDialoguePage.menu.datasets.speech.spontaneousDialogue();
    }
}
