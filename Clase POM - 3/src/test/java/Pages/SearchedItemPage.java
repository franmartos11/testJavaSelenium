package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchedItemPage extends BasePage{

    private By itemCart = By.xpath("//div[@class='button-group']/button[1]");

    public SearchedItemPage(WebDriver driver, WebDriverWait wait) {
        super(driver, null);
    }

    public void clickAddItemCart() throws InterruptedException {
        this.clickear(itemCart);
        Thread.sleep(1000);
    }
}