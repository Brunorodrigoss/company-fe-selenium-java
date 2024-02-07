import Base.BaseTestClass;
import Pages.SpontaneousIvrPage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SpontaneousIvrTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        spontaneousIvrPage = new SpontaneousIvrPage(driver);
        spontaneousIvrPage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Spontaneous IVR on menu, " +
            "Then the application will be redirect to Spontaneous IVR page")
    public void whenUserSelectTheOptionSpontaneousIvr_ThenTheApplicationWillRedirectToSpontaneousIvrPage() {
        spontaneousIvrPage.menu.datasets.speech.spontaneousIvr();
    }
}
