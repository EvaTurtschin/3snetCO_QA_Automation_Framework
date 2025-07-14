package pages;

import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    private HomePageHeader header;
    private HomePageAdvetisers advetisers;
    private HomePageVerticals verticals;

    public HomePage(WebDriver driver) {
        super(driver);
        this.header = new HomePageHeader(driver);
        this.advetisers = new HomePageAdvetisers(driver);
        this.verticals = new HomePageVerticals(driver);
    }

    public HomePageHeader header() {
        return header;
    }

    public HomePageAdvetisers advetisers() {
        return advetisers;
    }

    public HomePageVerticals verticals() {
        return verticals;
    }

    public String getHomePageUrl() {
        return "https://3snet.co/";
    }

}
