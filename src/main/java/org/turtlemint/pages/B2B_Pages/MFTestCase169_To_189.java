package org.turtlemint.pages.B2B_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.turtlemint.base.TestBase;
import org.turtlemint.commands.WebCommands;
import org.turtlemint.util.TestUtil;

import java.io.IOException;
import java.util.Set;

public class MFTestCase169_To_189 extends TestBase {

    public MFTestCase169_To_189() {
        PageFactory.initElements(driver, this);}

    Actions action = new Actions(driver);

    @FindBy(xpath = "//p[text()=\"Best Performing\"]")
    WebElement BestPerforming;

    @FindBy(xpath = "//h5[text()=\"SIP Calculator\"]")
    WebElement SIPCalculator;

    @FindBy(xpath = "//h1[text()=\" Best Performing Funds\"]")
    WebElement BestPerformingFundsTitle;

    @FindBy(xpath = "//p[text()=\"Mutual Fund schemes with best historical performance.\"]")
    WebElement BestHistoricalText;

    @FindBy(xpath = "//p[text()=\"Copyright © 2024 Turtlemint Mutual Funds Distributors Private Limited | All Rights Reserved | \"]")
    WebElement CopyRightText;

    @FindBy(xpath = "//p[text()=\"AMFI Registered Distributor | ARN - 159953 | Date of Initial Registration - 13th Feb 2019 | ARN validity upto - 12 Feb 2025\"]")
    WebElement AMFIText;

    @FindBy(xpath = "//p[text()=\"Mutual Fund investments are subject to market risks, read all scheme related documents carefully.\"]")
    WebElement MarketRiskText;

    @FindBy(xpath = "//a[text()=\"Terms\"]")
    WebElement TermsLink;

    @FindBy(xpath = "//h1[text()=\"TERMS OF USE\"]")
    WebElement TermsRedirectionTitle;

    @FindBy(xpath = "//a[text()=\"Privacy\"]")
    WebElement PrivacyLink;

    @FindBy(xpath = "//h1[text()=\"Privacy Policy\"]")
    WebElement PrivacyTitle;

    @FindBy(xpath = "//a[text()=\"Disclosures\"]")
    WebElement DisclosureLink;

    @FindBy(xpath = "//a[text()=\"SEBI\"]")
    WebElement SEBILink;

    @FindBy(xpath = "//input[@placeholder=\"Search SEBI Website\"]")
    WebElement SEBISearchBox;

    @FindBy(xpath = "//a[text()=\"AMFI\"]")
    WebElement AMFILink;

    @FindBy(xpath = "//a[text()=\"Know about AMFI\"]")
    WebElement KnowAboutAMFI;

    @FindBy(xpath = "//a[text()=\"AMFI - Code of Conduct\"]")
    WebElement AMFICodeOfConductLink;

    @FindBy(xpath = "//h2[text()=\" Revised Code of Conduct for Intermediaries of Mutual Funds \"]")
    WebElement RevisedCodeOfConduct;

    @FindBy(xpath = "//a[@href=\"mutual-fund-detail/Canara-Robeco-ELSS-Tax-Saver-Growth-Equity-ELSS-(Tax-Savings)?schemeId=U2VjcmV0S3k=RjAwMDAwMlNTTw==\"]//img")
    WebElement CanaraFundDetails;

    @FindBy(xpath = "//h2[text()=\"Riskometer\"]")
    WebElement RiskMeterTitle;

    @FindBy(xpath = "//img[@src=\"resources/images/disclaimer.svg\"]")
    WebElement AlertIcon;

    @FindBy(xpath = "//p[contains(text(),'Returns')]//img[@alt=\"tooltip icon\"]//..")
    WebElement ReturnsIIcon;

    @FindBy(xpath = "//span[text()=\"Showing annual returns for duration more than 1 year and absolute returns for duration less than 1 year\"]")
    WebElement ReturnsText;

    @FindBy(xpath = "//span[contains(text(),'Expense Ratio')]//img[@alt=\"tooltip icon\"]")
    WebElement ExpenseRatioIIcon;

    @FindBy(xpath = "//span[text()=\"Expense ratio indicates how much the fund house charges its investors for managing their money.\"]")
    WebElement ExpenseRatioText;

    @FindBy(xpath = "//p[contains(text(),'Read all the scheme related information including the SID,SAI and KIM')]")
    WebElement KIMText;

    @FindBy(xpath = "//p[contains(text(),'Read all the scheme related information including the SID,SAI and KIM')]//a//u[text()=\"here\"]")
    WebElement KIMLink;

    @FindBy(xpath = "//img[@alt=\"canara robeco\"]")
    WebElement CanaraLogo;

    @FindBy(xpath = "//h4[text()=\"Investment Calculators\"]")
    WebElement InvestmentCalculatorText;

    @FindBy(xpath = "//p[text()=\"Expected rate of return (yearly)\"]")
    WebElement ExpectedReturnsText;

    @FindBy(xpath = "//p[text()=\"Time period\"]")
    WebElement TimePeriodTitle;

    @FindBy(xpath = "//button[text()=\" Share\"]")
    WebElement ShareCTA;

    @FindBy(xpath = "//button//span[text()=\"×\"]")
    WebElement CancelButton;

    @FindBy(xpath = "//h3[text()=\"Enter Customer Details\"]")
    WebElement TitleOnPopup;

    @FindBy(xpath = "//p[contains(text(),'Disclaimer: This calculator')]")
    WebElement DisclaimerText;

    @FindBy(xpath = "//p[text()=\"Personalised Investment Growth\"]")
    WebElement TitleOnSIPPage;

    @FindBy(xpath = "//div/p[text()=\"Expected rate of return (yearly)\"]//parent::div//parent::div//parent::div//input[@role=\"spinbutton\"]")
    WebElement ExpectedReturnInput;

    @FindBy(xpath = "//div/p[text()=\"Time period\"]//parent::div//parent::div//parent::div//input[@role=\"spinbutton\"]")
    WebElement TimePeriodInput;

    @FindBy(xpath = "//p[text()=\"You can make the calculator results personalised by adding customer name & number\"]")
    WebElement TextOnSharePopUp;

    @FindBy(xpath = "//form//button[contains(text(),'Share')]")
    WebElement ShareButtonOnPopUp;

    @FindBy(xpath = "//img[@src=\"https://static.whatsapp.net/rsrc.php/yZ/r/JvsnINJ2CZv.svg\"]")
    WebElement WhatsAppLogo;

    @FindBy(xpath = "//form//input[@id=\"clientName\"]")
    WebElement CustomerNameInputField;

    @FindBy(xpath = "//form//input[@id=\"clientMobile\"]")
    WebElement CustomerMobileInputField;

    @FindBy(xpath = "//span[text()=\"Customer name is mandatory\"]")
    WebElement CustomerNameMandatoryError;

    @FindBy(xpath = "//span[text()=\"Customer mobile number is mandatory\"]")
    WebElement MobileNumberMandatoryError;

    @FindBy(xpath = "//p[text()=\"User is mapped to other agent\"]")
    WebElement OtherAgentError;

    @FindBy(xpath = "//a[text()=\"Terms & Conditions\"]")
    WebElement TermsAndConditionsOnSIPPage;

    @FindBy(xpath = "//a[text()=\"Privacy Policy\"]")
    WebElement PrivacyOnSIPPage;

    @FindBy(xpath = "//a[text()=\"Disclosures\"]")
    WebElement DisclosureOnSIPPage;

    @FindBy(xpath = "//a[text()=\"SEBI\"]")
    WebElement SEBIOnSIPPage;

    @FindBy(xpath = "//a[text()=\"AMFI\"]")
    WebElement AMFIOnSIPPage;

    @FindBy(xpath = "//a[text()=\"AMFI - Code of Conduct\"]")
    WebElement AMFICodeOfConductOnSIPPage;

    @FindBy(xpath = "//h5[text()=\"Goal Amount Calculator\"]")
    WebElement GoalAmountCalculatorText;

    @FindBy(xpath = "//p[text()=\"Use our calculator to see how much your client needs to save to reach their financial goals.\"]")
    WebElement UseOurCalculatorText;

    @FindBy(xpath = "//img[@src=\"/v1/static/media/target-amount-calc.2cee9154.svg\"]")
    WebElement GoalCalculatorLogo;

    @FindBy(xpath = "//p[text()=\"Personalised Investment Growth\"]")
    WebElement PersonalizedGrowthTitleOnGoalPage;

    @FindBy(xpath = "//span[text()=\"Home\"]")
    WebElement HomeBreadCrum;

    @FindBy(xpath = "//p[text()=\"Personalised Investment Growth\"]//parent::div//h3[text()=\"SIP\"]")
    WebElement GoalAmountCalculatorSIP;

    @FindBy(xpath = "//span[text()=\"Visualise your client’s financial growth\"]")
    WebElement ClientsFinancialGrowthText;

    @FindBy(xpath = "//div[text()=\"Invest Monthly SIP Of\"]")
    WebElement InvestMonthlyText;

    @FindBy(xpath = "//button[text()=\"Get Lumpsum Amount\"]")
    WebElement GetLumpsumAmountButton;

    @FindBy(xpath = "//div[text()=\"Invest Lumpsum Of\"]")
    WebElement InvestLumpsumText;

    @FindBy(xpath = "//input[@name=\"amount\"]")
    WebElement GoalAmountInputField;

    @FindBy(xpath = "//span[text()=\"Minimum value allowed is 1,00,000\"]")
    WebElement MinimumValueError;

    @FindBy(xpath = "//span[text()=\"Maximum value allowed is 100,000,000\"]")
    WebElement MaximumValueError;

    @FindBy(xpath = "//p[text()=\"Expected rate of return (yearly)\"]")
    WebElement ExpectedReturnsOnGoalCalculatorPage;

    @FindBy(xpath = "//p[text()=\"Time period\"]")
    WebElement TimePeriodOnGoalCalculatorPage;

    @FindBy(xpath = "//button[text()=\" Share\"]")
    WebElement ShareOnGoalCalculatorPage;

    @FindBy(xpath = "//h3[text()=\"Enter Customer Details\"]")
    WebElement EnterCustomerDetailsOnGoalCalculatorPage;

    @FindBy(xpath = "//p[text()=\"You can make the calculator results personalised by adding customer name & number\"]")
    WebElement ShareResultTextOnPopUponGoalPage;

    @FindBy(xpath = "//span[text()=\"×\"]")
    WebElement ClosePopUponGoalCalculatorPage;

    public void VerifyExpectedReturnsFunctionality() throws IOException {
        TestUtil.click(SIPCalculator,"Clicked on SIP Calculator Link");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(ExpectedReturnsText.isDisplayed());
        WebCommands.staticSleep(2000);
        action.click(ExpectedReturnInput).doubleClick(ExpectedReturnInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        ExpectedReturnInput.click();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(ExpectedReturnInput,"45","Entering expected returns as 45");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        action.click(ExpectedReturnInput).doubleClick(ExpectedReturnInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        ExpectedReturnInput.click();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(ExpectedReturnInput,"10","Entering expected returns as 10");
        TestUtil.getScreenShot();
    }

    public void VerifyTimePeriodFunctionality() throws IOException {
        TestUtil.click(SIPCalculator,"Clicked on SIP Calculator Link");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(TimePeriodTitle.isDisplayed());
        WebCommands.staticSleep(2000);
        action.click(TimePeriodInput).doubleClick(TimePeriodInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        TimePeriodInput.click();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(TimePeriodInput,"45","Entering time period as 45");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        action.click(TimePeriodInput).doubleClick(TimePeriodInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        TimePeriodInput.click();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(TimePeriodInput,"10","Entering time period as 10");
        TestUtil.getScreenShot();
    }


    public void CheckBestPerformingFundsLists() throws IOException{
        Assert.assertTrue(BestHistoricalText.isDisplayed());
        TestUtil.click(BestPerforming,"Clicking on best performing funds");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(BestPerformingFundsTitle.isDisplayed());
    }

    public void VerifyFooterTextsVisible() throws IOException {
        Assert.assertTrue(CopyRightText.isDisplayed());
        Assert.assertTrue(AMFIText.isDisplayed());
        Assert.assertTrue(MarketRiskText.isDisplayed());
    }

    public void VerifyTermsRedirectionAndBack() throws IOException {
        TestUtil.click(TermsLink,"Clicked on Terms Link");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(TermsRedirectionTitle.isDisplayed());
        driver.navigate().back();
        WebCommands.staticSleep(1000);
        Assert.assertTrue(InvestmentCalculatorText.isDisplayed());
    }

    public void VerifyPrivacyRedirectionAndBack() throws IOException {
        TestUtil.click(PrivacyLink,"Clicked on Privacy Link");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(PrivacyTitle.isDisplayed());
        driver.navigate().back();
        WebCommands.staticSleep(1000);
        Assert.assertTrue(InvestmentCalculatorText.isDisplayed());
    }

    public void VerifyDisclosureAndBack() throws IOException {
        TestUtil.click(DisclosureLink,"Clicked on  Link");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
    }

    public void VerifySEBIRedirectionAndBack() throws IOException {
        TestUtil.click(SEBILink,"Clicked on SEBI Link");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(SEBISearchBox.isDisplayed());
        driver.navigate().back();
        WebCommands.staticSleep(1000);
        Assert.assertTrue(InvestmentCalculatorText.isDisplayed());
    }

    public void VerifyAMFIRedirectionAndBack() throws IOException {
        TestUtil.click(AMFILink,"Clicked on AMFI Link");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(KnowAboutAMFI.isDisplayed());
        driver.navigate().back();
        WebCommands.staticSleep(1000);
        Assert.assertTrue(InvestmentCalculatorText.isDisplayed());
    }

    public void VerifyAMFICOdeRedirectionAndBack() throws IOException {
        TestUtil.click(AMFICodeOfConductLink,"Clicked on AMFI Code Of Conduct Link");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(RevisedCodeOfConduct.isDisplayed());
        driver.navigate().back();
        WebCommands.staticSleep(1000);
        Assert.assertTrue(InvestmentCalculatorText.isDisplayed());
    }

    public void VerifyRiskMeterVisible() throws IOException {
        CheckBestPerformingFundsLists();
        WebCommands.staticSleep(1000);
        TestUtil.click(CanaraFundDetails,"Clicking on Canara Fund Details Icon");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(RiskMeterTitle.isDisplayed());
    }

    public void VerifyKIMRedirectionAndBack() throws IOException {
        VerifyRiskMeterVisible();
        Assert.assertTrue(KIMText.isDisplayed());
        TestUtil.click(KIMLink,"Clicking on KIM Link");
        WebCommands.staticSleep(3000);
        Assert.assertTrue(CanaraLogo.isDisplayed());
        driver.navigate().back();
        WebCommands.staticSleep(1000);
        Assert.assertTrue(RiskMeterTitle.isDisplayed());
    }

    public void VerifyIIconMouseHover() throws IOException {
        VerifyRiskMeterVisible();
        ReturnsIIcon.click();
        WebCommands.staticSleep(4000);
        System.out.println(ReturnsText.getText());
        Assert.assertTrue(ReturnsText.isDisplayed());
        ExpenseRatioIIcon.click();
        WebCommands.staticSleep(4000);
        System.out.println(ExpenseRatioText.getText());
        Assert.assertTrue(ExpenseRatioText.isDisplayed());
    }

    public void VerifyAlertIconOnFundDetailsPage() throws IOException {
        VerifyRiskMeterVisible();
        WebCommands.staticSleep(1000);
        Assert.assertTrue(AlertIcon.isDisplayed());
    }

    public void VerifyDisclaimerTextVisible() throws IOException {
        TestUtil.click(SIPCalculator,"Clicked on SIP Calculator");
        WebCommands.staticSleep(1500);
        Assert.assertTrue(DisclaimerText.isDisplayed());
    }

    public void VerifySharePopUpOpenAndClose() throws IOException {
        VerifyDisclaimerTextVisible();
        TestUtil.click(ShareCTA,"Clicking on Share CTA on SIP Calculator Page");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(TitleOnPopup.isDisplayed());
        Assert.assertTrue(TextOnSharePopUp.isDisplayed());
        TestUtil.click(CancelButton,"Clicking on Cancel Button");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(TitleOnSIPPage.isDisplayed());
    }

    public void VerifyOutSideOfPopUp() throws IOException{
        VerifyDisclaimerTextVisible();
        TestUtil.click(ShareCTA,"Clicking on Share CTA on SIP Calculator Page");
        WebCommands.staticSleep(1000);
        action.moveToElement(ShareButtonOnPopUp, 10, 25).click().build().perform();
        WebCommands.staticSleep(5000);
        Assert.assertTrue(TitleOnSIPPage.isDisplayed());
    }

    public void VerifyShareWithoutDetails() throws IOException {
        VerifyDisclaimerTextVisible();
        TestUtil.click(ShareCTA,"Clicking on Share CTA on SIP Calculator Page");
        WebCommands.staticSleep(1000);
        String mainWindow = driver.getWindowHandle();
        TestUtil.click(ShareButtonOnPopUp,"Clicking Share button On Pop up");
        WebCommands.staticSleep(3000);
        Set<String> allWindows = driver.getWindowHandles();
        allWindows.remove(mainWindow);
        String newTab = allWindows.iterator().next();
        driver.switchTo().window(newTab);
        Assert.assertTrue(WhatsAppLogo.isDisplayed());
    }

    public void VerifyMobileNumberError() throws IOException {
        VerifyDisclaimerTextVisible();
        TestUtil.click(ShareCTA,"Clicking on Share CTA on SIP Calculator Page");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(CustomerNameInputField,"Automation","Entering Customer name");
        TestUtil.click(ShareButtonOnPopUp,"Clicking Share button On Pop up");
        Assert.assertTrue(MobileNumberMandatoryError.isDisplayed());
        TestUtil.getScreenShot();
    }

    public void VerifyCustomerNameError() throws IOException{
        VerifyDisclaimerTextVisible();
        TestUtil.click(ShareCTA,"Clicking on Share CTA on SIP Calculator Page");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(CustomerMobileInputField,"6999912345","Entering Customer mobile number");
        TestUtil.click(ShareButtonOnPopUp,"Clicking Share button On Pop up");
        Assert.assertTrue(CustomerNameMandatoryError.isDisplayed());
        TestUtil.getScreenShot();
    }

    public void VerifyAlreadyMappedCustomerError() throws IOException{
        VerifyDisclaimerTextVisible();
        TestUtil.click(ShareCTA,"Clicking on Share CTA on SIP Calculator Page");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(CustomerNameInputField,"Automation","Entering Customer name");
        TestUtil.sendKeys(CustomerMobileInputField,"7666995440","Entering Customer mobile number");
        TestUtil.click(ShareButtonOnPopUp,"Clicking Share button On Pop up");
        Assert.assertTrue(OtherAgentError.isDisplayed());
        TestUtil.getScreenShot();
    }

    public void VerifyShareWithDetailsAndHomepageIcon() throws IOException{
        VerifyDisclaimerTextVisible();
        String mainWindow = driver.getWindowHandle();
        TestUtil.click(ShareCTA,"Clicking on Share CTA on SIP Calculator Page");
        WebCommands.staticSleep(1000);
        System.out.println(mainWindow);
        TestUtil.sendKeys(CustomerNameInputField,"Automation","Entering Customer name");
        TestUtil.sendKeys(CustomerMobileInputField,"6999912345","Entering Customer mobile number");
        TestUtil.click(ShareButtonOnPopUp,"Clicking Share button On Pop up");
        WebCommands.staticSleep(2000);
        Set<String> allWindows = driver.getWindowHandles();
        String newTab = allWindows.iterator().next();
        driver.switchTo().window(newTab);
        WebCommands.staticSleep(2000);
        driver.switchTo().window(mainWindow);
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        Assert.assertTrue(SIPCalculator.isDisplayed());
        TestUtil.getFullPageScreenShot();
    }

    public void VerifyTermsAndBackOnSIPCalculatorPage() throws IOException{
        VerifyDisclaimerTextVisible();
        TestUtil.click(TermsAndConditionsOnSIPPage,"Clicked on terms and conditions on SIP Page");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(TermsRedirectionTitle.isDisplayed());
        driver.navigate().back();
        Assert.assertTrue(TitleOnSIPPage.isDisplayed());
    }

    public void VerifyPrivacyRedirectionOnSIPCalculatorPage() throws IOException {
        VerifyDisclaimerTextVisible();
        TestUtil.click(PrivacyOnSIPPage,"Clicked on Privacy Policy on SIP Page");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(PrivacyTitle.isDisplayed());
        driver.navigate().back();
        Assert.assertTrue(TitleOnSIPPage.isDisplayed());
    }

    public void VerifyDisclosureAndBackOnSIPPage() throws IOException {
        VerifyDisclaimerTextVisible();
        WebCommands.staticSleep(1000);
        TestUtil.click(DisclosureOnSIPPage,"Clicked on Disclosures on SIP Page");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
    }

    public void VerifySEBIAndBackOnSIPPage() throws IOException {
        VerifyDisclaimerTextVisible();
        TestUtil.click(SEBIOnSIPPage,"Clicked on SEBI on SIP Page");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(SEBISearchBox.isDisplayed());
        driver.navigate().back();
        Assert.assertTrue(TitleOnSIPPage.isDisplayed());
    }

    public void VerifyAMFIAndBackOnSIPPage() throws IOException{
        VerifyDisclaimerTextVisible();
        TestUtil.click(AMFIOnSIPPage,"Clicked on AMFI on SIP Page");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(KnowAboutAMFI.isDisplayed());
        driver.navigate().back();
        Assert.assertTrue(TitleOnSIPPage.isDisplayed());
    }

    public void VerifyAMFICodeOfConductAndBackOnSIPPage() throws IOException{
        VerifyDisclaimerTextVisible();
        TestUtil.click(AMFICodeOfConductOnSIPPage,"Clicked on AMFI on SIP Page");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(RevisedCodeOfConduct.isDisplayed());
        driver.navigate().back();
        Assert.assertTrue(TitleOnSIPPage.isDisplayed());
    }

    public void VerifyGoalCalculatorTextAndLogoAreVisible() throws IOException{
        Assert.assertTrue(GoalAmountCalculatorText.isDisplayed());
        Assert.assertTrue(GoalCalculatorLogo.isDisplayed());
        Assert.assertTrue(UseOurCalculatorText.isDisplayed());
    }

    public void VerifyGoalCalculatorRedirectionAndBack() throws IOException{
        TestUtil.click(GoalCalculatorLogo,"Clicked on Goal Calculator Logo");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(PersonalizedGrowthTitleOnGoalPage.isDisplayed());
        TestUtil.click(HomeBreadCrum,"Clicked on Home");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(GoalAmountCalculatorText.isDisplayed());
        WebCommands.staticSleep(3000);
        TestUtil.click(GoalAmountCalculatorText,"Clicked on Goal Calculator Text");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(PersonalizedGrowthTitleOnGoalPage.isDisplayed());
        TestUtil.click(HomeBreadCrum,"Clicked on Home");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(GoalAmountCalculatorText.isDisplayed());
    }

    public void VerifyVisualizeFinancialGrowthTextIsVisible() throws IOException{
        TestUtil.click(GoalCalculatorLogo,"Clicked on Goal Calculator Logo");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(GoalAmountCalculatorSIP.isDisplayed());
        Assert.assertTrue(ClientsFinancialGrowthText.isDisplayed());
        Assert.assertTrue(InvestMonthlyText.isDisplayed());
        WebCommands.staticSleep(2000);
        TestUtil.click(GetLumpsumAmountButton,"Selecting Lumpsum Amount");
        Assert.assertTrue(InvestLumpsumText.isDisplayed());
    }

    public void VerifyMinAndMaxGoalAmountError() throws IOException{
        TestUtil.click(GoalCalculatorLogo,"Clicked on Goal Calculator Logo");
        WebCommands.staticSleep(1000);
        action.click(GoalAmountInputField).sendKeys(Keys.BACK_SPACE).build().perform();
        WebCommands.staticSleep(1000);
        Assert.assertTrue(MinimumValueError.isDisplayed());
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(GoalAmountInputField,"00000","Entering Goal Amount");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(MaximumValueError.isDisplayed());
    }

    public void VerifyExpectedReturnsFunctionalityOnGoalCalculatorPage() throws IOException {
        TestUtil.click(GoalCalculatorLogo,"Clicked on Goal Calculator Logo");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(ExpectedReturnsOnGoalCalculatorPage.isDisplayed());
        WebCommands.staticSleep(2000);
        action.click(ExpectedReturnInput).doubleClick(ExpectedReturnInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        ExpectedReturnInput.click();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(ExpectedReturnInput,"45","Entering expected returns as 45");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        action.click(ExpectedReturnInput).doubleClick(ExpectedReturnInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        ExpectedReturnInput.click();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(ExpectedReturnInput,"10","Entering expected returns as 10");
        TestUtil.getScreenShot();
    }

    public void VerifyTimePeriodFunctionalityOnGoalCalculatorPage() throws IOException {
        TestUtil.click(GoalCalculatorLogo,"Clicked on Goal Calculator Logo");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(TimePeriodOnGoalCalculatorPage.isDisplayed());
        WebCommands.staticSleep(2000);
        action.click(TimePeriodInput).doubleClick(TimePeriodInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        TimePeriodInput.click();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(TimePeriodInput,"45","Entering time period as 45");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        action.click(TimePeriodInput).doubleClick(TimePeriodInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        TimePeriodInput.click();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(TimePeriodInput,"10","Entering time period as 10");
        TestUtil.getScreenShot();
    }

    public void VerifyShareCTAOnGoalCalculatorPage() throws IOException{
        TestUtil.click(GoalCalculatorLogo,"Clicked on Goal Calculator Logo");
        WebCommands.staticSleep(1000);
        TestUtil.click(ShareOnGoalCalculatorPage,"Clicked on Share of Goal calculator page");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(EnterCustomerDetailsOnGoalCalculatorPage.isDisplayed());
        Assert.assertTrue(ShareResultTextOnPopUponGoalPage.isDisplayed());
        TestUtil.click(ClosePopUponGoalCalculatorPage,"Clicked on Close Share Pop up on Goal Page");
        WebCommands.staticSleep(1000);
        Assert.assertTrue(PersonalizedGrowthTitleOnGoalPage.isDisplayed());
    }

    public void VerifyOutSideOfPopUpOnGoalCalculatorPage() throws IOException{
        TestUtil.click(GoalCalculatorLogo,"Clicked on Goal Calculator Logo");
        WebCommands.staticSleep(1000);
        TestUtil.click(ShareCTA,"Clicking on Share CTA on SIP Calculator Page");
        WebCommands.staticSleep(1000);
        action.moveToElement(ShareButtonOnPopUp, 10, 25).click().build().perform();
        WebCommands.staticSleep(5000);
        Assert.assertTrue(TitleOnSIPPage.isDisplayed());
    }

    public void VerifyAlphabetInputForReturnsAndTimePeriodOnGoalPage() throws IOException {
        TestUtil.click(GoalCalculatorLogo,"Clicked on Goal Calculator Logo");
        WebCommands.staticSleep(1000);
        VerifyAlphabetInputNotAccepting();
    }

    public void VerifyAlphabetInputForReturnsAndTimePeriodOnSIPPage() throws IOException {
        TestUtil.click(SIPCalculator,"Clicked on SIP Calculator");
        WebCommands.staticSleep(1000);
        VerifyAlphabetInputNotAccepting();
    }

    public void VerifyAlphabetInputNotAccepting() throws IOException {
        action.click(ExpectedReturnInput).doubleClick(ExpectedReturnInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(ExpectedReturnInput,"Abcd","Entering alphabet input");
        if( ExpectedReturnInput.equals("")){
            System.out.println("Field is Empty");
        }
        action.click(TimePeriodInput).doubleClick(TimePeriodInput).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(TimePeriodInput,"Abcd","Entering alphabet input");
        if(TimePeriodInput.equals("")){
            System.out.println("Field is Empty");
        }
    }

}
