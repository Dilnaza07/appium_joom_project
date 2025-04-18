package tests.account;

import mobile.helper.TestDescription;
import mobile.screens.JoomHomeScreen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.BaseTest;

import static mobile.enums.LoginTitle.LOGIN_TITLE;

public class GetProfileScreenTest extends BaseTest {

    @Test
    @DisplayName("Open Login Screen")
    @TestDescription("Close advirtisement, skip the quiz, open login screen")
    public void testGetLoginScreen(){
        JoomHomeScreen joomHomeScreen = new JoomHomeScreen(driver);
        joomHomeScreen
                .closeAdvertisement()
                .skipQuiz()
                .openLoginScreen()
                .verifyLoginScreenOpened(LOGIN_TITLE);
    }
}
