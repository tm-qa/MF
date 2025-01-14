package B2B_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.turtlemint.base.TestBase;
import org.turtlemint.pages.B2B_Pages.SIP_Page;
import org.turtlemint.pages.login.LoginPage;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"MF_B2B", "SIP_Test"},retryAnalyzer = com.qa.turtlemint.util.RetryAnalyser.class)
public class SIP_Test extends TestBase {

    LoginPage login;
    SIP_Page sip;

    @BeforeMethod()
    public void start() {
        initialization();
        login = new LoginPage();
        sip = new SIP_Page();
        login.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        sip.SIP();
    }

    @Test()
    public void Read_more() {
        sip.Read_more();
    }

    @Test()
    public void Read_less() {
        sip.Read_less();
    }

    @Test()
    public void Explore_elss() {
        sip.Explore_ELSS();
    }

    @Test()
    public void InvestNow() {
        sip.Invest_now();
    }

    @Test()
    public void ExploreMoreFunds() {
        sip.Explore_More_funds();
    }

    @Test()
    public void Verify_FooterText_on_SIP_Page() {
        sip.Footer_text_on_SIP_Page();
    }

    @Test()
    public void Verify_Best_performing_Fund_redirection_from_SIP_Page() {
        sip.Best_performing_Fund();
    }

    @Test()
    public void Verify_tax_saving_funds_from_SIP_Page() {
        sip.Tax_saving_Fund();
    }

    @Test()
    public void Verify_Equity_Fund_from_SIP_Page() {
        sip.Equity_Fund();
    }

    @Test()
    public void Verify_debt_fund_from_SIP_Page() {
        sip.debt_Fund();
    }

    @Test()
    public void Verify_liquid_fund_from_SIP_Page() {
        sip.liquid_Fund();
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}
