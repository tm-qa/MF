package Login_Page;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.turtlemint.base.TestBase;
import org.turtlemint.pages.login.LoginPage;

import static org.turtlemint.base.TestBase.initialization;

public class login extends TestBase {

    LoginPage login;

    @BeforeMethod()
    public void start()  {
        initialization();

        login = new LoginPage();

    }

    @Test()
    public void login() throws Exception {
        login.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
    }

    @AfterMethod()
    public void Close() {
        driver.quit();
    }
}
