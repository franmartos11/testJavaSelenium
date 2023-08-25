package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchedItemPage extends BasePage{

    private By item = By.xpath("//a[@href='http://opencart.abstracta.us:80/index.php?route=product/product&product_id=40&search=iphone' and contains(text(), 'iPhone')]")

    public SearchedItemPage(WebDriver driver, WebDriverWait wait) {
        super(driver, null);
    }

    public void clickItem() throws InterruptedException {
        this.clickear(item);
        Thread.sleep(1000);
    }

}