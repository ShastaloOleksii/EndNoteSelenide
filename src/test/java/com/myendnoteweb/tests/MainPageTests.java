package com.myendnoteweb.tests;

import com.myendnoteweb.basetest.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTests extends BaseTest {


    @Test
    public void userCanLogin() {
        open(getLoginPage().getHost());
        $(By.xpath(getLoginPage().getLoginField())).setValue(getLoginPage().getLogin());
        $(By.xpath(getLoginPage().getPasswordField())).setValue(getLoginPage().getPassword());
        $(By.xpath(getLoginPage().getButtonLogin())).click();
        $(By.xpath(getMainPage().getAllMyReferencesTitle())).should(text(getMainPage().getIdAllMyReferencesTitle()));
    }

    @Test
    public void clickFormatTabClickMyReferences() {
        preconditionsLogin();
        $(By.id(getMainPage().getTab() + "4")).click();
        $(By.id(getMainPage().getTab()+ "1")).click();
        $(By.xpath(getMainPage().getPanel())).should(name(getMainPage().getNameOfPanel()));

    }

    @Test
    public void hidePanel() {
        preconditionsLogin();
        $(By.xpath(getMainPage().getOpenPanelButton())).click();
        $(By.xpath(getMainPage().getHidePanelButton())).click();
        $(By.xpath(getMainPage().getHidePanelValue())).should(value(getMainPage().getPanelHideStatus()));
    }

    @Test
    public void linkUnfieldclick() {
        preconditionsLogin();
        $(By.xpath(getMainPage().getUnFieldTabOnThePanel())).click();
        $(By.xpath(getMainPage().getUnfieldTabHeading())).should(text(getMainPage().getUnfieldHeading()));
    }

    @Test
    public void clickOnTheCollectTab() {
        preconditionsLogin();
        $(By.id(getMainPage().getTab() + "2")).click();
        $(By.xpath(getMainPage().getCcollectTabHeading())).should(text(getMainPage().getHeadCollectTab()));
    }


    @Test
    public void clickOnTheTabOrganize() {
        preconditionsLogin();
        $(By.id(getMainPage().getTab() + "3")).click();
        $(By.xpath(getMainPage().getOrganizeTabHeading())).should(text(getMainPage().getTextInHeadingOrganize()));
    }

    @Test
    public void clickOnTheTabFormat() {
        preconditionsLogin();
        $(By.id(getMainPage().getTab() + "4")).click();
        $(By.xpath(getMainPage().getFormatTabHeading())).should(text(getMainPage().getTextInHeadingFormat()));
    }

    @Test
    public void clickOnTheTabMatch() {
        preconditionsLogin();
        $(By.id(getMainPage().getTab() + "5")).click();
        $(By.xpath(getMainPage().getMatchTabHeading())).should(id(getMainPage().getTextInHeadingMatch()));
    }

    @Test
    public void clickOnTheTabOptions() {
        preconditionsLogin();
        $(By.id(getMainPage().getTab() + "6")).click();
        $(By.xpath(getMainPage().getOrganizeTabHeading())).should(text(getMainPage().getTextInHeadingOptions()));
    }

    @Test
    public void clickOnTheTabDownloads() {
        preconditionsLogin();
        $(By.id(getMainPage().getTab()+ "7")).click();
        $(By.xpath(getMainPage().getDownloadsTabHeading())).should(text(getMainPage().getTextInHeadingDownloads()));
    }
}
