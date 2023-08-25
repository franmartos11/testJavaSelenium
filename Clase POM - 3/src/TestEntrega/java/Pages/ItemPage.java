package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ItemPage extends BasePage {
    private By buttonAddCart = By.id("button-cart")

    public ItemPage(WebDriver driver, WebDriverWait wait) {
        super(driver, null);
    }

    public void clickButtonAddCart() throws InterruptedException {
        this.clickear(buttonAddCart);
        Thread.sleep(1000);
    }

}