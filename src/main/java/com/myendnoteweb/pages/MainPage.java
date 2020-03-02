package com.myendnoteweb.pages;

import com.myendnoteweb.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    private String idAllMyReferencesTitle = "All My References";
    private String allMyReferencesTitle = ".//td[contains(@id, 'idFoderDesc')]";
    private String panel = ".//form[contains(@name, 'citationSearchForm')]";
    private String nameOfPanel = "citationSearchForm";
    private String hidePanelButton = ".//input[contains(@value,'Hide panel')]";
    //".//input[contains(@value,'Hide panel')]/parent::*";
    private String openPanelButton = ".//input[contains(@value,'Show panel')]";
    private String hidePanelValue = ".//input[contains(@name,'hideorshow')]";
    private String unFieldTabOnThePanel = ".//a[contains(@title,'View references not in a group')]";
    private String unfieldTabHeading = ".//td[contains(text(),'[Unfiled]')]";
    private String unfieldHeading = "[Unfiled]";
    private String OrganizeTabHeading = ".//div[contains(@class,'heading')]";
    private String textInHeadingFormat = "Bibliography";
    private String textInHeadingOrganize = "Manage My Groups";
    private String panelHideStatus = "show";
    private String formatTabHeading = ".//div[contains(@class,'heading')]";
    private String matchTabHeading = ".//textarea[contains(@id,'title')]";
    private String optionsTabHeading = ".//div[contains(@class,'heading')]";
    private String downloadsTabHeading = ".//span[contains(text(),'Cite While You Write')]";
    private String panelHideButton = ".//input[contains(@name,'hideorshow')]";
    private String myReferencesTabHeading = ".//form[contains(@name, 'citationSearchForm')]";
    private String loginButton = "//button[contains(@class,'btn--login')]";
    private String mainPageHeaders = ".//td[contains(@id, 'idFoderDesc')]";
    private String textInHeadingMatch = "title";

    public String getTextInHeadingDownloads() {
        return textInHeadingDownloads;
    }

    private String textInHeadingDownloads = "Cite While You Write™";
    private String textInHeadingOptions = "Change Password";

    public String getTextInHeadingMatch() {
        return textInHeadingMatch;
    }

    public String getHeadCollectTab() {
        return headCollectTab;
    }

    public String getPanelHideStatus() {
        return panelHideStatus;
    }

    public String getOrganizeTabHeading() {
        return OrganizeTabHeading;
    }

    public String getFormatTabHeading() {
        return formatTabHeading;
    }

    public String getMatchTabHeading() {
        return matchTabHeading;
    }

    public String getOptionsTabHeading() {
        return optionsTabHeading;
    }

    public String getDownloadsTabHeading() {
        return downloadsTabHeading;
    }

    public String getPanelHideButton() {
        return panelHideButton;
    }

    public String getMyReferencesTabHeading() {
        return myReferencesTabHeading;
    }

    public String getTextInHeadingOptions() {
        return textInHeadingOptions;
    }

    public String getLoginButton() {
        return loginButton;
    }

    public String getMainPageHeaders() {
        return mainPageHeaders;
    }

    private String headCollectTab = "Step 1";

    public String getCcollectTabHeading() {
        return CcollectTabHeading;
    }

    private String CcollectTabHeading = ".//div[contains(@class,'heading')]/following-sibling::*";

    public String getIdAllMyReferencesTitle() {
        return idAllMyReferencesTitle;
    }

    public String getTextInHeadingOrganize() {
        return textInHeadingOrganize;
    }

    public String getAllMyReferencesTitle() {
        return allMyReferencesTitle;
    }

    public String getPanel() {
        return panel;
    }

    public String getTextInHeadingFormat() {
        return textInHeadingFormat;
    }


    public String getNameOfPanel() {
        return nameOfPanel;
    }

    public String getHidePanelButton() {
        return hidePanelButton;
    }

    public String getHidePanelValue() {
        return hidePanelValue;
    }

    public String getUnFieldTabOnThePanel() {
        return unFieldTabOnThePanel;
    }

    public String getUnfieldTabHeading() {
        return unfieldTabHeading;
    }

    public String getUnfieldHeading() {
        return unfieldHeading;
    }


    public String getOpenPanelButton() {
        return openPanelButton;
    }


    @FindBy(xpath = ".//a[contains(text(), 'Show Getting Started Guide')]")
    private WebElement showGettingStartedGuide;
}
