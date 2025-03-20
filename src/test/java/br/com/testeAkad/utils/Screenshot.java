package br.com.testeAkad.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static br.com.testeAkad.utils.Browser.driver;

public class Screenshot {
    public void takeScreenshot(String stepName) {
        try {
            Thread.sleep(2000);
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File("evidences/" + stepName + ".png");
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot salvo: " + destFile.getAbsolutePath());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
