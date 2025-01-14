package B2B_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.turtlemint.base.TestBase;
import org.turtlemint.pages.home.TC_01_to_21;
import org.turtlemint.pages.login.LoginPage;
import util.RetryAnalyser;
import util.iTestListener;

import static org.turtlemint.base.TestBase.initialization;
import static org.turtlemint.base.TestBase.prop;

@Listeners(iTestListener.class)
@Test(groups = {"MF_B2B", "TC_01_TO_21_test"},retryAnalyzer = RetryAnalyser.class)
public class TC_01_TO_21_test extends TestBase {
    LoginPage login;
    TC_01_to_21 MF ;

    @BeforeMethod()
    public void start() {
        initialization();
        login = new LoginPage();
        MF = new TC_01_to_21();
        login.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
    }

    @Test()
    public void TC_01() throws Exception {
        MF.TC_01_03();
    }

    @Test()
    public void TC_02() throws Exception {
        MF.TC_04_05_06_07_08_09_10_11_12_13_17_18();
    }

    @Test()
    public void TC_03() throws Exception {
        MF.TC_14_15_19_20_21();
    }


    @Test()
    public void TC_04() throws Exception {
        MF.TC_16();
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}
