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

    @BeforeAll
    public static void crearReporte() {
            extent = ExtentFactory.getInstance();
            extent.attachReporter(info);
            }

    @BeforeEach
    public void setUp() throws InterruptedException {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofMillis(2000));
            RegisterPage registerPage = new RegisterPage(driver, wait);
            registerPage.setup();
            registerPage.url("https://opencart.abstracta.us/index.php?route=common/home");
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

            homePage.clickBtnMiCuenta();
            test.log(Status.PASS, "Seleccion de cuenta exitosa");

            homePage.clickBtnRegister();
            test.log(Status.PASS, "Ingresar a seccion de registro");
            }












