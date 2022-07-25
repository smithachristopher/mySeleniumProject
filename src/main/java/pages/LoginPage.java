package pages;

import org.example.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {

    @FindBy(xpath = "//*[@id='username']")
    WebElement username;

    @FindBy(xpath = "//*[@id='username']")
    WebElement password;

    @FindBy(xpath = "//*[@id='username']")
    WebElement submit;

    @FindBy(xpath = "//*[@id='username']")
    WebElement error;




}
