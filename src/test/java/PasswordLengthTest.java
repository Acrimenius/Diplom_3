import Locators.LoginPage;
import Locators.MainPage;
import Locators.RegistrationPage;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

public class PasswordLengthTest {
    private WebDriver driver;
    private final String shortPassword = "456";

    @Test
    @Step("Error of short password is visible at Chrome")
    public void testVisibilityErrorOfShortPasswordChrome(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.clickRegistrationButton();
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        assertNotNull(objRegistrationPage.waitPasswordErrorVisible(shortPassword));
    }

    @Test
    @Step("Error of short password is visible at Yandex")
    public void testVisibilityErrorOfShortPasswordYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.clickRegistrationButton();
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        assertNotNull(objRegistrationPage.waitPasswordErrorVisible(shortPassword));
    }

    @After
    @Step("Quit browser")
    public void logOut(){
        driver.quit();
    }
}
