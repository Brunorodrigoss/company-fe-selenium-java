package Fragments.Menu.Submenu;

import Common.MenuCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImageAndVideoSubMenuFragments extends MenuCommon {

    By selfiesAndPairedIdPhotos = By.xpath("//*[text()='Selfies and Paired ID Photos']");
    By humanImagesAndVideos = By.xpath("//*[text()='Human Images and Videos']");
    By retailImages = By.xpath("//*[text()='Retail Images']");
    By sensitiveImagesAndVideos = By.xpath("//*[text()='Sensitive Images and Videos']");
    By shortFormVideos = By.xpath("//*[text()='Short Form Videos']");
    By pointOfViewImagesDataset = By.xpath("//*[text()='Point-of-View Images Dataset']");
    By producedVideoContent = By.xpath("//*[text()='Produced Video Content']");

    public ImageAndVideoSubMenuFragments(WebDriver driver, By menu) {
        super(driver, menu);
    }

    public void selfiesAndPairedIdPhotos() {
        selectSubmenu(
                this.menu,
                this.selfiesAndPairedIdPhotos,
                this.constants.url.baseUrl + this.constants.url.datasets.selfiesAndPairedIdPhotos
        );
    }

    public void humanImagesAndVideos() {
        selectSubmenu(
                this.menu,
                this.humanImagesAndVideos,
                this.constants.url.baseUrl + this.constants.url.datasets.humanImagesAndVideos
        );
    }

    public void retailImages() {
        selectSubmenu(
                this.menu,
                this.retailImages,
                this.constants.url.baseUrl + this.constants.url.datasets.retailImages
        );
    }

    public void sensitiveImagesAndVideos() {
        selectSubmenu(
                this.menu,
                this.sensitiveImagesAndVideos,
                this.constants.url.baseUrl + this.constants.url.datasets.sensitiveImagesAndVideos
        );
    }

    public void shortFormVideos() {
        selectSubmenu(
                this.menu,
                this.shortFormVideos,
                this.constants.url.baseUrl + this.constants.url.datasets.shortFormVideos
        );
    }

    public void pointOfViewImagesDataset() {
        selectSubmenu(
                this.menu,
                this.pointOfViewImagesDataset,
                this.constants.url.baseUrl + this.constants.url.datasets.pointOfViewImagesDataset
        );
    }

    public void producedVideoContent() {
        selectSubmenu(
                this.menu,
                this.producedVideoContent,
                this.constants.url.baseUrl + this.constants.url.datasets.producedVideoContent
        );
    }
}
