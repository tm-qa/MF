package B2B_Test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.turtlemint.base.TestBase;
import org.turtlemint.pages.B2B_Pages.MFTestCase169_To_189;
import org.turtlemint.pages.login.LoginPage;
import util.iTestListener;

import java.io.IOException;

import static org.turtlemint.base.TestBase.initialization;
import static org.turtlemint.base.TestBase.prop;

@Listeners(iTestListener.class)
@Test(groups = {"43-63, 85-126,169-189_Test","MF_B2B"},retryAnalyzer = com.qa.turtlemint.util.RetryAnalyser.class)
public class MF43to63_85to26_169to89_Test extends TestBase {


    LoginPage Loginpage;
    MFTestCase169_To_189 tc;

    public MF43to63_85to26_169to89_Test() {super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        tc = new MFTestCase169_To_189();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        Loginpage.MFDashboard();
    }


    // TestCases 43-63 [JIRA - UI-1034]

    public void TestCase43and44and45() throws IOException {
        tc.VerifyExpectedReturnsFunctionality();
    }
    public void TestCase46and47and48() throws IOException {
        tc.VerifyTimePeriodFunctionality();
    }

    public void TestCase49and50() throws IOException {
        tc.VerifyAlphabetInputForReturnsAndTimePeriodOnSIPPage();
    }

    public void TestCase51And52and54and55() throws IOException{
        tc.VerifySharePopUpOpenAndClose();
    }

    public void TestCase53() throws IOException {
        tc.VerifyOutSideOfPopUp();
    }

    public void TestCases56and57() throws IOException {
        tc.VerifyShareWithoutDetails();
    }

    public void TestCase58() throws IOException {
        tc.VerifyMobileNumberError();
    }

    public void TestCase59() throws IOException {
        tc.VerifyCustomerNameError();
    }

    public void TestCase60() throws IOException {
        tc.VerifyAlreadyMappedCustomerError();
    }

    public void TestCase61And62() throws IOException {
        tc.VerifyShareWithDetailsAndHomepageIcon();
    }

    public void TestCase63() throws IOException {
        tc.VerifyDisclaimerTextVisible();
    }

    // Testcases 85-126 [JIRA - UI-1036]

    public void TestCase85And86() throws IOException {
        tc.VerifyTermsAndBackOnSIPCalculatorPage();
    }

    public void TestCase87And88() throws IOException{
        tc.VerifyPrivacyRedirectionOnSIPCalculatorPage();
    }

    public void TestCase89And90() throws IOException{
        tc.VerifyDisclosureAndBackOnSIPPage();
    }

    public void TestCase91And92() throws IOException{
        tc.VerifySEBIAndBackOnSIPPage();
    }

    public void TestCase93And94() throws IOException {
        tc.VerifyAMFIAndBackOnSIPPage();
    }

    public void TestCase95And96() throws IOException{
        tc.VerifyAMFICodeOfConductAndBackOnSIPPage();
    }

    public void TestCase97And98And99() throws IOException{
        tc.VerifyGoalCalculatorTextAndLogoAreVisible();
    }

    public void TestCases100To105() throws IOException{
        tc.VerifyGoalCalculatorRedirectionAndBack();
    }

    public void TestCase106To109() throws IOException{
        tc.VerifyVisualizeFinancialGrowthTextIsVisible();
    }

    public void TestCase110To113() throws IOException{
        tc.VerifyMinAndMaxGoalAmountError();
    }

    public void TestCase114To116() throws IOException{
        tc.VerifyExpectedReturnsFunctionalityOnGoalCalculatorPage();
    }

    public void TestCase117To119() throws IOException{
        tc.VerifyTimePeriodFunctionalityOnGoalCalculatorPage();
    }

    public void TestCase120And121() throws IOException{
        tc.VerifyAlphabetInputForReturnsAndTimePeriodOnGoalPage();
    }

    public void TestCase122And123And125And126() throws IOException {
        tc.VerifyShareCTAOnGoalCalculatorPage();
    }

    public void TestCase124() throws IOException{
        tc.VerifyOutSideOfPopUpOnGoalCalculatorPage();
    }

    // Testcases 169-189 [JIRA - UI-1040]

    public void TestCase169and170() throws IOException {
        tc.CheckBestPerformingFundsLists();
    }

    public void TestCase171and172and173() throws IOException {
        tc.VerifyFooterTextsVisible();
    }

    public void TestCase174and175() throws IOException {
        tc.VerifyTermsRedirectionAndBack();
    }

    public void TestCase176and177() throws IOException {
        tc.VerifyPrivacyRedirectionAndBack();
    }

    public void TestCase178and179() throws IOException {
        tc.VerifyDisclosureAndBack();
    }

    public void TestCase180And181() throws IOException {
        tc.VerifySEBIRedirectionAndBack();
    }

    public void TestCase182And183() throws IOException {
        tc.VerifyAMFIRedirectionAndBack();
    }

    public void TestCase184And185() throws IOException {
        tc.VerifyAMFICOdeRedirectionAndBack();
    }

    public void TestCase186() throws IOException {
        tc.VerifyRiskMeterVisible();
    }

    public void TestCase187And188() throws IOException {
        tc.VerifyKIMRedirectionAndBack();
    }

    public void TestCase191() throws IOException {
        tc.VerifyIIconMouseHover();
    }
    public void TestCase192() throws IOException {
        tc.VerifyAlertIconOnFundDetailsPage();
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }


}
