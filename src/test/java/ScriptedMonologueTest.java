import Base.BaseTestClass;
import Pages.ScriptedMonologuePage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScriptedMonologueTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        scriptedMonologuePage = new ScriptedMonologuePage(driver);
        scriptedMonologuePage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Scripted Monologue on menu, " +
            "Then the application will be redirect to Scripted Monologue page")
    public void whenUserSelectTheOptionScriptedMonologue_ThenTheApplicationWillRedirectToScriptedMonologuePage() {
        scriptedMonologuePage.menu.datasets.speech.scriptedMonologue();
    }
}
