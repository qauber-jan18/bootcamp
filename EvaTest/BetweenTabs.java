package EvaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class BetweenTabs {

    public static void main(String[] args) throws InterruptedException {
        WebDriver cd = new ChromeDriver();

        cd.get("file:///Users/eva/Desktop/testarraywindowhandles.html");

        Thread.sleep(3000);


//LOOP


        for(int i = 1; i < 5; i++) {
            cd.findElement(By.xpath("/html/body/h1[" + i + "]/a")).click();

        }



        Thread.sleep(3000);


//                    cd.switchTo().window(parentWindowHandle);
        //((JavascriptExecutor)cd).executeScript("window.open();");

        ArrayList<String> tabs = new ArrayList <String>(cd.getWindowHandles());
        System.out.println(tabs.get(0));
        System.out.println(tabs.get(1));
        System.out.println(tabs.get(2));
        System.out.println(tabs.get(3));
        System.out.println(tabs.get(4));


        //cd.switchTo().window(tabs.get(0));

        Thread.sleep(500);
        cd.switchTo().window(tabs.get(3));
        Thread.sleep(500);
        cd.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("buy shoes");
        cd.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        cd.switchTo().window(tabs.get(4));
        cd.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
        cd.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Thread.sleep(500);
        cd.switchTo().window(tabs.get(2));
        cd.findElement(By.xpath("//*[@id=\"uh-search-box\"]")).sendKeys("shoes");
        cd.findElement(By.xpath("//*[@id=\"uh-search-button\"]")).click();
        Thread.sleep(500);
        cd.switchTo().window(tabs.get(1));
        Thread.sleep(500);
        cd.findElement(By.xpath("//*[@id=\"topcat2\"]")).click();
//      cd.findElement(By.xpath("//*[@id=\"srchword\"]")).click();
//      cd.findElement(By.xpath("//*[@id=\"srchword\"]")).sendKeys("shoes");
//      cd.findElement(By.xpath("//*[@id=\"queryTop\"]/div/input[6]")).click();
//        Thread.sleep(500);
//        cd.switchTo().window(tabs.get(3));
//        Thread.sleep(500);
//        cd.switchTo().window(tabs.get(4));
//        Thread.sleep(500);

// driver.switchTo().window(tabs.get(0));

    }
}


