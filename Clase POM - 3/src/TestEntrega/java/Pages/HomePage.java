package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

     // Creo variables para llamar luego de la pag principal //
     private By btnMiCuenta = By.className("dropdown-toggle");

     private By btnRegister = By.className("dropdown-menu dropdown-menu-right");

     private By btnRegister2 = By.linkText("Register");


     // acciones con los componentes seleccionados //

     public LoginPage(WebDriver driver, WebDriverWait wait) {
          super(driver, null);
     }

     public void clickBtnMiCuenta() throws InterruptedException {
          this.clickear(btnMiCuenta);
     }

     public void clickBtnRegister() throws InterruptedException {
          this.clickear(btnRegister);
     }

}