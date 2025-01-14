package org.turtlemint.pages.B2B_Pages;

import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.turtlemint.base.TestBase;
import org.turtlemint.commands.WebCommands;
import org.turtlemint.util.TestUtil;

import java.io.IOException;
import java.util.ArrayList;


public class TC_127_147_page extends TestBase {
    @FindBy(xpath = "//h5[text()=\"Goal Amount Calculator\"]")
    WebElement goalCalculatortxt;
    @FindBy(xpath = "//button[text()=\" Share\"]")
    WebElement shareButton;
    @FindBy(xpath = "//button[@class=\"sc-AxhCb sc-fzozJi sc-fzpans cKJzHK\"]")
    WebElement shareBlack;
    @FindBy(xpath = "//input[@id=\"clientName\"]")
    WebElement clientName;
    @FindBy(xpath = "//input[@id=\"clientMobile\"]")
    WebElement clientMobile;
    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellBtn;
    @FindBy(xpath = "//span[text()=\"Mutual Funds\"]")
    WebElement MFbutton;
    @FindBy(xpath = "//a[contains(text(),'Explore more funds')]")
    WebElement explorebutton;
    @FindBy(xpath = "//span[text()=\"Best Performing Funds\"]")
    WebElement bestfund;
    @FindBy(xpath = "//p[contains(text(),\"1\")]")
    WebElement contactBook1;
    @FindBy(xpath = "(//button[contains(text(),'Invest Now')])[1]")
    WebElement invest;
    @FindBy(xpath = "//p[contains(text(), \"Disclaimer: This calculator is meant\")]")
    WebElement disclaimerGoal;
    @FindBy(xpath = "//h2[contains(text(),'Explore top rated')]")
    WebElement elssfundheader;
    @FindBy(xpath = "//h2[text()=\"Mirae Asset ELSS Tax Saver Fund -Regular Plan-Growth\"]")
    WebElement elssheader;
    @FindBy(xpath = "//p[text()=\"Personalised Investment Growth\"]")
    WebElement personalInvest;
    @FindBy(xpath = "//span[text()='Read More']")
    WebElement Read_more;
    @FindBy(xpath = "//span[text()='Read Less']")
    WebElement Read_Less;
    @FindBy(xpath = "//p[text()=\"Copyright © 2024 Turtlemint Mutual Funds Distributors Private Limited \"]")
    WebElement copyrighttxt;
    @FindBy(xpath = "//p[contains(text(), 'AMFI Registered')]")
    WebElement amftext;
    @FindBy(xpath = "//p[contains(text(), 'Mutual Fund investments')]")
    WebElement mftext;
    @FindBy(xpath = "//h4[text()='Quick Links']")
    WebElement qlinktext;
    @FindBy(xpath = "//h4[text()='Company']")
    WebElement comptext;
    @FindBy(xpath = "//span[@title=\"Turtlemint Money - Invest in best performing funds by consulting experts for free\"]")
    WebElement TMlogo;
    JavascriptExecutor js = (JavascriptExecutor) driver;


    public TC_127_147_page() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateSellButton() {
        WebCommands.staticSleep(5000);
        TestUtil.click(SellBtn, "Sell button click");
        WebCommands.staticSleep(1000);

    }

    public void shareWithoutdetails() {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        TestUtil.click(shareButton, "Click on share icon on goal amount calculator page");
        TestUtil.click(shareBlack, "Click on share without entering customer name and mobile number");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
    }

    public void validName() {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        TestUtil.click(shareButton, "Click on share icon on goal amount calculator page");
        TestUtil.sendKeys(clientName, "Test Demo", "Customer name entered");
        TestUtil.click(shareBlack, "Click on share without entering mobile number");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void validMobileNo() {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        TestUtil.click(shareButton, "Click on share icon on goal amount calculator page");
        TestUtil.sendKeys(clientMobile, "9898928922", "Customer mobile number entered");
        TestUtil.click(shareBlack, "Click on share without entering customer name");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void existingMobileNo() {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        TestUtil.click(shareButton, "Click on share icon on goal amount calculator page");
        TestUtil.sendKeys(clientName, "Test Demo", "Customer name entered");
        TestUtil.sendKeys(clientMobile, "7666995440", "Already mapped Customer mobile number entered");
        TestUtil.click(shareBlack, "Click on share");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void existingNameMobileNo() {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        TestUtil.click(shareButton, "Click on share icon on goal amount calculator page");
        TestUtil.sendKeys(clientName, "Feb bro", "Already mapped Customer name entered");
        TestUtil.sendKeys(clientMobile, "6999912345", "Already mapped Customer mobile number entered");
        TestUtil.click(shareBlack, "Click on share");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void contactBook() {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        WebCommands.staticSleep(2000);
        TestUtil.click(shareButton, "Click on share icon on goal amount calculator page");
        TestUtil.sendKeys(clientName, "Feb bro", "Already mapped Customer name entered");
        TestUtil.sendKeys(clientMobile, "6999912345", "Already mapped Customer mobile number entered");
        TestUtil.click(shareBlack, "Click on share");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        WebCommands.staticSleep(2000);
        TestUtil.click(TMlogo,"Clicked on logo");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        String actualText = contactBook1.getText();
        System.out.println(actualText);
        Assert.assertEquals("Text matched", "1", actualText);
        System.out.println("Text matched");

    }

    public void disclaimer() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        String Actualtext = disclaimerGoal.getText();
        System.out.println(Actualtext);
        Assert.assertEquals("Text matched", "Disclaimer: This calculator is meant to be used for indicative purposes only. It is designed to assist you in determining the appropriate amount of prospective investments. Read More", Actualtext);
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();

    }

    public void readMore() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        js.executeScript("arguments[0].click();", Read_more);
        String Actualtext = disclaimerGoal.getText();
        System.out.println(Actualtext);
        Assert.assertEquals("Text matched", "Disclaimer: This calculator is meant to be used for indicative purposes only. It is designed to assist you in determining the appropriate amount of prospective investments. This calculator alone is not sufficient and shouldn’t be used for the development or implementation of any investment strategy. Turtlemint mutual fund distributor private Limited does not take the responsibility/liability nor does it undertake the authenticity of the figures calculated therein. Turtlemint mutual fund distributor private Limited makes no warranty about the accuracy of the calculators/reckoners. The examples do not claim to represent the performance of any security or investments. In view of the individual nature of tax consequences, each investor is advised to consult his/her own professional tax advisor before making any investment decisions on the basis of the results provided through the use of this calculator. Mutual Funds do not have a fixed rate of return and it is not possible to predict the rate of return. Read Less", Actualtext);
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();

    }

    public void readLess() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        js.executeScript("arguments[0].click();", Read_more);
        js.executeScript("arguments[0].click();", Read_Less);
        String Actualtext = disclaimerGoal.getText();
        System.out.println(Actualtext);
        Assert.assertEquals("Text matched", "Disclaimer: This calculator is meant to be used for indicative purposes only. It is designed to assist you in determining the appropriate amount of prospective investments. Read More", Actualtext);
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();

    }

    public void elsstext() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        String actualText = elssfundheader.getText();
        System.out.println(actualText);
        Assert.assertEquals("Text matched", "Explore top rated ELSS funds to invest", actualText);
        TestUtil.getFullPageScreenShot();

    }

    public void investNow() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        TestUtil.click(invest, "Clicked on invest now");
        WebCommands.staticSleep(2000);
        String actualText = elssheader.getText();
        System.out.println(actualText);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals("Text matched", "Mirae Asset ELSS Tax Saver Fund -Regular Plan-Growth", actualText);

    }

    public void investNowback() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        TestUtil.click(invest, "Clicked on invest now");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        String actualText = personalInvest.getText();
        System.out.println(actualText);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals("URL matched", "Personalised Investment Growth", actualText);
    }

    public void explorefunds() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        js.executeScript("arguments[0].click();", explorebutton);
        System.out.println("Clicked on explore more funds");
        WebCommands.staticSleep(2000);
        String actualText = bestfund.getText();
        System.out.println(actualText);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals("URL matched", "Best Performing Funds", actualText);
    }

    public void Copyright() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        String Actualtxt = copyrighttxt.getText().replaceAll("[\\r\\n]+", " ");
        System.out.println(Actualtxt);
        Assert.assertEquals("Text matched", "Copyright © 2024 Turtlemint Mutual Funds Distributors Private Limited All Rights Reserved", Actualtxt);
        TestUtil.getFullPageScreenShot();
    }

    public void amfiTxt() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        String Actualtxt = amftext.getText();
        System.out.println(Actualtxt);
        Assert.assertEquals("Text matched", "AMFI Registered Distributor | ARN - 159953 | Date of Initial Registration - 13th Feb 2019 | ARN validity upto - 12 Feb 2025", Actualtxt);
        TestUtil.getFullPageScreenShot();
    }

    public void mfiTxt() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        String Actualtxt = mftext.getText();
        System.out.println(Actualtxt);
        Assert.assertEquals("Text matched", "Mutual Fund investments are subject to market risks, read all scheme related documents carefully.", Actualtxt);
        TestUtil.getFullPageScreenShot();
    }

    public void qLinkText() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        String Actualtxt = qlinktext.getText();
        System.out.println(Actualtxt);
        Assert.assertEquals("Text matched", "Quick Links", Actualtxt);
        TestUtil.getFullPageScreenShot();
    }

    public void companytxt() throws IOException {
        TestUtil.click(MFbutton, "Click on Mutual fund");
        TestUtil.click(goalCalculatortxt, "Clicked on goal amount calculator option");
        String Actualtxt = comptext.getText();
        System.out.println(Actualtxt);
        Assert.assertEquals("Text matched", "Company", Actualtxt);
        TestUtil.getFullPageScreenShot();
    }



}
