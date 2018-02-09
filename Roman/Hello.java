// This is dumy file

package com.qauber.lerning;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ProfileRobotWF17 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Robot robot = new Robot();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("poyuh@0mixmail.info");
        driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("7735011528");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='mr-sm ng-binding']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@ng-click='$ctrl.editUserProfile()']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ngf-select='$ctrl.selectProfilePicture($file)']")).click();

        Thread.sleep(3000);
        String s1 = driver.findElement(By.xpath("//img[@src='app/img/profile.jpg']")).getAttribute("src");
        System.out.println(s1);

        Thread.sleep(1000);

        StringSelection ss;
        ss = new StringSelection("C:\\Users\\Scoot\\OneDrive\\Pictures\\test.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        Thread.sleep(5000);

        driver.close();
    }
}