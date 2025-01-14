package org.turtlemint.pages.B2B_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.turtlemint.base.TestBase;
import org.turtlemint.commands.WebCommands;
import org.turtlemint.util.LogUtils;
import org.turtlemint.util.TestUtil;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */
public class MutualFundPage extends TestBase {

    @FindBy(xpath = "//span[text()='Mutual Funds']")
    WebElement MutualFundCTA;

    @FindBy(xpath = "//img[@alt=\"Investment cart\"]")
    WebElement ClickOnCart;

    @FindBy(xpath = "//h4[@class='cart-text']")
    WebElement CartText;

    @FindBy(xpath = "//button[text()='Explore Funds']")
    WebElement ExploreFunds;

    @FindBy(xpath = "//h1[text()=' Best Performing Funds']")
    WebElement BPFText;

    @FindBy(xpath = "//div[@class='breadcrums']//a")
    WebElement BreadcrumHome;

    @FindBy(xpath = "//span[@class='clickable'][text()='Home']")
    WebElement SIPBreadcrumHome;

    @FindBy(xpath = "//div[@class=\"img-sec\"]//img[@src='/v1/static/media/sip-calc.db34aa12.svg']")
    WebElement SIPCalculatorLogo;

    @FindBy(xpath = "//img[@alt='Turtlemint Money - Invest in best performing funds by consulting experts for free']")
    WebElement TMLogo;

    @FindBy(xpath = "//span[text()='SIP Calculator']")
    WebElement SIPCalculatorText;

    @FindBy(xpath = "//p[text()=\"Plan your client's monthly investments and help them know the future wealth\"]")
    WebElement SIPDescriptionLink;

    @FindBy(xpath = "//p[@class='greenBoldTxt'][text()='Personalised Investment Growth']")
    WebElement PIGText;

    @FindBy(xpath = "//h3[text()='Systematic Investment Plan Calculator']")
    WebElement SIPCText;

    @FindBy(xpath = "//span[text()=\"Visualise your client’s financial growth\"]")
    WebElement VCIGText;

    @FindBy(xpath = "//input[@name='amount']")
    WebElement AmountField;

    @FindBy(xpath = "//span[@class='currency-code']")
    WebElement Currency;

    @FindBy(xpath = "//span[text()='Minimum value allowed is 100']")
    WebElement ValidationErrorText;

    @FindBy(xpath = "//span[text()='Maximum value allowed is 1,00,000']")
    WebElement ValidationErrorHigherValueText;

    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellCTA;

    public Boolean logoexist;

    //h4/a[contains(text(),'SAP M')]
    //div[@class="img-sec"]//img[contains(text(), 'sip-calc']


    public String CartPageText;
    public String url;


    public MutualFundPage() {
        PageFactory.initElements(driver, this);
    }

    public void SelectVertical()
    {
        TestUtil.click(SellCTA, "Sell button pressed");
        TestUtil.click(MutualFundCTA, "MF vertical selected");
    }

    public void ClickCart() throws IOException {
        TestUtil.click(ClickOnCart, "Clicked on Cart");
        CartPageText = CartText.getText();
        System.out.println(CartPageText + "------------");
        Assert.assertEquals(CartPageText, "Your investment cart is empty");
        TestUtil.getFullPageScreenShot();
    }

    public void OnlyCartRedirection() throws IOException {
        TestUtil.click(ClickOnCart, "Clicked on Cart");
        CartPageText = CartText.getText();
        System.out.println(CartPageText + "------------");
        Assert.assertEquals(CartPageText, "Your investment cart is empty");
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Verified Cart Redirection");
    }

    public void ExploreFunds() throws IOException {
        TestUtil.click(ClickOnCart, "Clicked on Cart");
        TestUtil.click(ExploreFunds, "Clicked on Explore funds");
        Assert.assertEquals(BPFText.getText(), "Best Performing Funds");
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Verified ExploreFunds option");
    }

    public void breadcrumbNavigation() throws IOException {
        TestUtil.click(ClickOnCart, "Clicked on Cart");
        TestUtil.click(BreadcrumHome, "Clicked on Home");
        url = driver.getCurrentUrl();
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(url.contains("home"), true);
        LogUtils.info("Verified breadcrum Home Navigation");
    }

    public  void InvestmentCalculatorsHeaderBold() throws IOException {
        String font_weight = driver.findElement(By.xpath("//h4[text()='Investment Calculators']")).getCssValue("font-weight");
        System.out.println(font_weight + "-------------------");
        boolean BoldFont = font_weight.equals("bold") || Integer.parseInt(font_weight) >= 600;
        Assert.assertTrue(BoldFont);
        WebCommands.staticSleep(500);
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Verified Investment Calculators text is bold");
    }

    public  void IncreaseYourSalesText() throws IOException {
        String font_weight = driver.findElement(By.xpath("//p[contains(text(),'Increase your sales by sharing personalised calcul')]")).getCssValue("font-weight");
        System.out.println(font_weight + "-------------------");
        boolean BoldFont = font_weight.equals("bold") || Integer.parseInt(font_weight) >= 400;
        Assert.assertTrue(BoldFont);
        WebCommands.staticSleep(500);
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Verified Increase Your Sales text is bold");
    }

    public  void VerifySIPCalculatorTextBoldAndLogo() throws IOException {
        String font_weight = driver.findElement(By.xpath("//h5[text()='SIP Calculator']")).getCssValue("font-weight");
        System.out.println(font_weight + "-------------------");
        boolean BoldFont = font_weight.equals("bold") || Integer.parseInt(font_weight) >= 400;
        Assert.assertTrue(BoldFont);
        logoexist = SIPCalculatorLogo.isDisplayed();
        Assert.assertTrue(logoexist);
        WebCommands.staticSleep(500);
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Verified SIP Calculator text is bold and Logo is proper");
    }

    public  void Verify_Plan_Your_Client_Monthly_Investment_Text() throws IOException {
        String font_weight = driver.findElement(By.xpath("//p[text()=\"Plan your client's monthly investments and help them know the future wealth\"]")).getCssValue("font-weight");
        System.out.println(font_weight + "-------------------");
        boolean BoldFont = font_weight.equals("bold") || Integer.parseInt(font_weight) >= 400;
        Assert.assertTrue(BoldFont);
        WebCommands.staticSleep(500);
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Verified Plan Your Client Monthly Investment Text is proper");
    }

    public  void Verify_SIP_Calculator_Redirection() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        Assert.assertEquals(SIPCalculatorText.getText(), "SIP Calculator");
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Verified SIP calculator redirection is proper");
    }

    public  void Verify_Logo_Redirection() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        TestUtil.click(TMLogo, "Clicked on Logo");
        TestUtil.getFullPageScreenShot();
        url = driver.getCurrentUrl();
        Assert.assertEquals(url.contains("home"), true);
        LogUtils.info("Verified LOGO redirection is proper");
    }

    public  void Verify_Plan_Your_Client_Monthly_Investment_Redirection() throws IOException {
        TestUtil.click(SIPDescriptionLink, "SIP Calculator Description Link clicked");
        Assert.assertEquals(SIPCalculatorText.getText(), "SIP Calculator");
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Verified Plan Your Client Monthly Investment link redirection is proper");
    }

    public void SIP_Calculator_Breadcrumb_Navigation() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        TestUtil.click(SIPBreadcrumHome, "Clicked on Home");
        url = driver.getCurrentUrl();
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(url.contains("home"), true);
        LogUtils.info("Verified breadcrum Home Navigation from SIP Calculator Page");
    }

    public void Verify_Personalised_Investment_Growth_Text() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        Assert.assertEquals(PIGText.getText(), "Personalised Investment Growth");
        LogUtils.info("Verified Personalised Investment Growth Text");
        TestUtil.getFullPageScreenShot();
    }

    public void Verify_Systematic_Investment_Plan_Calculator_Text() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        Assert.assertEquals(SIPCText.getText(), "Systematic Investment Plan Calculator");
        LogUtils.info("Verified Systematic Investment Plan Calculator Text");
        TestUtil.getFullPageScreenShot();
    }

    public void Verify_Visualise_your_client_financial_growth_Text() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        Assert.assertEquals(VCIGText.getText(), "Visualise your client’s financial growth");
        LogUtils.info("Verified Visualise your client’s financial growth Text");
        TestUtil.getFullPageScreenShot();
    }

    public void Verify_Amount_Field() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        TestUtil.clear(AmountField, "Amount field cleared");
        TestUtil.sendKeys(AmountField,"0", "Amount entered");
        Assert.assertEquals(ValidationErrorText.getText(), "Minimum value allowed is 100");
        LogUtils.info("Verified Amount field with amount 0");
        TestUtil.getFullPageScreenShot();
    }

    public void Verify_Amount_Field_With_Higher_Value() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        TestUtil.clear(AmountField, "Amount field cleared");
        TestUtil.sendKeys(AmountField,"10000000", "Amount entered");
        Assert.assertEquals(ValidationErrorHigherValueText.getText(), "Maximum value allowed is 1,00,000");
        LogUtils.info("Verified Amount field with higher amount");
        TestUtil.getFullPageScreenShot();
    }

    public void Verify_Suggested_Amount_Field() throws IOException {
        TestUtil.click(SIPCalculatorLogo, "Clicked on SIP Calculator option");
        ArrayList<WebElement> list = new ArrayList<>(driver.findElements(By.xpath("//div[@class='disp-flex mt8 w700']//button")));
        ArrayList<String> a = new ArrayList<>();
        for (WebElement e1 : list) {
            a.add(e1.getText());
            e1.click();
            String fA = ("₹ " + AmountField.getAttribute("value"));
            System.out.println(fA + "-------text field amount---------");
            System.out.println(e1.getText() + "==========Amount============");
            Assert.assertEquals(fA, e1.getText());
            LogUtils.info("Verified All suggested Amounts and ale to select field suggested amount");
            TestUtil.getFullPageScreenShot();
        }
    }

}
