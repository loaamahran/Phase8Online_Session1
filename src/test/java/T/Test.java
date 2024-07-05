package T;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertTrue;

public class Test {


public static void main(String[]args)
{Test.t1();
    Test.t2();
    Test.t3();

}
@org.testng.annotations.Test
static void t1(){
    WebDriver driver=new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.findElement(By.linkText("Form Authentication")).click();
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.className("radius")).click();
    String actualResult=driver.findElement(By.id("flash")).getText();
    String expectedResult="You logged into a secure area!";
    assertTrue(actualResult.contains(expectedResult));


}
@org.testng.annotations.Test
static void t2(){
    WebDriver driver=new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.findElement(By.linkText("Form Authentication")).click();
    driver.findElement(By.id("username")).sendKeys("tomsmit");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.className("radius")).click();
    String actualResult=driver.findElement(By.id("flash")).getText();
    String expectedResult="Your username is invalid!";
    assertTrue(actualResult.contains(expectedResult));}

    @org.testng.annotations.Test
    static void t3(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!!");
        driver.findElement(By.className("radius")).click();
        String actualResult=driver.findElement(By.id("flash")).getText();
        String expectedResult="Your password is invalid!";
        assertTrue(actualResult.contains(expectedResult));}
}
