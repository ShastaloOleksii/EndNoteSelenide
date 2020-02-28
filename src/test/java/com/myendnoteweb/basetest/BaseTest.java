package com.myendnoteweb.basetest;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.id;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getTab() {
        return tab;
    }

    private String login = "igavudu-5763@yopmail.com";
    private String password = "A123456@";
    private  String tab = "lgLink";

    public void preconditions() {
        open("https://access.clarivate.com/login?app=endnote");
        $(By.xpath(".//input[@id = 'mat-input-0']")).sendKeys(login);
        $(By.id("mat-input-1")).sendKeys(password);
        $(By.xpath("//button[contains(@class,'btn--login')]")).click();
        $(By.xpath(".//td[contains(@id, 'idFoderDesc')]")).should(id("idFoderDesc"));

    }
}
