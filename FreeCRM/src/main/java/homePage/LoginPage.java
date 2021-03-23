package homePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homePage.HomePageWebElement.*;

public class LoginPage extends WebAPI {

    @FindBy(css = loginButtonElement)public WebElement loginLink;
    @FindBy(xpath = emailFieldElement)public WebElement emailfield;
    @FindBy(css = passwordFieldElement)public WebElement passwordfield;
    @FindBy(css = loginfieldElement)public WebElement loginButton;

    public void loginFunctionality() throws InterruptedException {

        loginLink.click();
        Thread.sleep(5000);
        emailfield.sendKeys("arafat.rahman93@gmail.com");
        Thread.sleep(5000);
        passwordfield.sendKeys("Arafat147");
        Thread.sleep(5000);
        loginButton.click();
        Thread.sleep(5000);

    }

}
