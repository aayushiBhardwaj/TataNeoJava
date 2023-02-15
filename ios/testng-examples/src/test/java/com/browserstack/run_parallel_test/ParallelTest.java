package com.browserstack.run_parallel_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.URL;
import java.util.Date;


public class ParallelTest extends BrowserStackTestNGTest {

  @Test
  public void test() throws Exception {
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    MobileElement el1 = driver.findElement(By.id("Allow"));
        el1.click();

        MobileElement el2 = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Tata Neu SIT\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"));
        el2.setValue("7059791147");

        MobileElement el3 = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Get OTP\"]"));
        el3.click();

        Thread.sleep(5000);

        MobileElement el4 = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Tata Neu SIT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]"));
        el4.click();
        el4.setValue("214263");

        Thread.sleep(10000);
        
          TouchAction touchAction = new TouchAction(driver);
          touchAction.tap(PointOption.point(190, 522)).perform();

        // driver.performTouchAction(org.openqa.selenium.interactions.touch.TouchActions.singleTap(190, 522).build());

        MobileElement el5 = driver.findElement(By.id("Mobiles"));
        el5.click();

        Thread.sleep(5000);

        MobileElement el6 = driver.findElement(By.id("Apple iPhone 13 ₹71,990"));
        el6.click();

        Thread.sleep(15000);

        // TouchAction action = new TouchAction(driver);
        //   action.press(PointOption.point(540, 600));
        //   action.moveTo(PointOption.point(544, 580));
        //   action.release();
        //   action.perform();

        // driver.performTouchAction(org.openqa.selenium.interactions.touch.TouchActions.press(PointOption.point(540, 600)).waitAction(100).moveTo(544, 517).release().build());

        Date waitTill = new Date(new Date().getTime() + 15000);

        while (driver.getContextHandles().size() <= 1 && waitTill.after(new Date())) {
            Thread.sleep(1000);
        }

        String contexts = driver.getContextHandles().toArray()[3].toString();
        driver.context(contexts);

        Thread.sleep(5000);

        MobileElement pincodeLbl = driver.findElement(By.xpath("(//span[@class='header-pincode-edit pincode-s-edit pincode-pencil-icon'])[2]"));
        pincodeLbl.click();

        Thread.sleep(5000);

        MobileElement pincodeTxb = driver.findElement(By.xpath("//input[@class='formControl dark-input-pincode pinElem']"));
        pincodeTxb.clear();
        pincodeTxb.setValue("400610");

        MobileElement continueBtn = driver.findElement(By.xpath("//button[contains(text(),\'Continue\')]"));
        continueBtn.click();

        Thread.sleep(5000);
        jse.executeScript("window.scrollBy(0,300)", "");

        TouchAction action2 = new TouchAction(driver);
          action2.press(PointOption.point(540, 600));
          action2.moveTo(PointOption.point(544, 517));
          action2.release();
          action2.perform();

          Thread.sleep(5000);

        MobileElement buyNowBtn = driver.findElement(By.xpath("//button[contains(text(),\'buy now\')]"));
        buyNowBtn.click();
    
        driver.navigate().back();
        String context2 = driver.getContextHandles().toArray()[0].toString();
        driver.context(context2);
        
        Thread.sleep(5000);
    
  }
}
