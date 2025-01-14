package org.turtlemint.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.turtlemint.base.TestBase;
import org.turtlemint.commands.WebCommands;
import org.turtlemint.util.TestUtil;

import java.util.Iterator;
import java.util.Set;

public class TC_01_to_21 extends TestBase {
    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellCTA;

    @FindBy(xpath = "//span[text()='Mutual Funds']")
    WebElement MutualFundsCTA;

    @FindBy(xpath = "//div[@class='expert-call-header']//p//a")
    WebElement CallExpertNumber;

    @FindBy(xpath = "//div[@class='expert-call-header']//a//img")
    WebElement CallExpertIcon;

    @FindBy(xpath = "//div//h4[text()='Investment Calculators']")
    WebElement InvestmentCalculators;

    @FindBy(xpath = "//div//h5[text()='SIP Calculator']")
    WebElement SIPCalculator;

    @FindBy(xpath = "//img[contains(@src,'sip-calc')]")
    WebElement SIPCalculatorLogo;

    @FindBy(xpath = "//div[@class='txt-sec txt-sec-calc']//p[contains(text(),'Plan your client')]")
    WebElement SIPCalculatorSubText;

    @FindBy(xpath = "//h5[text()='SIP Calculator']//parent::div[@class='txt-sec txt-sec-calc']")
    WebElement SIPCalculatorArrow;

    @FindBy(xpath = "//span[@class='clickable']")
    WebElement SIPCalculatorBackArrow;

    @FindBy(xpath = "//h3[text()='Systematic Investment Plan Calculator']")
    WebElement SIPCalculatorPage;

    @FindBy(xpath = "//div//h5[text()='Goal Amount Calculator']")
    WebElement GoalAmountCalculator;

    @FindBy(xpath = "//div[@class='txt-sec txt-sec-calc']//p[contains(text(),'Use our calculator to see how much your client needs to save to reach their financial goals.')]")
    WebElement GoalAmountCalculatorSubText;

    @FindBy(xpath = "//img[contains(@src,'target-amount-calc')]")
    WebElement targetamountcalcLogo;

    @FindBy(xpath = "//h5[text()='Goal Amount Calculator']//parent::div[@class='txt-sec txt-sec-calc']")
    WebElement GoalAmountCalculatorArrow;

    @FindBy(xpath = "//span[@class='clickable']")
    WebElement GoalAmountCalculatorBackArrow;

    @FindBy(xpath = "//h3[text()='Goal Amount Calculator: ']")
    WebElement GoalAmountCalculatorPage;

    @FindBy(xpath = "//div//p[text()='Loan Against Mutual Funds']")
    WebElement LoanAgainstMutualFundsText;

    @FindBy(xpath = "//div//p[text()='Get a free call from our experts and earn an extra 0.5% on loans over ₹5L!']")
    WebElement LoanAgainstMutualFundsSubText;

    @FindBy(xpath = "//div//button[text()=\"I'm Interested\"]")
    WebElement ImInterestedText;

    @FindBy(xpath = "//div//img[@alt='success-icon']")
    WebElement SuccessIcon;

    @FindBy(xpath = "//div//p[text()='Thank you for your interest in Loan Against Mutual Funds!']")
    WebElement SuccessIconText;

    @FindBy(xpath = "//div//p[text()='You will receive a call within 24 - 48 hours from our team']")
    WebElement SuccessIconSubText;

    @FindBy(xpath = "//div[@id='KnowMoreRegisterPopup']//p//a")
    WebElement CallToExpNumber;

    @FindBy(xpath = "//div//button[text()='I am Interested']")
    WebElement InterestedText;

    @FindBy(xpath = "//span[text()='Terms and Conditons.']")
    WebElement TermAndCond;

    @FindBy(xpath = "//div[@id='KnowMoreRegisterPopup']//p[contains(text(),'You have')]")
    WebElement RegisterPopUpText;

    @FindBy(xpath = "//div[@id='KnowMoreRegisterPopup']//p[contains(text(),'We can')]")
    WebElement RegisterPopUpSubText;

    @FindBy(xpath = "//div[@class='sc-fzowVh iCzlIR']//span")
    WebElement CancelCTA;

    @FindBy(xpath = "//img[@alt='Investment cart']")
    WebElement InvestmentCart;

    @FindBy(xpath = "//h4[text()='Your investment cart is empty']")
    WebElement CartPage;

    public TC_01_to_21() {
        PageFactory.initElements(driver, this);
    }

    public void MFDashboard() {
        TestUtil.click(SellCTA, "Sell button pressed");
        TestUtil.click(MutualFundsCTA, "Mutual Funds CTA pressed");
        WebCommands.staticSleep(2000);
    }
    public void TC_01_03() {
        MFDashboard();
        boolean CallExpertNumberVerify = CallExpertNumber.isDisplayed();
        Assert.assertTrue(CallExpertNumberVerify);
        boolean CallExpertIconVerify = CallExpertIcon.isDisplayed();
        Assert.assertTrue(CallExpertIconVerify);
        TestUtil.click(CallExpertNumber,"Clicked on Call expert");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }
    public void TC_04_05_06_07_08_09_10_11_12_13_17_18() {
        MFDashboard();
        WebCommands.staticSleep(2000);
        String fontWeight = LoanAgainstMutualFundsText.getCssValue("font-weight");
        if (fontWeight.equals("bold") || Integer.parseInt(fontWeight) >= 700) {
            System.out.println("The text is bold.");
        } else {
            System.out.println("The text is not bold.");
            Assert.fail();
        }
        boolean LoanAgainstMutualFundsSubTextVerify = LoanAgainstMutualFundsSubText.isDisplayed();
        Assert.assertTrue(LoanAgainstMutualFundsSubTextVerify);
        boolean ImInterestedTextVerify = ImInterestedText.isDisplayed();
        Assert.assertTrue(ImInterestedTextVerify);
        TestUtil.click(ImInterestedText,"Clicked on Interested CTA");
        WebCommands.staticSleep(1000);
        boolean SuccessIconVerify = SuccessIcon.isDisplayed();
        Assert.assertTrue(SuccessIconVerify);
        boolean SuccessIconTextVerify = SuccessIconText.isDisplayed();
        Assert.assertTrue(SuccessIconTextVerify);
        boolean SuccessIconSubTextVerify = SuccessIconSubText.isDisplayed();
        Assert.assertTrue(SuccessIconSubTextVerify);
        driver.navigate().refresh();
        Assert.assertTrue(ImInterestedTextVerify);
        Assert.assertTrue(LoanAgainstMutualFundsSubTextVerify);
        String fontWeight1 = LoanAgainstMutualFundsText.getCssValue("font-weight");
        if (fontWeight1.equals("bold") || Integer.parseInt(fontWeight1) >= 700) {
            System.out.println("The text is bold.");
        } else {
            System.out.println("The text is not bold.");
            Assert.fail();
        }
        TestUtil.click(InterestedText,"Clicked on Interested CTA");
        TestUtil.click(TermAndCond,"Clicked on Term And Condition Link");
        TestUtil.getScreenShot();
        TermsAndConditionWindowHandle();
    }
    public void TC_14_15_19_20_21() {
        MFDashboard();
        boolean InterestedTextVerify = InterestedText.isDisplayed();
        Assert.assertTrue(InterestedTextVerify);
        TestUtil.click(InterestedText,"Clicked on Interested CTA");
        WebCommands.staticSleep(2000);
        boolean CallToExpNumbertVerify = CallToExpNumber.isDisplayed();
        Assert.assertTrue(CallToExpNumbertVerify);
        boolean RegisterPopUpTextVerify = RegisterPopUpText.isDisplayed();
        Assert.assertTrue(RegisterPopUpTextVerify);
        boolean RegisterPopUpSubTextVerify = RegisterPopUpSubText.isDisplayed();
        Assert.assertTrue(RegisterPopUpSubTextVerify);
        TestUtil.click(CancelCTA,"Clicked on cancel button");
        WebCommands.staticSleep(1000);
        TestUtil.click(InvestmentCart,"Clicked on Investment Cart");
        CartPage.isDisplayed();
    }
    public void  TC_16(){
        MFDashboard();
        TestUtil.click(InterestedText,"Clicked on Interested CTA");
        WebCommands.staticSleep(2000);
        TestUtil.click(CallToExpNumber,"clicked on call Expert Number");
        WebCommands.staticSleep(500);
        TestUtil.getScreenShot();
    }
    public void TermsAndConditionWindowHandle() {
        Set<String> tabs = driver.getWindowHandles();
        int tabcount = tabs.size();
        System.out.println("total count of tabs are " + tabcount);
        Iterator<String> Tabswitch = tabs.iterator();
        String p = Tabswitch.next();
        String c = Tabswitch.next();

        driver.switchTo().window(c);
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        System.out.println("Redirected to help center chat");
        driver.close();
        WebCommands.staticSleep(1000);
        driver.switchTo().window(p);
    }
}
