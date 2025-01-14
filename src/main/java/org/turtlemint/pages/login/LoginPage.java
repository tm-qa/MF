package org.turtlemint.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.turtlemint.base.TestBase;
import org.turtlemint.commands.WebCommands;
import org.turtlemint.util.LogUtils;
import org.turtlemint.util.TestUtil;


public class LoginPage extends TestBase {

    @FindBy(name = "mobileNumber")
    WebElement MobileNumber;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement ContinueBtn;

    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement OTPField;

    @FindBy(xpath = "//span[text()='Verify OTP']")
    WebElement VerifyOTPBtn;

    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellCTA;

    @FindBy(xpath = "//span[text()='Mutual Funds']")
    WebElement MutualFundsCTA;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateLogin(String username, String otp) {
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        TestUtil.sendKeys(MobileNumber, username, "Mobile Number Entered");
        TestUtil.click(ContinueBtn, "Continue pressed");
        TestUtil.sendKeys(OTPField, otp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Login Successful");
        WebCommands.staticSleep(2000);
    }

    public void MFDashboard() {
        TestUtil.click(SellCTA, "Sell button pressed");
        TestUtil.click(MutualFundsCTA, "Mutual Funds CTA pressed");
        WebCommands.staticSleep(2000);
    }
}
