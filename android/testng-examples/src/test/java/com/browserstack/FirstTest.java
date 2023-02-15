package com.browserstack;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class FirstTest extends BrowserStackTestNGTest {


        @Test
        public void test() throws Exception {

                JavascriptExecutor jse = (JavascriptExecutor) driver;
                try {

                        WebElement exploreLnk = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(90)).until(
                                ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Explore\"]/android.widget.ImageView")));
                        exploreLnk.click();
                        Thread.sleep(3000);


                        WebElement mobileCategoryLnk = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(60)).until(
                                ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Mobiles']")));
                        mobileCategoryLnk.click();
                        Thread.sleep(5000);



                        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
                        wait.until(ExpectedConditions.visibilityOfAllElements());

                        WebElement phoneBannerLnk = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(90)).until(
                                ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView")));
                        phoneBannerLnk.click();
                        Thread.sleep(5000);



                        Set<String> contextNames = driver.getContextHandles();
                        System.out.println("Printing Context");
                        System.out.println(contextNames.size());
                        System.out.println(contextNames.toString());

                        Thread.sleep(5000);
                        driver.context("WEBVIEW_com.tatadigital.tcp.dev");


                        Thread.sleep(5000);

                        jse.executeScript("window.scrollBy(0,-350)", "");

                        WebElement productTitle = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(90)).until(
                                ExpectedConditions.elementToBeClickable(By.cssSelector(".pd-title.pd-title-normal")));
                        driver.executeScript("arguments[0].scrollIntoView(true);", productTitle);
                        System.out.println("Product Title " + productTitle.getText());

                        jse.executeScript("scrollBy(0, 100)");

                        jse.executeScript("window.scrollTo(0, 0);", "");


                        WebElement pincodeLbl = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(90)).until(
                                ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='header-pincode-edit pincode-s-edit pincode-pencil-icon'])[2]")));
                        pincodeLbl.click();

                        WebElement pincodeTxb = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(90)).until(
                                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='formControl dark-input-pincode pinElem']")));
                        pincodeTxb.clear();
                        pincodeTxb.sendKeys("400610");



                        WebElement continueBtn = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(90)).until(
                                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
                        continueBtn.click();

                        Thread.sleep(5000);


                        jse.executeScript("scrollBy(0, 100)");

                        jse.executeScript("window.scrollTo(0, 0);", "");

                        jse.executeScript("scrollBy(0, 4500)");

                        WebElement buyNowBtn = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(90)).until(
                                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'buy now')]")));
                        driver.executeScript("arguments[0].scrollIntoView(true);", buyNowBtn);

                         wait = new WebDriverWait(driver, Duration.ofSeconds(90));
                        wait.until(ExpectedConditions.elementToBeClickable(buyNowBtn));
                        System.out.println("FIELD NAME " + buyNowBtn.getText());
                        buyNowBtn.click();


                        wait.until(ExpectedConditions.invisibilityOf(buyNowBtn));

                        wait.until(ExpectedConditions.visibilityOfAllElements());


                        jse.executeScript("scrollBy(0, 4500)");

                        jse.executeScript("window.scrollTo(0, 20);", "");

                        driver.context("NATIVE_APP");


                        WebElement webViewCloseIcon = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.tatadigital.tcp.dev:id/ivClose")));
                        webViewCloseIcon.click();


                        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Assertion Successful!\"}}");

                } catch (
                        Exception e) {
                        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Assertion Failed\"}}");
                }

        }
}



