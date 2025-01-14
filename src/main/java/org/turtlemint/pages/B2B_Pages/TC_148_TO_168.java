package org.turtlemint.pages.B2B_Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.turtlemint.base.TestBase;
import org.turtlemint.commands.WebCommands;
import org.turtlemint.util.TestUtil;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import static org.turtlemint.base.TestBase.driver;

public class TC_148_TO_168 extends TestBase {

    public TC_148_TO_168() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[text()='Tax Saving Funds']")
    WebElement TaxSaver;
    @FindBy(xpath = "//a[text()='Equity Funds']")
    WebElement Equity;
    @FindBy(xpath = "//a[text()='Debt Funds']")
    WebElement Debt;
    @FindBy(xpath = "//a[text()='Liquid Funds']")
    WebElement Liquid;
    @FindBy(xpath = "//a[text()='Terms & Conditions']")
    WebElement Terms;
    @FindBy(xpath = "//a[text()='Privacy Policy']")
    WebElement Privacy;
    @FindBy(xpath = "//a[text()='Disclosures']")
    WebElement Discl;
    @FindBy(xpath = "//a[text()='SEBI']")
    WebElement Sebi;
    @FindBy(xpath = "//a[text()='AMFI']")
    WebElement AMFI;
    @FindBy(xpath = "//a[text()='AMFI - Code of Conduct']")
    WebElement AmfiCode;
    @FindBy(xpath = "//a[text()='Best Performing Funds']")
    WebElement Best;

    @FindBy(xpath = "//h5[text()='Goal Amount Calculator']")
    WebElement Goal;

    public void Goal(){
        WebCommands.staticSleep(2000);
        TestUtil.click(Goal,"Goal clicked");
    }




    public void TC_148_toverify_Taxsaverfundareredirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(TaxSaver,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_149_toverifyon_clickon_browserback() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(TaxSaver,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_150_toverify_Equity_fund_reredirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Equity,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_151_toverifyon_clickon_browserback_Equity_fund() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Equity,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_152_toverify_Debtfund_redirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Debt,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_153_toverifyon_clickon_browserback_Debtfund() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Debt,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_154_toverify_Liquidfund_redirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Liquid,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_155_toverifyon_clickon_browserback_Liquidfund() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Liquid,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_156_toverify_termsandcondition_redirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Terms,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_157_toverifyon_clickon_browserback_Liquidfund() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Terms,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_158_toverify_Privacy_redirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Privacy,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_159_toverifyon_clickon_browserback_Privacy() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Privacy,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_160_toverify_Disclosure_redirecting() throws IOException {
        WebCommands.staticSleep(5000);
        TestUtil.click(Discl,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);

    }
    public void TC_161_toverifyon_clickon_browserback_Disclosure() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Discl,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_162_toverify_SEBI_redirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Sebi,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_163_toverifyon_clickon_browserback_SEBI() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Sebi,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_164_toverify_AMFI_redirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(AMFI,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_165_toverifyon_clickon_browserback_AMFI() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(AMFI,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_166_toverify_AmfiCode_redirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(AmfiCode,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }
    public void TC_167_toverifyon_clickon_browserback_AMFICode() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(AmfiCode,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void TC_168_toverify_BEST_redirecting() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Best,"Clikced tax saver");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(1000);
    }


}
