package org.turtlemint.pages.B2B_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.turtlemint.base.TestBase;
import org.turtlemint.commands.WebCommands;
import org.turtlemint.util.TestUtil;


public class SIP_Page extends TestBase {
    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellBtn;
    @FindBy(xpath = "//span[text()='Mutual Funds']")
    WebElement mf;
    @FindBy(xpath = "//h5[text()='SIP Calculator']")
    WebElement sip;
    @FindBy(xpath = "//span[text()='Read More']")
    WebElement Read_more;
    @FindBy(xpath = "//span[contains(text(),'Mutual Funds do not have a fixed rate of return and it is not possible to predict the rate of return.')]")
    WebElement Read_more_text;
    @FindBy(xpath = "//span[text()='Read Less']")
    WebElement Read_Less;
    @FindBy(xpath = "//p[contains(text(),'Disclaimer: This calculator is meant to be used for indicative purposes only.')]")
    WebElement Read_less_text;
    @FindBy(xpath = "//h2[text()='Explore top rated ELSS funds to invest']")
    WebElement Explore_elss;
    @FindBy(xpath = "(//button[text()='Invest Now'])[1]")
    WebElement Mirae_Invest_Now;
    @FindBy(xpath = "//h2[text()='Mirae Asset ELSS Tax Saver Fund -Regular Plan-Growth']")
    WebElement Mirae_Invest_Now_text;
    @FindBy(xpath = "(//button[text()='Invest Now'])[2]")
    WebElement Kotak_Invest_Now;
    @FindBy(xpath = "//h2[text()='Kotak ELSS Tax Saver-Scheme- Growth']")
    WebElement Kotak_Invest_NowText;
    @FindBy(xpath = "(//button[text()='Invest Now'])[3]")
    WebElement canera_Invest_Now;
    @FindBy(xpath = "//h2[text()='Canara Robeco ELSS Tax Saver Growth']")
    WebElement canera_Invest_NowText;
    @FindBy(xpath = "//a[text()='Explore more funds  ']")
    WebElement Explore_more_funds;
    @FindBy(xpath = "//h1[text()=' Best Performing Funds']")
    WebElement best_performing_funds;
    @FindBy(xpath = "//p[text()='Copyright © 2024 Turtlemint Mutual Funds Distributors Private Limited ']")
    WebElement copyright;
    @FindBy(xpath = "//p[text()='AMFI Registered Distributor | ARN - 159953 | Date of Initial Registration - 13th Feb 2019 | ARN validity upto - 12 Feb 2025']")
    WebElement AMFI;
    @FindBy(xpath = "//p[text()='Mutual Fund investments are subject to market risks, read all scheme related documents carefully.']")
    WebElement mf_subject_To_market_Risk;
    @FindBy(xpath = "//h4[text()='Quick Links']")
    WebElement Quick_Link;
    @FindBy(xpath = "//h4[text()='Company']")
    WebElement company;
    @FindBy(xpath = "//a[text()='Best Performing Funds']")
    WebElement best_performing_fundsCTA;
    @FindBy(xpath = "//a[text()='Tax Saving Funds']")
    WebElement Tax_savings_funds;
    @FindBy(xpath = "//h1[text()=' funds found for your requirement']")
    WebElement text_on_quick_links_redirected_Page;
    @FindBy(xpath = "//a[text()='Equity Funds']")
    WebElement equity_fund;
    @FindBy(xpath = "//a[text()='Debt Funds']")
    WebElement debt_Fund;
    @FindBy(xpath = "//a[text()='Liquid Funds']")
    WebElement liquid_Fund;

    public SIP_Page() {
        PageFactory.initElements(driver, this);
    }
    JavascriptExecutor jse = (JavascriptExecutor) driver;


    public void SIP() {
        WebCommands.staticSleep(2000);
        jse.executeScript("arguments[0].click();", SellBtn);
        System.out.println("Sell page clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(mf, "Mutual Fund Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(sip, "sip Clicked");
    }

    public void Read_more() {
        WebCommands.staticSleep(2000);
        TestUtil.click(Read_more, "Read_more Clicked");
        TestUtil.IsDisplayed(Read_more_text, "Read more text displayed");
    }

    public void Read_less() {
        WebCommands.staticSleep(2000);
        TestUtil.click(Read_more, "Read_more Clicked");
        TestUtil.IsDisplayed(Read_more_text, "Read more text displayed");
        TestUtil.click(Read_Less, "Read_less Clicked");
        TestUtil.IsDisplayed(Read_less_text, "Read less text displayed");
    }

    public boolean Explore_ELSS() {
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Explore_elss, "Explore_elss text displayed");
        String fontWeight = Explore_elss.getCssValue("font-weight");
        return Integer.parseInt(fontWeight) >= 500;
    }

    public void Invest_now() {
        WebCommands.staticSleep(2000);
        TestUtil.click(Mirae_Invest_Now, "Mirae_Invest_Now Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Mirae_Invest_Now_text, "Mirae_Invest_Now_text text displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        TestUtil.click(Kotak_Invest_Now, "Kotak_Invest_Now Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Kotak_Invest_NowText, "Kotak_Invest_NowText text displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        TestUtil.click(canera_Invest_Now, "canera_Invest_Now Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(canera_Invest_NowText, "canera_Invest_NowText text displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();

    }
    public void Explore_More_funds() {
        WebCommands.staticSleep(2000);
        TestUtil.click(Explore_more_funds, "Explore_more_funds Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(best_performing_funds, "best_performing_funds heading displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();

    }
    public void Footer_text_on_SIP_Page(){
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(copyright, "copyright text in footer displayed");
        TestUtil.IsDisplayed(AMFI, "AMFI text in footer  displayed");
        TestUtil.IsDisplayed(mf_subject_To_market_Risk, "mf_subject_To_market_Risk text in footer displayed");
        TestUtil.IsDisplayed(Quick_Link, "Quick_Link text in footer displayed");
        TestUtil.IsDisplayed(company, "company text in footer displayed");
    }
    public void Best_performing_Fund() {
        WebCommands.staticSleep(2000);
        TestUtil.click(best_performing_fundsCTA, "best_performing_fundsCTA Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(best_performing_funds, "best_performing_funds heading displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(best_performing_fundsCTA, "best_performing_fundsCTA  displayed");
    }
    public void Tax_saving_Fund() {
        TestUtil.click(Tax_savings_funds, "Tax_savings_funds Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(text_on_quick_links_redirected_Page, "Tax_savings_funds_Text_on_Page heading displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Tax_savings_funds, "Tax_savings_funds  displayed");
    }
    public void Equity_Fund() {
        WebCommands.staticSleep(2000);
        TestUtil.click(equity_fund, "Tax_savings_funds Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(text_on_quick_links_redirected_Page, "Equity_Fund heading displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(equity_fund, "equity_fund  displayed");
    }
    public void debt_Fund() {
        TestUtil.click(debt_Fund, "debt_Fund Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(text_on_quick_links_redirected_Page, "debt_Fund heading displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(debt_Fund, "debt_Fund  displayed");
    }
    public void liquid_Fund() {
        TestUtil.click(liquid_Fund, "debt_Fund Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(text_on_quick_links_redirected_Page, "liquid_Fund heading displayed");
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(liquid_Fund, "liquid_Fund  displayed");
    }

}
