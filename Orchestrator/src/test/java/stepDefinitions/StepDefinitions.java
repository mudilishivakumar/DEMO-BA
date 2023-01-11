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


    @Given("User visits orchestrator the Portal")
    public void user_visits_orchestrator_the_portal() throws InterruptedException, AWTException {

        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-notifications", "disable-web-security", "enable-automation", "credentials_enable_service", "disable-infobars"));


        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        opt.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(opt);

        driver.manage().window().maximize();
//Screen-1
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Username
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("mobius@gaiansolutions.com");
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("Gaian@123");
        //Home screen
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Username
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("mobius@gaiansolutions.com");
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("Gaian@123");
//Login
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();

        //My work flows
        //Home screen
//Screen-2
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Username
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("mobius@gaiansolutions.com");
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("Gaian@123");
//Login
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();
        // driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();
//Workflowbutton
        Thread.sleep(19000);
        driver.findElement(By.xpath("//*[@id=\"v-workflows-tab\"]/div/span")).click();
//Tool box
        //Screen-3
        //Home screen
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Username
//        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("mobius@gaiansolutions.com");
//        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("Gaian@123");
////Login
//        driver.findElement(By.xpath("//body[1]/app-root[1]/app-signin[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();
//        //Tool box button
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"v-workflows-tab\"]/div/span")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"v-pills-components-tab\"]/div/span")).click();
        //civic duty screen
        //Screen-4
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Tool box button
        Thread.sleep(19000);
        driver.findElement(By.xpath("//*[@id=\"v-pills-components-tab\"]/div/span")).click();
        //civic duty work flow button
        Thread.sleep(9000);
        //Search bar
        driver.findElement(By.xpath("//*[@id=\"pr_id_10_label\"]")).click();
        driver.findElement(By.cssSelector("[aria-activedescendant='p-highlighted-option']")).sendKeys("civic");
        driver.findElement(By.cssSelector("#pr_id_10_list > p-dropdownitem:nth-child(1) > li")).click();
        Thread.sleep(3000);
        //zoom
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();

        Actions act = new Actions(driver);

        WebElement ele = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act.doubleClick(ele).perform();
        WebElement ele1 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act.doubleClick(ele1).perform();
        WebElement ele2 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act.doubleClick(ele2).perform();
        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
//close
//        driver.findElement(By.xpath("//body[1]/app-root[1]/app-home-page[1]/div[1]/div[1]/div[1]/app-sidebar[1]/div[1]/div[2]/app-configure-component[1]/div[1]/div[1]/a[1]/i[1]")).click();
//Monitoring screen
        //Screen-5
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Tool box button
        Thread.sleep(19000);
        driver.findElement(By.xpath("//*[@id=\"v-pills-components-tab\"]/div/span")).click();
        //civic duty work flow button
        Thread.sleep(9000);
        //Search bar
        driver.findElement(By.xpath("//*[@id=\"pr_id_10_label\"]")).click();
        driver.findElement(By.cssSelector("[aria-activedescendant='p-highlighted-option']")).sendKeys("civic");
        driver.findElement(By.cssSelector("#pr_id_10_list > p-dropdownitem:nth-child(1) > li")).click();
        Thread.sleep(3000);
        //Zoom
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();
        Thread.sleep(8000);
        Actions act1 = new Actions(driver);

        WebElement ele4 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act1.doubleClick(ele4).perform();
        WebElement ele5 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act1.doubleClick(ele5).perform();
        WebElement ele3 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act.doubleClick(ele3).perform();
        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.cssSelector("[type='button '] [style='font-size: 1.5rem;']")).click();
//        Thread.sleep(9000);
//        driver.findElement(By.xpath("//body[1]/app-root[1]/app-home-page[1]/div[1]/div[1]/div[1]/app-sidebar[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]/span[1]")).click();
        //Monitoring screen click
        //Screen-6
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Tool box button
        Thread.sleep(19000);
        driver.findElement(By.xpath("//*[@id=\"v-pills-components-tab\"]/div/span")).click();
        //civic duty work flow button
        Thread.sleep(9000);
        //Search bar
        driver.findElement(By.xpath("//*[@id=\"pr_id_10_label\"]")).click();
        driver.findElement(By.cssSelector("[aria-activedescendant='p-highlighted-option']")).sendKeys("civic");
        driver.findElement(By.cssSelector("#pr_id_10_list > p-dropdownitem:nth-child(1) > li")).click();
//Zoom
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();

        Thread.sleep(6000);
        Actions act01 = new Actions(driver);

        WebElement ele01 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act01.doubleClick(ele01).perform();
        WebElement ele05 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act01.doubleClick(ele05).perform();
        WebElement ele03 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act.doubleClick(ele03).perform();

        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.cssSelector("[type='button '] [style='font-size: 1.5rem;']")).click();
//        Thread.sleep(9000);
//        driver.findElement(By.xpath("//body[1]/app-root[1]/app-home-page[1]/div[1]/div[1]/div[1]/app-sidebar[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]/span[1]")).click();
//click
        Thread.sleep(9000);
//        driver.findElement(By.xpath("//*[@id=\"v-pills-cockpit\"]/app-performance-component/div/div[2]/div/div[2]/div[4]/label/span")).click();

        driver.findElement(By.cssSelector("#v-pills-cockpit-tab > div > span")).click();
        //Screen-7
        //cockpit Screen
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Tool box button
        Thread.sleep(19000);
        driver.findElement(By.xpath("//*[@id=\"v-pills-components-tab\"]/div/span")).click();
        //civic duty work flow button
        Thread.sleep(9000);
        //Search bar
        driver.findElement(By.xpath("//*[@id=\"pr_id_10_label\"]")).click();
        driver.findElement(By.cssSelector("[aria-activedescendant='p-highlighted-option']")).sendKeys("civic");
        driver.findElement(By.cssSelector("#pr_id_10_list > p-dropdownitem:nth-child(1) > li")).click();
//Zoom
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();


        Thread.sleep(6000);
        Actions acz1 = new Actions(driver);

        WebElement az1 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act01.doubleClick(az1).perform();
        WebElement az2 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act01.doubleClick(az2).perform();
        WebElement az3 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act.doubleClick(az3).perform();

        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.cssSelector("[type='button '] [style='font-size: 1.5rem;']")).click();
//        Thread.sleep(9000);
//        driver.findElement(By.xpath("//body[1]/app-root[1]/app-home-page[1]/div[1]/div[1]/div[1]/app-sidebar[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]/span[1]")).click();
//click
        Thread.sleep(9000);
        driver.findElement(By.cssSelector("#v-pills-cockpit-tab > div > span")).click();
        Thread.sleep(9000);
        driver.findElement(By.cssSelector(" #v-pills-cockpit > app-performance-component > div > div.pt-3.px-3.ng-star-inserted > div > div.ng-star-inserted > div:nth-child(4) > label > span")).click();

        Thread.sleep(90000);
        //Store the web element
        WebElement frame1 = driver.findElement(By.xpath("//iframe[1]"));

//Switch to the frame
        driver.switchTo().frame(frame1);


//Now we can click the button
        driver.findElement(By.linkText("aa0ab1c3-6157-11ed-8569-b61c2cb8071e")).click();
        Thread.sleep(2000);


        //Screen-8
//Variables
        //cockpit Screen
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://orchestrator.gaiansolutions.com/");
        //Tool box button
        Thread.sleep(19000);
        driver.findElement(By.xpath("//*[@id=\"v-pills-components-tab\"]/div/span")).click();
        //civic duty work flow button
        Thread.sleep(9000);
        //Search bar
        driver.findElement(By.xpath("//*[@id=\"pr_id_10_label\"]")).click();
        driver.findElement(By.cssSelector("[aria-activedescendant='p-highlighted-option']")).sendKeys("civic");
        driver.findElement(By.cssSelector("#pr_id_10_list > p-dropdownitem:nth-child(1) > li")).click();
//Zoom
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();
        driver.findElement(By.cssSelector("#model-area > app-modeling-section > div > div.modeler.w-100 > div:nth-child(2) > div.mt-2.ng-star-inserted > div:nth-child(1) > div > div > button:nth-child(9) > span.p-button-icon.pi.pi-search-minus")).click();


        Thread.sleep(6000);
        Actions acz2 = new Actions(driver);

        WebElement az22 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act01.doubleClick(az22).perform();
        WebElement az02 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act01.doubleClick(az02).perform();
        WebElement az03 = driver.findElement(By.cssSelector(".djs-palette-two-column [data-element-id='GaianWorkflows167'][height='100%'] [data-element-id='Activity_0fm4jx5_63073737fe91f100015f33e4']"));
        act.doubleClick(az03).perform();

        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"collap-configuration\"]/div[1]/div/p-treeselect/div/div[2]/div")).click();
        driver.findElement(By.cssSelector("[type='button '] [style='font-size: 1.5rem;']")).click();
        Thread.sleep(9000);
//        driver.findElement(By.xpath("//body[1]/app-root[1]/app-home-page[1]/div[1]/div[1]/div[1]/app-sidebar[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]/span[1]")).click();
//click
        Thread.sleep(9000);
        driver.findElement(By.cssSelector("#v-pills-cockpit-tab > div > span")).click();
        Thread.sleep(9000);
        driver.findElement(By.cssSelector(" #v-pills-cockpit > app-performance-component > div > div.pt-3.px-3.ng-star-inserted > div > div.ng-star-inserted > div:nth-child(4) > label > span")).click();

        Thread.sleep(90000);
        //Store the web element
        WebElement frame = driver.findElement(By.xpath("//iframe[1]"));

//Switch to the frame
        driver.switchTo().frame(frame);


//Now we can click the button
        driver.findElement(By.linkText("aa0ab1c3-6157-11ed-8569-b61c2cb8071e")).click();
        Thread.sleep(2000);


//        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[3]/div[1]/a[2]/i")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div[2]/button")).click();
//        driver.switchTo().defaultContent();
//        Thread.sleep(5000);
//        WebElement frame2 = driver.findElement(By.xpath("//iframe[1]"));
//        driver.switchTo().frame(frame2);
        //Maximum
        Thread.sleep(9000);
        driver.findElement(By.cssSelector("body > div.ctn-main > div > div:nth-child(3) > div > div > div.ctn-column.ctn-content > div.ctn-row.ctn-content-top > a.maximize-collapsable.vertical-collapse.expand-collapse > i")).click();
        Thread.sleep(9000);
        //History
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div[2]/button")).click();
        Thread.sleep(89000);
        //variables
        driver.findElement(By.xpath("//*[@id=\"react-tabs-2\"]/a")).click();
        Robot robot = new Robot();

        for (int i = 0; i < 4; i++) {


            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#react-tabs-3 > table > tbody > tr:nth-child(8344) > td:nth-child(3) > button")).click();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        ////        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[3]/div[1]/a[2]/i")).click();
////        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div[2]/button")).click();
////        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[3]/div[2]/div/div/view/div/div[2]/div/div/div/table/tbody/tr[8]/td[4]/div/div/a")).click();
////        driver.findElement(By.cssSelector("body > div.ctn-main > div > div:nth-child(3) > div > div > div.ctn-column.ctn-content > div.ctn-row.ctn-content-top > div > div > div.ng-isolate-scope > div > div.diagram-holder.grab-cursor > div > div:nth-child(3) > button > svg > path")).click();
////        driver.findElement(By.cssSelector(".process-instances tr:nth-child(1) .instance-id span a")).click();
////        driver.findElement(By.xpath("path[d='M504 255.531c.253 136.64-111.18 248.372-247.82 248.468-59.015.042-113.223-20.53-155.822-54.911-11.077-8.94-11.905-25.541-1.839-35.607l11.267-11.267c8.609-8.609 22.353-9.551 31.891-1.984C173.062 425.135 212.781 440 256 440c101.705 0 184-82.311 184-184 0-101.705-82.311-184-184-184-48.814 0-93.149 18.969-126.068 49.932l50.754 50.754c10.08 10.08 2.941 27.314-11.313 27.314H24c-8.837 0-16-7.163-16-16V38.627c0-14.254 17.234-21.393 27.314-11.314l49.372 49.372C129.209 34.136 189.552 8 256 8c136.81 0 247.747 110.78 248 247.531zm-180.912 78.784l9.823-12.63c8.138-10.463 6.253-25.542-4.21-33.679L288 256.349V152c0-13.255-10.745-24-24-24h-16c-13.255 0-24 10.745-24 24v135.651l65.409 50.874c10.463 8.137 25.541 6.253 33.679-4.21z']")).click();
//        }
    }

}