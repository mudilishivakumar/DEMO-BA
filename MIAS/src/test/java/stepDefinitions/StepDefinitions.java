package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StepDefinitions {
    public WebDriver driver;

    @Given("As a user i want to open chrome browser")
    public void as_a_user_i_want_to_open_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions

        WebDriverManager.chromedriver().setup();

//        driver = new ChromeDriver();
//        driver.manage().window().maximize();

    }

    @Then("User hits the MIA's at time")
    public void user_hits_the_mia_s_at_time() throws InterruptedException {

        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-notifications", "disable-web-security", "enable-automation", "credentials_enable_service", "disable-infobars"));


        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        opt.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(opt);

        driver.manage().window().maximize();
        //News MIA
        driver.get("https://cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=63465f703296d20001bc7261&disableTV=true");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        //Boston MIA
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=63494dfb3296d20001bc7332&disableTV=true");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        //Stocks MIA
        driver.get("https://cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=632dba8d8ab6820001ae3a08&disableTV=true");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        //FundRaising
        driver.get("https://cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=6346c7183296d20001bc7293&disableTV=true");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        //DigitalSignage
        driver.get("https://cdn.gaiansolutions.com/digital_nba/DIGI1/DIGI1.html");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        //Emojis
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://dev.cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=626132eeaccb2f00016fabbc");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        //News Banner
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://dev.cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=630e0ee7ea3a640001d9d82b");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        //Boston Banner
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://dev.cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=63493b533296d20001bc731e");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        //Stocks Banner
        driver.get("http://dev.cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=632c551f8ab6820001ae39d5");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        //Quiz Skinned WKAR
        driver.get("http://dev.cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=6240bdb8ac66f60001e037fc");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        Thread.sleep(8000);
        driver.switchTo().newWindow(WindowType.TAB);
        //Curious Crew Analytics Dashboard
        driver.get("http://dev.cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=6261825f1c4a510001f69e5a&disableTV=true");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        //Family weather dashboard
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=62596049aefa9b0001ca5b73");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        Thread.sleep(8000);
        //MIA Dashboards
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://dev.cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=62fb70bbb3fd6500013d2214&disableTV=true");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        //WeatherCondition - NullSchool
        driver.get("http://dev.cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=62fb70bbb3fd6500013d2214&disableTV=true");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        //IBM Slide

        driver.get("http://dev.cdn.gaiansolutions.com/ba/broadband/6256aa40db27ec000190dc38_v_18/IBM_Slide_9.html");
        Thread.sleep(8000);
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://cdn.gaiansolutions.com/index.html?tenantId=618b6fdef5dacc0001a6b1b0&appId=634c74a63296d20001bc7427&disableTV=true");

        Thread.sleep(25000);
        driver.findElement(By.cssSelector(".form-control[type='text']")).sendKeys("mobius@gaiansolutions.com");
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("Gaian@123");
        driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());

    }
}