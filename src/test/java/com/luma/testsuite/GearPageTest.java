package com.luma.testsuite;

import com.luma.page.GearPage;
import com.luma.page.HomePage;
import com.luma.page.OverNightDufflePage;
import com.luma.page.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearPageTest extends BaseTest
{
    HomePage homePage = new HomePage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    GearPage gearPage =new GearPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException
    {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        Thread.sleep(1000);
        gearPage.clickOnBagProductName();
        overNightDufflePage.verifyTheTextOvernightDuffle();
        Thread.sleep(1000);
        overNightDufflePage.changeQuantity();
        Thread.sleep(1000);
        overNightDufflePage.clickOnAddToCartButton();
        overNightDufflePage.verifyTextYouAdded_ProductNameMessage();
        Thread.sleep(1000);
        overNightDufflePage.clickOnShoppingCartInToMessage();
        shoppingCartPage.verifyTheBagProductName();
        shoppingCartPage.verifyTheProductQuantity();
        shoppingCartPage.verifyTheProductPrice();
        shoppingCartPage.changeShoppingCartQuantity();
        shoppingCartPage.verifyTheProductPrice();
        shoppingCartPage.updateShoppingCartButton();
        shoppingCartPage.verifyTheFinalProductPrice();

    }
}
