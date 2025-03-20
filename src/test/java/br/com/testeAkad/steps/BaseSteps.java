package br.com.testeAkad.steps;

import br.com.testeAkad.utils.Browser;
import org.junit.After;
import org.junit.Before;

public class BaseSteps extends Browser {

    @Before
    public void openBrowserAction(){
        openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @After
    public void closeBrowserAction() {
        closeBrowser();
    }

}
