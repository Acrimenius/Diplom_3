import Locators.LoginPage;
import Locators.PasswordRecoverPage;
import Locators.RegistrationPage;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import Locators.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;
    private final String email = "daivz88@gmail.com";
    private final String password = "samurai4321";

    @Test
    @Step("Login via Personal Account button")
    public void testLoginPersonalAccountButtonChrome(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via Enter account button")
    public void testLoginEnterAccountButtonChrome(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via registration form")
    public void testLoginRegistrationFormChrome(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        objRegistrationPage.scrollToLoginButton();
        objRegistrationPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via recover password page")
    public void testLoginRecoverPasswordPageChrome(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        PasswordRecoverPage objRecoverPasswordPage = new PasswordRecoverPage(driver);
        objRecoverPasswordPage.scrollToLoginButton();
        objRecoverPasswordPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via Personal Account button")
    public void testLoginPersonalAccountButtonYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via Enter account button")
    public void testLoginEnterAccountButtonYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via registration form")
    public void testLoginRegistrationFormYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        objRegistrationPage.scrollToLoginButton();
        objRegistrationPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Step("Login via recover password page")
    public void testLoginRecoverPasswordPageYandex(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        PasswordRecoverPage objRecoverPasswordPage = new PasswordRecoverPage(driver);
        objRecoverPasswordPage.scrollToLoginButton();
        objRecoverPasswordPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @After
    @Step("Quit browser")
    public void logOut(){
        driver.quit();
    }
}
