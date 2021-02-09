package com.cyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {

    public static void main(String[] args) {

        //System.setProperty("webdriver.gecko.driver", "geckodriver");
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
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

        driver.findElement(By.className("radius")).click();

    }
}
