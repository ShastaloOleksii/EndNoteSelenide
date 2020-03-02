package com.myendnoteweb.pages;

import com.myendnoteweb.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private String loginField = ".//input[@id = 'mat-input-0']";
    private String passwordField = ".//input[contains(@id,'mat-input-1')]";
    private String buttonLogin = "//button[contains(@class,'btn--login')]";
    private String login = "igavudu-5763@yopmail.com";
    private String password = "A123456@";


    public String getLoginField() {
        return loginField;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public String getButtonLogin() {
        return buttonLogin;
    }



    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }




}
