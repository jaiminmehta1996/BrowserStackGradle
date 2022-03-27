package com.browserstackdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {
        WebDriver dr=new ChromeDriver();
        dr.get("https://www.browserstack.com/docs/automate/selenium/getting-started/nodejs/webdriverio#introduction");
    }
}
