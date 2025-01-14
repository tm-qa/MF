package B2B_Test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.turtlemint.base.TestBase;
import org.turtlemint.pages.B2B_Pages.MutualFundPage;
import org.turtlemint.pages.login.LoginPage;
import org.turtlemint.util.TestUtil;
import util.RetryAnalyser;
import util.iTestListener;


import java.io.IOException;

import static org.turtlemint.base.TestBase.initialization;


/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */

@Listeners(iTestListener.class)
@Test(groups = {"MF_B2B", "MF_21_42_Test"},retryAnalyzer = RetryAnalyser.class)
public class MF_21_42_TestCase_FlowTest extends TestBase {

    public MF_21_42_TestCase_FlowTest() {
        super();
    }

    public LoginPage loginpage;
    public String uID;

    TestUtil tl;
    MutualFundPage mfp;



    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        mfp = new MutualFundPage();

        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        mfp.SelectVertical();
    }

    @Test()
    public void Verify_Cart_Redirection_Test_Case_21() throws IOException {
        mfp.ClickCart();
    }

    @Test()
    public void Verify_Explore_Funds_Test_Case_22_23() throws IOException {
        mfp.ExploreFunds();
    }

    @Test()
    public void Verify_Cart_Redirection_Test_Case_25() throws InterruptedException, IOException {
        mfp.OnlyCartRedirection();
    }

    @Test()
    public void Verify_Home_breadcrumb_Test_Case_26() throws InterruptedException, IOException {
        mfp.breadcrumbNavigation();
    }

    @Test()
    public void Verify_Investment_Calculator_Text_Test_Case_27() throws IOException {
        mfp.InvestmentCalculatorsHeaderBold();
    }

    @Test()
    public void Verify_Increase_Your_Sales_Text_Test_Case_28() throws IOException {
        mfp.IncreaseYourSalesText();
    }

    @Test()
    public void Verify_SIP_Calculator_Text_Test_Case_29_30() throws IOException {
        mfp.VerifySIPCalculatorTextBoldAndLogo();
    }

    @Test()
    public void Verify_Plan_Your_Client_Monthly_Investment_Text_Test_Case_31() throws IOException {
        mfp.Verify_Plan_Your_Client_Monthly_Investment_Text();
    }

    @Test()
    public void Verify_SIP_Calculator_Redirection_Test_Case_32() throws IOException {
        mfp.Verify_SIP_Calculator_Redirection();
    }

    @Test()
    public void Verify_Logo_Redirection_Test_Case_33() throws IOException {
        mfp.Verify_Logo_Redirection();
    }

    @Test()
    public void Verify_SIP_Description_Text_Redirection_Test_Case_34() throws IOException {
        mfp.Verify_Plan_Your_Client_Monthly_Investment_Redirection();
    }

    @Test()
    public void Verify_Home_breadcrumb_SIP_Calculator_Test_Case_35() throws IOException {
        mfp.SIP_Calculator_Breadcrumb_Navigation();
    }

    @Test()
    public void Verify_Personalised_Investment_Growth_Text_Test_Case_36() throws IOException {
        mfp.Verify_Personalised_Investment_Growth_Text();
    }

    @Test()
    public void Verify_Systematic_Investment_Plan_Calculator_Text_Test_Case_37() throws IOException {
        mfp.Verify_Systematic_Investment_Plan_Calculator_Text();
    }

    @Test()
    public void Verify_Visualise_your_client_financial_growth_Text_Test_Case_38() throws IOException {
        mfp.Verify_Visualise_your_client_financial_growth_Text();
    }

    @Test()
    public void Verify_Amount_Field_with_Value_Zero_Test_Case_39() throws IOException {
        mfp.Verify_Amount_Field();
    }

    @Test()
    public void Verify_Amount_Field_with_HigherValue_Test_Case_40() throws IOException {
        mfp.Verify_Amount_Field_With_Higher_Value();
    }

    @Test()
    public void Verify_Suggest_Amounts_Test_Case_41_42() throws IOException {
        mfp.Verify_Suggested_Amount_Field();
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }

}
