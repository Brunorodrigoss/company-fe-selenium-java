import Base.BaseTestClass;
import Pages.LiveVoiceAssistantInquiriesPage;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LiveVoiceAssistantInquiriesTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        liveVoiceAssistantInquiriesPage = new LiveVoiceAssistantInquiriesPage(driver);
        liveVoiceAssistantInquiriesPage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    @DisplayName("When the user select the option Live Voice Assistant Inquiries on menu, " +
            "Then the application will be redirect to Live Voice Assistant Inquiries page")
    public void whenUserSelectTheOptionLiveVoiceAssistantInquiries_ThenTheApplicationWillRedirectToLiveVoiceAssistantInquiriesPage() {
        liveVoiceAssistantInquiriesPage.menu.datasets.liveData.liveVoiceAssistantInquiries();
    }
}
