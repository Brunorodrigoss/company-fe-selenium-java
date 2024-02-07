import Base.BaseTestClass;
import Pages.PhoneticLexicaPage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PhoneticLexicaTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        phoneticLexicaPage = new PhoneticLexicaPage(driver);
        phoneticLexicaPage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Phonetic Lexica on menu, " +
            "Then the application will be redirect to Phonetic Lexica page")
    public void whenUserSelectTheOptionPhoneticLexica_ThenTheApplicationWillRedirectToPhoneticLexicaPage() {
        phoneticLexicaPage.menu.datasets.speech.phoneticLexica();
    }
}
