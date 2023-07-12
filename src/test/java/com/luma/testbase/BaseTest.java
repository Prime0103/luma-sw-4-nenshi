package com.luma.testbase;

import com.luma.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){

        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){

        closeBrowser();
    }

}
