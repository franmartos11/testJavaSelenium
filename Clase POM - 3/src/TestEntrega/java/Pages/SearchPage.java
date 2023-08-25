package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {

     private By searchBar = By.xpath("//div[@id='search']//input[@name='search']")

     public SearchPage(WebDriver driver, WebDriverWait wait) {
          super(driver, null);
     }

     public void writeSearch(String item) throws InterruptedException {
          this.sendText(item, searchBar);
          Thread.sleep(500);
          this.sendKey(Keys.ENTER, searchBox);
     }
}