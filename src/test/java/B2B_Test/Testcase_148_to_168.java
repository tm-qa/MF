package B2B_Test;




import org.testng.annotations.*;
import org.turtlemint.base.TestBase;
import org.turtlemint.pages.B2B_Pages.TC_148_TO_168;
import org.turtlemint.pages.login.LoginPage;
import util.iTestListener;

import java.io.IOException;

import static org.turtlemint.base.TestBase.initialization;
import static org.turtlemint.base.TestBase.prop;


@Listeners(iTestListener.class)
@Test(groups = {"Testcase_148_to_168","MF_B2B"},retryAnalyzer = com.qa.turtlemint.util.RetryAnalyser.class)
public class Testcase_148_to_168 extends TestBase {

    public Testcase_148_to_168() {
        super();
    }

    LoginPage Loginpage;
    TC_148_TO_168 tc ;




    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();

        tc = new TC_148_TO_168();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        Loginpage.MFDashboard();


        tc.Goal();

    }

    // -------------------------------------


    @Test()
    public void TC_148_Toverif_Taxsaverfundare_redirectingproperly() throws IOException {
        tc.TC_148_toverify_Taxsaverfundareredirecting();

    }
    @Test()

    public void TC_149_Toverifyon_clickon_browserback() throws IOException {
        tc.TC_149_toverifyon_clickon_browserback();

    }
    @Test()

    public void TC_150_Toverifyon_Equity_fund_redirectingproperly() throws IOException {
        tc.TC_150_toverify_Equity_fund_reredirecting();

    }
    @Test()

    public void TC_151_Toverifyon_Equity_fund_browserback() throws IOException {
        tc.TC_151_toverifyon_clickon_browserback_Equity_fund();

    }
    @Test()

    public void TC_152_Toverifyon_Debtfund_redirectingproperly() throws IOException {
        tc.TC_152_toverify_Debtfund_redirecting();

    }
    @Test()

    public void TC_153_Toverifyon_Debtfund_fund_browserback() throws IOException {
        tc.TC_153_toverifyon_clickon_browserback_Debtfund();

    }
    @Test()

    public void TC_154_Toverifyon_Liquidfund_redirectingproperly() throws IOException {
        tc.TC_154_toverify_Liquidfund_redirecting();

    }
    @Test()

    public void TC_155_Toverifyon_Liquidfund_fund_browserback() throws IOException {
        tc.TC_155_toverifyon_clickon_browserback_Liquidfund();

    }
    @Test()

    public void TC_156_Toverifyon_termsandcondition_redirectingproperly() throws IOException {
        tc.TC_156_toverify_termsandcondition_redirecting();

    }
    @Test()

    public void TC_157_Toverifyon_termsandcondition_fund_browserback() throws IOException {
        tc.TC_157_toverifyon_clickon_browserback_Liquidfund();

    }
    @Test()

    public void TC_158_Toverifyon_Privacy_redirectingproperly() throws IOException {
        tc.TC_158_toverify_Privacy_redirecting();

    }
    @Test()

    public void TC_159_Toverifyon_Privacy_fund_browserback() throws IOException {
        tc.TC_159_toverifyon_clickon_browserback_Privacy();

    }
    @Test()

    public void TC_160_Toverifyon_Disclosure_redirectingproperly() throws IOException {
        tc.TC_160_toverify_Disclosure_redirecting();

    }
    @Test()

    public void TC_161_Toverifyon_Disclosure_fund_browserback() throws IOException {
        tc.TC_161_toverifyon_clickon_browserback_Disclosure();

    }
    @Test()

    public void TC_162_Toverifyon_SEBI_redirectingproperly() throws IOException {
        tc.TC_162_toverify_SEBI_redirecting();

    }
    @Test()

    public void TC_163_Toverifyon_SEBI_fund_browserback() throws IOException {
        tc.TC_163_toverifyon_clickon_browserback_SEBI();

    }
    @Test()

    public void TC_164_Toverifyon_SEBI_redirectingproperly() throws IOException {
        tc.TC_164_toverify_AMFI_redirecting();

    }
    @Test()

    public void TC_165_Toverifyon_SEBI_fund_browserback() throws IOException {
        tc.TC_165_toverifyon_clickon_browserback_AMFI();

    }
    @Test()

    public void TC_166_Toverifyon_AmfiCode_redirectingproperly() throws IOException {
        tc.TC_166_toverify_AmfiCode_redirecting();

    }
    @Test()

    public void TC_167_Toverifyon_AmfiCode_fund_browserback() throws IOException {
        tc.TC_167_toverifyon_clickon_browserback_AMFICode();

    }
    @Test()

    public void TC_168_Toverifyon_AmfiCode_redirectingproperly() throws IOException {
        tc.TC_168_toverify_BEST_redirecting();

    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }



}
