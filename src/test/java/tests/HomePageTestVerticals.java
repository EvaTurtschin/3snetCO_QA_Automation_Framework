package tests;

import io.qameta.allure.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

@Epic("Home Page")
@Feature("Verticals section")
public class HomePageTestVerticals extends BaseTest{

    @Test(description = "Hovering over the Gambling icon changes its color and starts animation")
    @Story("Gambling icon behavior in Verticals section")
    @Description("Verify color change and animation on hover over the Gambling icon in the Verticals section.")
    public void GamblingVerticalCanChangeItsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.verticals().verifyGamblingVerticalChangesColorOnHover();
        homePage.verticals().verifyGamblingImageAnimationOnHover();
    }





}
