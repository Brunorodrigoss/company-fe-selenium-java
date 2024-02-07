import Base.BaseTestClass;
import Pages.PodcastsDatasetsPage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PodcastsDatasetsTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        podcastsDatasetsPage = new PodcastsDatasetsPage(driver);
        podcastsDatasetsPage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Podcasts Datasets on menu, " +
            "Then the application will be redirect to Podcasts Datasets page")
    public void whenUserSelectTheOptionPodcastsDatasets_ThenTheApplicationWillRedirectToPodcastsDatasetsPage() {
        podcastsDatasetsPage.menu.datasets.liveData.podcastsDatasets();
    }
}
