package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreatedPage extends BasePage {

    private By btnContinue = By.xpath("//div[@class='pull-right']//a[@class='btn btn-primary']");


    public AccountCreatedPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickBtnContinue() throws InterruptedException {
        this.clickear(btnContinue);
        Thread.sleep(1000);
    }

}