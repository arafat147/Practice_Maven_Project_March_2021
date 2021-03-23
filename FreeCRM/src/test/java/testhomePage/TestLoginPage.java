package testhomePage;

import common.WebAPI;
import homePage.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLoginPage extends WebAPI {

    LoginPage loginPage;
    public void initSetup(){
        loginPage = PageFactory.initElements(driver,LoginPage.class);
    }

    @Test
    public void testLoginFunctionality() throws InterruptedException {

        initSetup();
        loginPage.loginFunctionality();

    }

}
