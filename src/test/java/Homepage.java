import Constants.Constants;
import Pages.HomepagePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Homepage {
    private final Constants constants = new Constants();
    private WebDriver driver;
    private HomepagePage homepagePage;

    @BeforeAll
    public void setup() {
        System.setProperty(constants.config.driverKey, constants.config.driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(constants.config.driveImplicitlyWait, TimeUnit.SECONDS);

        homepagePage = new HomepagePage(driver);
        homepagePage.setup(constants.url.baseUrl);
    }

    @AfterAll
    public void tearDown() {
        this.driver.close();
    }

    @Test
    @DisplayName("When the user select the option Spontaneous Dialogue on menu, " +
            "Then the application will be redirect to Spontaneous Dialogue page")
    public void whenUserSelectTheOptionSpontaneousDialogue_ThenTheApplicationWillRedirectToSpontaneousDialoguePage() {
        homepagePage.menu.datasets.speech.spontaneousDialogue();
    }

    @Test
    @DisplayName("When the user select the option Scripted Monologue on menu, " +
            "Then the application will be redirect to Scripted Monologue page")
    public void whenUserSelectTheOptionScriptedMonologue_ThenTheApplicationWillRedirectToScriptedMonologuePage() {
        homepagePage.menu.datasets.speech.scriptedMonologue();
    }

    @Test
    @DisplayName("When the user select the option Spontaneous IVR on menu, " +
            "Then the application will be redirect to Spontaneous IVR page")
    public void whenUserSelectTheOptionSpontaneousIvr_ThenTheApplicationWillRedirectToSpontaneousIvrPage() {
        homepagePage.menu.datasets.speech.spontaneousIvr();
    }

    @Test
    @DisplayName("When the user select the option Phonetic Lexica on menu, " +
            "Then the application will be redirect to Phonetic Lexica page")
    public void whenUserSelectTheOptionPhoneticLexica_ThenTheApplicationWillRedirectToPhoneticLexicaPage() {
        homepagePage.menu.datasets.speech.phoneticLexica();
    }

    @Test
    @DisplayName("When the user select the option Explore Speech Datasets on menu, " +
            "Then the application will be redirect to Explore Speech Datasets page")
    public void whenUserSelectTheOptionExploreSpeechDatasets_ThenTheApplicationWillRedirectToExploreSpeechDatasetsPage() {
        homepagePage.menu.datasets.speech.exploreSpeechDatasets();
    }

    @Test
    @DisplayName("When the user select the option Podcasts Datasets on menu, " +
            "Then the application will be redirect to Podcasts Datasets page")
    public void whenUserSelectTheOptionPodcastsDatasets_ThenTheApplicationWillRedirectToPodcastsDatasetsPage() {
        homepagePage.menu.datasets.liveData.podcastsDatasets();
    }
    @Test
    @DisplayName("When the user select the option Live Voice Assistant Inquiries on menu, " +
            "Then the application will be redirect to Live Voice Assistant Inquiries page")
    public void whenUserSelectTheOptionLiveVoiceAssistantInquiries_ThenTheApplicationWillRedirectToLiveVoiceAssistantInquiriesPage() {
        homepagePage.menu.datasets.liveData.liveVoiceAssistantInquiries();
    }

    @Test
    @DisplayName("When the user select the option Generative AI Datasets on menu, " +
            "Then the application will be redirect to Generative AI Datasets page")
    public void whenUserSelectTheOptionGenerativeAiDatasets_ThenTheApplicationWillRedirectToGenerativeAiDatasetsPage() {
        homepagePage.menu.datasets.generativeAi.generativeAiDatasets();
    }

    @Test
    @DisplayName("When the user select the option Healthcare Prompt and Response Data on menu, " +
            "Then the application will be redirect to Healthcare Prompt and Response Data page")
    public void whenUserSelectTheOptionHealthcarePromptAndResponseData_ThenTheApplicationWillRedirectToHealthcarePromptAndResponseDataPage() {
        homepagePage.menu.datasets.generativeAi.healthcarePromptAndResponseData();
    }

    @Test
    @DisplayName("When the user select the option STEM Question-Answer Pairs on menu, " +
            "Then the application will be redirect to STEM Question-Answer Pairs  page")
    public void whenUserSelectTheOptionStemQuestionAnswerPairs_ThenTheApplicationWillRedirectToStemQuestionAnswerPairs() {
        homepagePage.menu.datasets.generativeAi.stemQuestionAnswerPairs();
    }

    @Test
    @DisplayName("When the user select the option General Knowledge Prompt and Response Dataset on menu, " +
            "Then the application will be redirect to General Knowledge Prompt and Response Dataset page")
    public void whenUserSelectTheOptionGeneralKnowledgePromptAndResponseDataset_ThenTheApplicationWillRedirectToGeneralKnowledgePromptAndResponseDataset() {
        homepagePage.menu.datasets.generativeAi.generalKnowledgePromptAndResponseDataset();
    }

    @Test
    @DisplayName("When the user select the option Health Screening Reports on menu, " +
            "Then the application will be redirect to Health Screening Reports page")
    public void whenUserSelectTheOptionHealthScreeningReports_ThenTheApplicationWillRedirectToHealthScreeningReports() {
        homepagePage.menu.datasets.miscellaneous.healthScreeningReports();
    }

    @Test
    @DisplayName("When the user select the option Medical User Engagement Analytics on menu, " +
            "Then the application will be redirect to Medical User Engagement Analytics page")
    public void whenUserSelectTheOptionMedicalUserEngagementAnalytics_ThenTheApplicationWillRedirectToMedicalUserEngagementAnalytics() {
        homepagePage.menu.datasets.miscellaneous.medicalUserEngagementAnalytics();
    }

    @Test
    @DisplayName("When the user select the option Selfies and Paired ID Photos on menu, " +
            "Then the application will be redirect to Selfies and Paired ID Photos page")
    public void whenUserSelectTheOptionSelfiesAndPairedIdPhotos_ThenTheApplicationWillRedirectToSelfiesAndPairedIdPhotos() {
        homepagePage.menu.datasets.imageAndVideo.selfiesAndPairedIdPhotos();
    }

    @Test
    @DisplayName("When the user select the option Human Images and Videos on menu, " +
            "Then the application will be redirect to Human Images and Videos page")
    public void whenUserSelectTheOptionHumanImagesAndVideos_ThenTheApplicationWillRedirectToHumanImagesAndVideos() {
        homepagePage.menu.datasets.imageAndVideo.humanImagesAndVideos();
    }

    @Test
    @DisplayName("When the user select the option Retail Images on menu, " +
            "Then the application will be redirect to Retail Images page")
    public void whenUserSelectTheOptionRetailImages_ThenTheApplicationWillRedirectToRetailImages() {
        homepagePage.menu.datasets.imageAndVideo.retailImages();
    }

    @Test
    @DisplayName("When the user select the option Sensitive Images and Videos on menu, " +
            "Then the application will be redirect to Sensitive Images and Videos page")
    public void whenUserSelectTheOptionSensitiveImagesAndVideos_ThenTheApplicationWillRedirectToSensitiveImagesAndVideos() {
        homepagePage.menu.datasets.imageAndVideo.sensitiveImagesAndVideos();
    }

    @Test
    @DisplayName("When the user select the option Short Form Videos on menu, " +
            "Then the application will be redirect to Short Form Videos page")
    public void whenUserSelectTheOptionShortFormVideos_ThenTheApplicationWillRedirectToShortFormVideos() {
        homepagePage.menu.datasets.imageAndVideo.shortFormVideos();
    }

    @Test
    @DisplayName("When the user select the option Point-of-View Images Dataset on menu, " +
            "Then the application will be redirect to Point-of-View Images Dataset page")
    public void whenUserSelectTheOptionPointOfViewImagesDataset_ThenTheApplicationWillRedirectToPointOfViewImagesDataset() {
        homepagePage.menu.datasets.imageAndVideo.pointOfViewImagesDataset();
    }

    @Test
    @DisplayName("When the user select the option Produced Video Content on menu, " +
            "Then the application will be redirect to Produced Video Content page")
    public void whenUserSelectTheOptionProducedVideoContent_ThenTheApplicationWillRedirectToProducedVideoContent() {
        homepagePage.menu.datasets.imageAndVideo.producedVideoContent();
    }
}
