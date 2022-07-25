package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static Properties properties;
    public static WebDriver driver;

    public Base() {
        try {
            properties = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\HP\\IdeaProjects\\mySeleniumProject\\src\\main\\java\\config\\config.properties"));
            properties.load(ip);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        {
            String browser = properties.getProperty("browser");

            switch (browser) {
                case "Chrome":
                    System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe ");
                    driver = new ChromeDriver();
                    break;
            }

            driver.get(properties.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            driver.quit();
        }
    }
}
