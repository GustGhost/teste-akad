package br.com.testeAkad.steps;

import br.com.testeAkad.pages.HomePage;
import br.com.testeAkad.pages.LoginPage;
import br.com.testeAkad.utils.Screenshot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomePageSteps extends BaseSteps {

    LoginPage loginPage = new LoginPage();
    Screenshot screenshot = new Screenshot();
    HomePage homePage = new HomePage();

    @Before
    public void login() throws InterruptedException {
        loginPage.usernameInput("Admin");
        loginPage.passwordInput("admin123");
        screenshot.takeScreenshot("1-UsernameAndPassword_Screenshot");
        loginPage.clickLoginButton();
    }


   @Test
   public void addNewUserTest() throws InterruptedException {
        screenshot.takeScreenshot("2-HomePage_Screenshot");
        homePage.clickAdminButton();
        screenshot.takeScreenshot("3-AfterAdminClick_Screenshot");
        homePage.clickAddButton();
        homePage.selectUserRole();
        screenshot.takeScreenshot("4-AdminRoleSelected_Screenshot");
        homePage.employeeNameInput("A");
        homePage.selectUserStatus();
        screenshot.takeScreenshot("5-UserStatusSelected_Screenshot");
        homePage.usernameInput("1 Teste Akad");
        homePage.passwordInput("Teste123");
        homePage.confirmPasswordInput("Teste123");
        screenshot.takeScreenshot("6-UserCompleted_Screenshot");
        homePage.clickSaveButton();
        Assert.assertEquals("1 Teste Akad", homePage.getUsernameText());
        screenshot.takeScreenshot("7-UsernameInList_Screenshot");
        homePage.clickEditUser();
        homePage.usernameInput("1 Teste Akad 2");
        screenshot.takeScreenshot("8-UsernameEdited_Screenshot");
        homePage.clickSaveButton();
        Assert.assertEquals("1 Teste Akad 2", homePage.getEditedUsernameText());
        screenshot.takeScreenshot("9-EditedUsernameInList_Screenshot");
   }
}
