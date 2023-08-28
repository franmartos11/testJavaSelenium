package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {
    private By name = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By phoneNumber = By.id("input-telephone");
    private By password = By.id("input-password");
    private By passwordConfirm = By.id("input-confirm");
    private By subNewsLetter = By.xpath("//label[@class='radio-inline']//input[@type='radio' and @name='newsletter' and @value='0']");
    private By btnAgreePolicy = By.xpath("//input[@type='checkbox' and @name='agree' and @value='1']");
    private By btnContinue = By.xpath("//input[@type='submit' and @value='Continue' and contains(@class, 'btn-primary')]");



    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void writeName(String nam) throws InterruptedException {
        this.sendText(nam, name);
    }

    public void writeLastName(String last) throws InterruptedException {
        this.sendText(last, lastName);
    }

    public void writeEmail(String mail) throws InterruptedException {
        this.sendText(mail, email);
    }
    public void writePhoneNumber(String numb) throws InterruptedException {
        this.sendText(numb, phoneNumber);
    }

    public void writePassword(String pass) throws InterruptedException {
        this.sendText(pass, password);
    }

    public void writeConfirmPass(String pass) throws InterruptedException {
        this.sendText(pass, passwordConfirm);
    }

    public void clickDenySubscription() throws InterruptedException {
        this.clickear(subNewsLetter);
        Thread.sleep(1000);
    }
    public void clickAcceptPolicy() throws InterruptedException {
        this.clickear(btnAgreePolicy);
        Thread.sleep(1000);
    }
    public void clickFinishRegister() throws InterruptedException {
        this.clickear(btnContinue);
        Thread.sleep(1000);
    }

}
