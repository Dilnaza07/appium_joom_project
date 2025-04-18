package mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import mobile.locators.JoomHomeLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@Slf4j
@Setter
public class JoomHomeScreen extends BaseScreen{

    public JoomHomeScreen(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public JoomHomeScreen closeAdvertisement(){
        int xCoordinate = 996;
        int yCoordinate = 190;

        tapByCoordinate(xCoordinate, yCoordinate);
        log.info("Adverisement: clodes");
        return new JoomHomeScreen(driver);
    }

    @AndroidFindBy(xpath = JoomHomeLocators.SKIP_SPINNING_WHEEL_XPATH)
    private WebElement skipQuizButton;

    public JoomHomeScreen skipQuiz(){
        waitUtilElementIsVisible(skipQuizButton);
        skipQuizButton.click();
        log.info("Spinning wheel: Skipped");
        return new JoomHomeScreen(driver);
    }

    @AndroidFindBy(xpath = JoomHomeLocators.PROFILE_BUTTON_XPATH)
    private WebElement openProfileButton;

    public ProfileScreen openLoginScreen(){
        waitUtilElementIsVisible(openProfileButton);
        openProfileButton.click();
        log.info("Profile: Opened");
        return new ProfileScreen(driver);
    }
}
