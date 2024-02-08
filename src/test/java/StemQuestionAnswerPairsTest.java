import Base.BaseTestClass;
import Pages.StemQuestionAnswerPairsPage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StemQuestionAnswerPairsTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        stemQuestionAnswerPairsPage = new StemQuestionAnswerPairsPage(driver);
        stemQuestionAnswerPairsPage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option STEM Question-Answer Pairs on menu, " +
            "Then the application will be redirect to STEM Question-Answer Pairs  page")
    public void whenUserSelectTheOptionStemQuestionAnswerPairs_ThenTheApplicationWillRedirectToStemQuestionAnswerPairs() {
        stemQuestionAnswerPairsPage.menu.datasets.generativeAi.stemQuestionAnswerPairs();
    }
}
