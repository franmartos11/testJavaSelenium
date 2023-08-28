package Test;

import Pages.RegisterPage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Pages.RegisterPage;
import Pages.HomePage;
import Pages.AccountCreatedPage;
import Pages.SearchPage;
import Pages.SearchedItemPage;


public class TestRegistro {

    public WebDriver driver;
    public WebDriverWait wait;
    @BeforeAll
    public static void crearReporte() {
            extent = ExtentFactory.getInstance();
            extent.attachReporter(info);
            }

    @BeforeEach
    public void setUp() throws InterruptedException {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofMillis(2000));
            HomePage homePage = new HomePage(driver, wait);
            homePage.setup();
            homePage.url("https://opencart.abstracta.us/index.php?route=common/home");
            }
    @Test
    @tag("Seleccion Registro")
    public void succesOnSelectingRegister() throws InterruptedException {
        ExtentTest test = extent.createTest("Seleccion de registro exitosa");
        test.log(Status.INFO, "Comienza el Test");
        HomePage homePage = new HomePage(driver, wait);

        homePage.clickBtnMiCuenta();
        test.log(Status.PASS, "Seleccion de cuenta exitosa");

        homePage.clickBtnRegister();
        test.log(Status.PASS, "Ingresar a seccion de registro");
    }
    @Test
    @tag("Ingreso Datos Registro")
    public void succesfullRegister() throws InterruptedException {
            ExtentTest test = extent.createTest("Ingreso de datos de registro exitoso");
            test.log(Status.INFO, "Comienza el Test");
            RegisterPage registerPage = new RegisterPage(driver, wait);

            registerPage.writeName("Franco");
            registerPage.writeLastName("Mertens");
            registerPage.writeEmail("prueba00004@gmail.com");
            registerPage.writePassword("123456");
            registerPage.writeConfirmPass("123456");
            test.log(Status.PASS, "Ingreso todos los datos del Registro");
    }

    @Test
    @tag("Continuar de creacion de cuenta a Busqueda de producto")
    public void succesfullRegister() throws InterruptedException {
        ExtentTest test = extent.createTest("Continuar a busqueda de producto");
        test.log(Status.INFO, "Comienza el Test");
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver, wait);
        clickBtnContinue();
        test.log(Status.PASS, "Logro pasar a busqueda de productos");

    }

    @Test
    @tag("Busqueda de producto")
    public void succesfullRegister() throws InterruptedException {
        ExtentTest test = extent.createTest("Busqueda de producto");
        test.log(Status.INFO, "Comienza el Test");
        SearchItemPage searchItemPage = new SearchItemPage(driver, wait);
        writeSearch("iphone");
        selectSearchBtn();
        test.log(Status.PASS, "Logro buscar producto iphone ");
    }

    @Test
    @tag("Agregar item al carro de compras")
    public void succesfullRegister() throws InterruptedException {
        ExtentTest test = extent.createTest("Agregar item carro de compras");
        test.log(Status.INFO, "Comienza el Test");
        SearchItemPage searchItemPage = new SearchItemPage(driver, wait);
        clickAddItemCart()
        test.log(Status.PASS, "Logro agregar producto al carro de compras");
    }




        @AfterEach
    public void cerrar() {
            RegisterPage registerPage = new RegisterPage(driver, wait);
            registerPage.close();
            extent.flush();
            }

}










