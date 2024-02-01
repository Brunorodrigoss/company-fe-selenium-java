package Fragments.Menu.Submenu;

import Constants.Constants;
import Utils.MenuUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImageAndVideoSubMenuFragments {
    WebDriver driver;
    MenuUtils menuUtils;
    private final Constants constants = new Constants();
    By menu;
    By selfiesAndPairedIdPhotos = By.xpath("//*[text()='Selfies and Paired ID Photos']");
    By humanImagesAndVideos = By.xpath("//*[text()='Human Images and Videos']");
    By retailImages = By.xpath("//*[text()='Retail Images']");
    By sensitiveImagesAndVideos = By.xpath("//*[text()='Sensitive Images and Videos']");
    By shortFormVideos = By.xpath("//*[text()='Short Form Videos']");
    By pointOfViewImagesDataset = By.xpath("//*[text()='Point-of-View Images Dataset']");
    By producedVideoContent = By.xpath("//*[text()='Produced Video Content']");

    public ImageAndVideoSubMenuFragments(WebDriver driver, By menu) {
        this.driver = driver;
        this.menuUtils = new MenuUtils(this.driver);
        this.menu = menu;
    }

    public void selfiesAndPairedIdPhotos() {
        menuUtils.selectSubmenu(this.menu, this.selfiesAndPairedIdPhotos, this.constants.url.selfiesAndPairedIdPhotos);
    }

    public void humanImagesAndVideos() {
        menuUtils.selectSubmenu(this.menu, this.humanImagesAndVideos, this.constants.url.humanImagesAndVideos);
    }

    public void retailImages() {
        menuUtils.selectSubmenu(this.menu, this.retailImages, this.constants.url.retailImages);
    }

    public void sensitiveImagesAndVideos() {
        menuUtils.selectSubmenu(this.menu, this.sensitiveImagesAndVideos, this.constants.url.sensitiveImagesAndVideos);
    }

    public void shortFormVideos() {
        menuUtils.selectSubmenu(this.menu, this.shortFormVideos, this.constants.url.shortFormVideos);
    }

    public void pointOfViewImagesDataset() {
        menuUtils.selectSubmenu(this.menu, this.pointOfViewImagesDataset, this.constants.url.pointOfViewImagesDataset);
    }

    public void producedVideoContent() {
        menuUtils.selectSubmenu(this.menu, this.producedVideoContent, this.constants.url.producedVideoContent);
    }
}
