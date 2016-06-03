package TestData.appModules;

/**
 * Created by diz on 03.06.2016.
 */

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;

import pageObjects.LogIn_Page;

import utility.ExcelUtils;

public class SignIn_Action {
    public static void Execute(WebDriver driver) throws Exception {

        //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

        String sumA = ExcelUtils.getCellData(1, 1);

        String sumB = ExcelUtils.getCellData(1, 2);


    }
}
