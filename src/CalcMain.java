/**
 * Created by diz on 03.06.2016.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import TestData.utility.Constant;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class CalcMain {




    public static void main(String[] args) throws Exception {

        //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");




        ExcelUtils.setCellData("Pass", 1, 3);

    }


}
