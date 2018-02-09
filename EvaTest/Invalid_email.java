package EvaTest;


import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Invalid_email {

    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        Faker faker = new Faker();

        //add_report addReport = new add_report();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("fitway12@mailinator.com");
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("140407");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[@class='ng-binding' and text()='Add Report']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[2]/fieldset/div[2]/div/div/label")).click();
        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[2]/ul/li/a")).click();
        //Email Invalid

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[9]/div[2]/div/div/input")).sendKeys("abc@gmail^g.com");
        String email = driver.findElement(By.xpath("//span[@ng-show='reportForm.email.$error.pattern']")).getText();
        Boolean checkstatus = false;

        if (email.contains("Please enter a valid email address")) {

            checkstatus = true;

            Assert.assertTrue(checkstatus);
            System.out.println("User gets message when input invalid email");
        }
    }
}
