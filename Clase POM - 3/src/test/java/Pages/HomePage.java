package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage extends BasePage {
     public HomePage(WebDriver driver, WebDriverWait wait) {
          super(driver, wait);
     }

     // Creo variables para llamar luego de la pag principal //
     private By btnMiCuenta = By.linkText("My Account");

     private By btnRegister2 = By.className("dropdown-menu.dropdown-menu-right");

     private By btnRegister = By.linkText("Register");


     // acciones con los componentes seleccionados //



     public void clickBtnMiCuenta() throws InterruptedException {
          this.clickear(btnMiCuenta);
     }

     public void clickBtnRegister() throws InterruptedException {
          this.clickear(btnRegister);
     }

}