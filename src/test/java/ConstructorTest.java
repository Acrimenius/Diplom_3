import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import Locators.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;

import java.util.concurrent.TimeUnit;

public class ConstructorTest {
    private WebDriver driver;

    @Test
    @Step("Check click on the sauce tab")
    public void testClickSauceTabChrome() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickSaucesTab();
        assertTrue(objMainPage.getSauceTabClassValue().contains("current"));
    }

    @Test
    @Step("Check click on the ingredients tab")
    public void testClickIngredientsTabChrome() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickIngredientsTab();
        assertTrue(objMainPage.getIngredientsTabClassValue().contains("current"));
    }

    @Test
    @Step("Check click on the bun tab")
    public void testClickBunTabChrome() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickIngredientsTab();
        objMainPage.clickBunTab();
        assertTrue(objMainPage.getBunTabClassValue().contains("current"));
    }

    @Test
    @Step("Check click on the sauce tab")
    public void testClickSauceTabYandex() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickSaucesTab();
        assertTrue(objMainPage.getSauceTabClassValue().contains("current"));
    }

    @Test
    @Step("Check click on the ingredients tab")
    public void testClickIngredientsTabYandex() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickIngredientsTab();
        assertTrue(objMainPage.getIngredientsTabClassValue().contains("current"));
    }

    @Test
    @Step("Check click on the bun tab")
    public void testClickBunTabYandex() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickIngredientsTab();
        objMainPage.clickBunTab();
        assertTrue(objMainPage.getBunTabClassValue().contains("current"));
    }

    @After
    @Step("Quit browser")
    public void logOut(){
        driver.quit();
    }
}
