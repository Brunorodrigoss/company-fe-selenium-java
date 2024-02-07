package Base;

import Constants.Constants;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTestClass {
    public final Constants constants = new Constants();
    public WebDriver driver;
    public HomepagePage homepagePage;
    public SpontaneousDialoguePage spontaneousDialoguePage;
    public ScriptedMonologuePage scriptedMonologuePage;
    public SpontaneousIvrPage spontaneousIvrPage;
    public PhoneticLexicaPage phoneticLexicaPage;
    public ExploreSpeechDatasetsPage exploreSpeechDatasetsPage;
    public PodcastsDatasetsPage podcastsDatasetsPage;
    public LiveVoiceAssistantInquiriesPage liveVoiceAssistantInquiriesPage;
    public GenerativeAiDatasetsPage generativeAiDatasetsPage;

    public void setupDriver() {
        System.setProperty(constants.config.driverKey, constants.config.driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(constants.config.driveImplicitlyWait));
    }
}
