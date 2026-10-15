package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class CartTests extends BaseTest {

    @Test
    public void addItemToCartUpdatesCartCount() {
        new LoginPage(driver).login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addBackpackToCart();

        Assert.assertEquals(inventoryPage.getCartCount(), "1");
    }
}
