package br.com.testeAkad.pages;

import br.com.testeAkad.utils.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BasePage extends Elements {
    public static void click(By by){
        waitElement(by);
        element(by).click();
    }

    public static void sendKeys(By by, String text) throws InterruptedException {
        waitElement(by);
        Thread.sleep(500);
        element(by).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        Thread.sleep(500);
        element(by).sendKeys(text);
    }

    public static String getText(By by){
        waitElement(by);
        return element(by).getText();
    }

    public static void selectItem(By by, By item){
        waitElement(by);
        element(by).click();
        waitElement(item);
        element(item).click();
    }

    public static void selectName(By by, String text, By item){
        waitElement(by);
        element(by).sendKeys(text);
        waitElement(item);
        element(item).click();
    }

    public static void editUser(By by, By item){
        waitElement(by);
        element(by).findElement(item).click();
    }
}
