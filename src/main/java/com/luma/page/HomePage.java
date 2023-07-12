package com.luma.page;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By womenTops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By clickOnJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By menBottoms = By.xpath("//a[@id='ui-id-18']");
    By clickOnPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By clickOnBags = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverOnWomenMenu() throws InterruptedException {
        Thread.sleep(2000);

        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() throws InterruptedException {
        Thread.sleep(2000);

        mouseHoverToElement(womenTops);
    }

    public void clickOnJackets() throws InterruptedException {
        Thread.sleep(2000);

        clickOnElement(clickOnJackets);

    }

    public void mouseHoverOnMenMenu() throws InterruptedException {
        Thread.sleep(2000);

        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() throws InterruptedException {
        Thread.sleep(2000);

        mouseHoverToElement(menBottoms);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(3000);

        clickOnElement(clickOnPants);
    }

    public void mouseHoverOnGearMenu() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(2000);

        clickOnElement(clickOnBags);
    }
}
