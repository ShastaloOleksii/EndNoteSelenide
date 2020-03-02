package com.myendnoteweb.basetest;

import com.codeborne.selenide.Configuration;
import com.myendnoteweb.pages.LoginPage;
import com.myendnoteweb.pages.MainPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private LoginPage loginPage = new LoginPage();
    private MainPage mainPage = new MainPage();



    public LoginPage getLoginPage() {
        return loginPage;
    }

    public MainPage getMainPage() {
        return mainPage;
    }

@BeforeTest
public void  beforeMyTests(){
    Configuration.timeout=5000;
    System.setProperty("webdriver.chrome.driver", "chromedriver");
}


    public void preconditionsLogin() {
        open(getLoginPage().getHost());
        $(By.xpath(getLoginPage().getLoginField())).setValue(getLoginPage().getLogin());
        $(By.xpath(getLoginPage().getPasswordField())).setValue(getLoginPage().getPassword());
        $(By.xpath(getLoginPage().getButtonLogin())).click();

    }
}
