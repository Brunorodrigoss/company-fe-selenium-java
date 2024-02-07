import Base.BaseTestClass;
import Pages.ExploreSpeechDatasetsPage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ExploreSpeechDatasetsTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        exploreSpeechDatasetsPage = new ExploreSpeechDatasetsPage(driver);
        exploreSpeechDatasetsPage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Explore Speech Datasets on menu, " +
            "Then the application will be redirect to Explore Speech Datasets page")
    public void whenUserSelectTheOptionExploreSpeechDatasets_ThenTheApplicationWillRedirectToExploreSpeechDatasetsPage() {
        exploreSpeechDatasetsPage.menu.datasets.speech.exploreSpeechDatasets();
    }
}
