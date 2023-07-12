package com.luma.testsuite;

import com.luma.page.WomenPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenPageTest extends BaseTest
{
    WomenPage womenPage = new WomenPage();
    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException
    {
        womenPage.mouseHoverOnWomenMenu();
        Thread.sleep(1000);
        womenPage.mouseHoverOnTops();
        Thread.sleep(1000);
        womenPage.clickOnJacket();
        womenPage.productListBeforeSorting();
        Thread.sleep(1000);
        womenPage.productListAfterSorting();
        Thread.sleep(1000);
        womenPage.priceListBeforeSorting();
        womenPage.priceListAfterSorting();
    }

}
