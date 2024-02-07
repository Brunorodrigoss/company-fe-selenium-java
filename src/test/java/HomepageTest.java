import Base.BaseTestClass;
import Pages.HomepagePage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HomepageTest extends BaseTestClass {

    @BeforeAll
    public void setup() {
        setupDriver();

        homepagePage = new HomepagePage(driver);
        homepagePage.setup();
    }

    @AfterAll
    public void tearDown() {
        this.driver.quit();
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

    @Test
    @DisplayName("When the user select the option Aspect Based Sentiment Analysis on menu, " +
            "Then the application will be redirect to Aspect Based Sentiment Analysis page")
    public void whenUserSelectTheOptionAspectBasedSentimentAnalysis_ThenTheApplicationWillRedirectToAspectBasedSentimentAnalysis() {
        homepagePage.menu.datasets.text.aspectBasedSentimentAnalysis();
    }

    @Test
    @DisplayName("When the user select the option Named Entity Recognition on menu, " +
            "Then the application will be redirect to Named Entity Recognition page")
    public void whenUserSelectTheOptionNamedEntityRecognition_ThenTheApplicationWillRedirectToNamedEntityRecognition() {
        homepagePage.menu.datasets.text.namedEntityRecognition();
    }

    @Test
    @DisplayName("When the user select the option Parallel Corpora on menu, " +
            "Then the application will be redirect to Parallel Corpora page")
    public void whenUserSelectTheOptionParallelCorpora_ThenTheApplicationWillRedirectToParallelCorpora() {
        homepagePage.menu.datasets.text.parallelCorpora();
    }

    @Test
    @DisplayName("When the user select the option Insurance on menu, " +
            "Then the application will be redirect to Insurance page")
    public void whenUserSelectTheOptionInsurance_ThenTheApplicationWillRedirectToInsurance() {
        homepagePage.menu.industries.insurance();
    }

    @Test
    @DisplayName("When the user select the option Finance on menu, " +
            "Then the application will be redirect to Finance page")
    public void whenUserSelectTheOptionFinance_ThenTheApplicationWillRedirectToFinance() {
        homepagePage.menu.industries.finance();
    }

    @Test
    @DisplayName("When the user select the option Telecommunications on menu, " +
            "Then the application will be redirect to Telecommunications page")
    public void whenUserSelectTheOptionTelecommunications_ThenTheApplicationWillRedirectToTelecommunications() {
        homepagePage.menu.industries.telecommunications();
    }

    @Test
    @DisplayName("When the user select the option Retail on menu, " +
            "Then the application will be redirect to Retail page")
    public void whenUserSelectTheOptionRetail_ThenTheApplicationWillRedirectToRetail() {
        homepagePage.menu.industries.retail();
    }
}
