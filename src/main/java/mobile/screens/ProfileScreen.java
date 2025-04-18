package mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobile.enums.LoginTitle;
import mobile.helper.Helper;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfileScreen extends BaseScreen {

    private static final Logger log = LoggerFactory.getLogger(ProfileScreen.class);

    public ProfileScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void verifyLoginScreenOpened(LoginTitle loginTitle){
        assertThat(Helper.isTextOnScreen(loginTitle.getValue()))
                .as("Check if the text '%s' is visible on screen", loginTitle.getValue())
                .isTrue();

        log.info("Verified '{}' text is visible", loginTitle.getValue());

    }
}
