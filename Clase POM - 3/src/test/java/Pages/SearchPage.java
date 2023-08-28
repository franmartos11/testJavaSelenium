package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {

     private By searchBar = By.xpath("//div[@id='search']//input[@name='search']");

     private By searchBtn = By.xpath("//button[@class='btn btn-default btn-lg']");
     public SearchPage(WebDriver driver, WebDriverWait wait) {
          super(driver, null);
     }

     public void writeSearch(String item) throws InterruptedException {
          this.sendText(item, searchBar);
          Thread.sleep(500);
     }
     public void selectSearchBtn() throws InterruptedException{
          this.clickear(searchBar);
          Thread.sleep(1000);
     }

}