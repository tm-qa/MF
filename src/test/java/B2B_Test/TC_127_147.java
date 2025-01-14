package B2B_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.turtlemint.base.TestBase;
import org.turtlemint.pages.B2B_Pages.TC_127_147_page;
import org.turtlemint.pages.login.LoginPage;
import util.RetryAnalyser;
import util.iTestListener;

import static org.turtlemint.base.TestBase.initialization;

@Listeners(iTestListener.class)
@Test(groups = {"MF_B2B", "TC_127_147"},retryAnalyzer = RetryAnalyser.class)
public class TC_127_147 extends TestBase {

    LoginPage login;
    TC_127_147_page testmf;


    @BeforeMethod()
    public void start() {
        initialization();
        login = new LoginPage();
        testmf = new TC_127_147_page();
        login.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        testmf.ValidateSellButton();
    }

    @Test()
    public void TC127_TC128() throws Exception {
        testmf.shareWithoutdetails();
    }

    @Test()
    public void TC129() throws Exception {
        testmf.validName();
    }

    @Test()
    public void TC130() throws Exception {
        testmf.validMobileNo();
    }

    @Test()
    public void TC131() throws Exception {
        testmf.existingMobileNo();
    }

    @Test()
    public void TC132() throws Exception {
        testmf.existingNameMobileNo();
    }

    @Test()
    public void TC133() throws Exception {
        testmf.contactBook();
    }

    @Test()
    public void TC134() throws Exception {
        testmf.disclaimer();
    }

    @Test()
    public void TC135() throws Exception {
        testmf.readMore();
    }

    @Test()
    public void TC136() throws Exception {
        testmf.readLess();
    }

    @Test()
    public void TC137() throws Exception {
        testmf.elsstext();
    }

    @Test()
    public void TC138() throws Exception {
        testmf.investNow();
    }

    @Test()
    public void TC139_TC147() throws Exception {
        testmf.investNowback();
    }

    @Test()
    public void TC140_TC146() throws Exception {
        testmf.explorefunds();
    }

    @Test()
    public void TC141() throws Exception {
        testmf.Copyright();
    }

    @Test()
    public void TC142() throws Exception {
        testmf.amfiTxt();
    }

    @Test()
    public void TC143() throws Exception {
        testmf.mfiTxt();
    }

    @Test()
    public void TC144() throws Exception {
        testmf.qLinkText();
    }

    @Test()
    public void TC145() throws Exception {
        testmf.companytxt();
    }


    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}


