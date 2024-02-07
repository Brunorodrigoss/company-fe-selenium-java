import Base.BaseTestClass;
import Pages.GenerativeAiDatasetsPage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GenerativeAiDatasetsTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        generativeAiDatasetsPage = new GenerativeAiDatasetsPage(driver);
        generativeAiDatasetsPage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Generative AI Datasets on menu, " +
            "Then the application will be redirect to Generative AI Datasets page")
    public void whenUserSelectTheOptionGenerativeAiDatasets_ThenTheApplicationWillRedirectToGenerativeAiDatasetsPage() {
        generativeAiDatasetsPage.menu.datasets.generativeAi.generativeAiDatasets();
    }
}
