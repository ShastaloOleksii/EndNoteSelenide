package com.myendnoteweb.tests;

import com.myendnoteweb.basetest.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTests extends BaseTest {
    @FindBy(xpath = ".//input[@id = 'mat-input-0']")
    private WebElement loginField;

    @FindBy(id = "mat-input-1")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class,'btn--login')]")
    private WebElement buttonLogIn;

    @FindBy(xpath = ".//a[contains(text(), 'Show Getting Started Guide')]")
    private WebElement showGettingStartedGuide;


    @Test
    public void userCanLogin() {
        open("https://access.clarivate.com/login?app=endnote");
        $(By.xpath(".//input[@id = 'mat-input-0']")).sendKeys(getLogin());
        $(By.id("mat-input-1")).sendKeys(getPassword());
        $(By.xpath("//button[contains(@class,'btn--login')]")).click();
        $(By.xpath(".//td[contains(@id, 'idFoderDesc')]")).should(id("idFoderDesc"));
    }

    @Test
    public void clickFormatTabClickMyReferences() {
        preconditions();
        $(By.id(getTab()+"4")).click();
        $(By.xpath(".//a[contains(@id, 'lgLink1')]")).click();
        $(By.xpath(".//form[contains(@name, 'citationSearchForm')]")).should(name("citationSearchForm"));

    }

    @Test
    public void hidePanel() {
        preconditions();
       // $(By.xpath(".//input[contains(@value,'Show panel')]/parent::*")).click();
        $(By.xpath(".//input[contains(@value,'Hide panel')]/parent::*")).click();
        $(By.xpath(".//input[contains(@name,'hideorshow')]")).should(value("show"));
    }

    @Test
    public void linkUnfieldclick() {
        preconditions();
        $(By.xpath(".//input[contains(@value,'Show panel')]/parent::*")).click();
        $(By.xpath(".//a[contains(@title,'View references not in a group')]")).click();
        $(By.xpath(".//td[contains(@class,'heading')]")).should(text("[Unfiled]"));
    }

    @Test
    public void clickOnTheCollectTab() {
        preconditions();
        $(By.id(getTab() + "2")).click();
        $(By.xpath(".//div[contains(@class,'heading')]/following-sibling::*")).should(text("Step 1"));

    }
//private String CollectTabHeading
    @Test
    public void clickOnTheTabOrganize() {
        preconditions();
        $(By.id(getTab() + "3")).click();
        $(By.xpath(".//div[contains(@class,'heading')]")).should(text("Manage My Groups"));
    }

    @Test
    public void clickOnTheButtonFormat() {
        preconditions();
        $(By.id(getTab() + "4")).click();
        $(By.xpath(".//div[contains(@class,'heading')]")).should(text("Bibliography"));
    }

    @Test
    public void clickOnTheButtonMatch(){
        preconditions();
        $(By.id(getTab()+"5")).click();
        $(By.xpath(".//textarea[contains(@id,'title')]")).should(id("title"));
    }

    @Test
    public void clickOnTheButtonOptions(){
        preconditions();
        $(By.id(getTab()+"6")).click();
        $(By.xpath(".//div[contains(@class,'heading')]")).should(text("Change Password"));
    }

    @Test
    public void clickOnTheButtonDownloads(){
        preconditions();
        $(By.id(getTab()+"7")).click();
        $(By.xpath(".//span[contains(text(),'Cite While You Write')]")).should(text("Cite While You Write"));
    }
}
