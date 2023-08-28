package Test;

import Pages.RegisterPage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import Reports.ExtentFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Pages.RegisterPage;
import Pages.HomePage;
import Pages.AccountCreatedPage;
import Pages.SearchPage;
import Pages.SearchedItemPage;


public class TestRegistro {

    public WebDriver driver;
    public WebDriverWait wait;

    static ExtentSparkReporter info = new ExtentSparkReporter("target/REPORTES_BUSQUEDA.html");
    static ExtentReports extent;
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
    @Tag("Seleccion_Registro")
    public void succesOnRegister() throws InterruptedException {
        ExtentTest test = extent.createTest("Seleccion de registro exitosa");
        test.log(Status.INFO, "Comienza el Test");
        HomePage homePage = new HomePage(driver, wait);

        homePage.clickBtnMiCuenta();
        test.log(Status.PASS, "Seleccion de cuenta exitosa");

        homePage.clickBtnRegister();
        test.log(Status.PASS, "Ingresar a seccion de registro");

        RegisterPage registerPage = new RegisterPage(driver, wait);

        registerPage.writeName("Franco");
        registerPage.writeLastName("Mertens");
        registerPage.writeEmail("prueba000074@gmail.com");
        registerPage.writePhoneNumber("3513896544");
        registerPage.writePassword("123456");
        registerPage.writeConfirmPass("123456");
        registerPage.clickDenySubscription();
        registerPage.clickAcceptPolicy();
        registerPage.clickFinishRegister();

        test.log(Status.PASS, "Ingreso todos los datos del Registro");
    }

    @Test
    @Tag("Continuar_de_creacion_de_cuenta_a_Busqueda_de_producto")
    public void continueToSearch() throws InterruptedException {
        ExtentTest test = extent.createTest("Continuar a busqueda de producto");
        test.log(Status.INFO, "Comienza el Test");
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver, wait);
        accountCreatedPage.clickBtnContinue();
        test.log(Status.PASS, "Logro pasar a busqueda de productos");

    }

    @Test
    @Tag("Busqueda_de_producto")
    public void productSearch() throws InterruptedException {
        ExtentTest test = extent.createTest("Busqueda de producto");
        test.log(Status.INFO, "Comienza el Test");
        SearchPage searchItemPage = new SearchPage(driver, wait);
        searchItemPage.writeSearch("iphone");
        searchItemPage.selectSearchBtn();
        test.log(Status.PASS, "Logro buscar producto iphone ");
    }

    @Test
    @Tag("Agregar_item_al_carro_de_compras")
    public void addProductToCart() throws InterruptedException {
        ExtentTest test = extent.createTest("Agregar item carro de compras");
        test.log(Status.INFO, "Comienza el Test");
        SearchedItemPage searchItemPage = new SearchedItemPage(driver, wait);
        searchItemPage.clickAddItemCart();
        test.log(Status.PASS, "Logro agregar producto al carro de compras");
    }

    @AfterEach
    public void cerrar() {
            RegisterPage registerPage = new RegisterPage(driver, wait);
            registerPage.close();
            extent.flush();
            }

}










