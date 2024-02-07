import Base.BaseTestClass;
import Pages.HealthcarePromptAndResponseDataPage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HealthcarePromptAndResponseDataTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        healthcarePromptAndResponseDataPage = new HealthcarePromptAndResponseDataPage(driver);
        healthcarePromptAndResponseDataPage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Healthcare Prompt and Response Data on menu, " +
            "Then the application will be redirect to Healthcare Prompt and Response Data page")
    public void whenUserSelectTheOptionHealthcarePromptAndResponseData_ThenTheApplicationWillRedirectToHealthcarePromptAndResponseDataPage() {
        healthcarePromptAndResponseDataPage.menu.datasets.generativeAi.healthcarePromptAndResponseData();
    }
}
