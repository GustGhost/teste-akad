package br.com.testeAkad.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private static final By usernameField = By.name("username");
    private static final By passwordField = By.name("password");
    private static final By loginButton = By.cssSelector("div.oxd-form-actions.orangehrm-login-action > button");

    public void usernameInput(String text) throws InterruptedException {sendKeys(usernameField, text);}
    public void passwordInput(String text) throws InterruptedException {sendKeys(passwordField, text);}
    public void clickLoginButton(){click(loginButton);}

}
