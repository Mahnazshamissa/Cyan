package com.cyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/mahnaz/Desktop/Cyan Login/Login Auth/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");

        // Find username
        WebElement txtUsername =
                driver.findElement(By.id("username"));
        txtUsername.sendKeys("tomsmith");

        // Set password
        WebElement txtPassword =
                driver.findElement(By.id("password"));
        txtPassword.sendKeys("SuperSecretPassword!");

        // Click submit
        //WebElement submit =

        driver.findElement(By.xpath("//button[@class='radius' and @type='submit']")).click();

    }
}
