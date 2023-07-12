package com.luma.testsuite;

import com.luma.page.HomePage;
import com.luma.page.MenPage;
import com.luma.page.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenPageTest extends BaseTest
{
    HomePage homepage = new HomePage();
    MenPage menpage = new MenPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homepage.mouseHoverOnMenMenu();
        homepage.mouseHoverOnBottom();
        homepage.clickOnPants();

        menpage.pantSize();
        Thread.sleep(1000);

        menpage.pantColour();
        Thread.sleep(1000);

        menpage.addToCart();

        Assert.assertEquals(menpage.verifyAddedItemToTheShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.");

        menpage.clickOnShoppingCartInMessage();

        Assert.assertEquals(shoppingCart.verifyTextShoppingCart(), "Shopping Cart");

        Assert.assertEquals(shoppingCart.verifyTheProductName(), "Cronus Yoga Pant");

        Assert.assertEquals(shoppingCart.verifyTheProductSize(), "32");

        Assert.assertEquals(shoppingCart.verifyTheProductNameColour(), "Black");
    }
}
