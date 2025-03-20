package br.com.testeAkad.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private static final By adminButton = By.cssSelector("li:nth-child(1) > a > span");
    private static final By addButton = By.cssSelector("div.orangehrm-header-container > button");
    private static final By userRole = By.xpath("//div[contains(@class, 'oxd-select-text--after')]");
    private static final By adminRole = By.xpath("//div[contains(@class, 'oxd-select-dropdown')]//span[text()='Admin']");
    private static final By employeeName = By.cssSelector("div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > input");
    private static final By selectEmployeeName = By.xpath(".//span[contains(text(), 'A')]");
    private static final By userStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div" +
            "[3]/div/div[2]/div/div/div[2]");
    private static final By userStatusEnabled = By.xpath("//div[contains(@class, 'oxd-select-dropdown')]//span[text()" +
            "='Enabled']");
    private static final By usernameField = By.cssSelector("div:nth-child(4) > div > div:nth-child(2) > input");
    private static final By passwordField = By.cssSelector("div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell > div > div:nth-child(2) > input");
    private static final By confirmPasswordFIeld = By.cssSelector("div.oxd-form-row.user-password-row > div > div:nth-child(2) > div > div:nth-child(2) > input");
    private static final By saveButton = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space");
    private static final By usernameText = By.xpath("//div[contains(@class, 'oxd-table-body')]//div[text()" +
            "='1 Teste Akad']");
    private static final By editButton= By.xpath("./ancestor::div[contains(@class, 'oxd-table-row')]//button[2]");
    private static final By editedUsernameText = By.xpath("//div[contains(@class, 'oxd-table-body')]//div[text()" +
            "='1 Teste Akad 2']");



    public void clickAdminButton(){click(adminButton);}
    public void clickAddButton(){click(addButton);}
    public void selectUserRole(){selectItem(userRole, adminRole);}
    public void employeeNameInput(String text){selectName(employeeName, text, selectEmployeeName);}
    public void selectUserStatus(){selectItem(userStatus, userStatusEnabled);}
    public void usernameInput(String text) throws InterruptedException {sendKeys(usernameField, text);}
    public void passwordInput(String text) throws InterruptedException {sendKeys(passwordField, text);}
    public void confirmPasswordInput(String text) throws InterruptedException {sendKeys(confirmPasswordFIeld, text);}
    public void clickSaveButton(){click(saveButton);}
    public String getUsernameText(){return getText(usernameText);}
    public void clickEditUser(){editUser(usernameText, editButton);}
    public String getEditedUsernameText(){return getText(editedUsernameText);}

}
