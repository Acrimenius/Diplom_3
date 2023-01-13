package Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    private WebDriver driver;
    private By nameField = By.xpath("//label[text()='Имя']/following-sibling::input");
    private By emailField = By.xpath("//label[text()='Email']/following-sibling::input");
    private By passwordField = By.xpath("//input[@type='password']");
    private By registrationButton = By.className("button_button__33qZ0");
    private By loginButton = By.className("Auth_link__1fOlj");
    private By passwordError = By.className("input__error");


    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterName(String name){
//        driver.findElement(nameField).click();
//        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);
    }
    public void enterEmail(String email){
//        driver.findElement(emailField).click();
//        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password){
//        driver.findElement(passwordField).click();
//        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickRegistrationButton(){
        driver.findElement(registrationButton).click();
    }

    public void registration(String name, String email, String password){
        enterName(name);
        enterEmail(email);
        enterPassword(password);
        clickRegistrationButton();
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public WebElement waitPasswordErrorVisible(String password){
        enterPassword(password);
        driver.findElement(emailField).click();
        return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(passwordError));
    }

    public void scrollToLoginButton(){
        WebElement element = driver.findElement(loginButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

}