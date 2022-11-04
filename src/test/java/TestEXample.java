import org.testng.annotations.Test;
import utils.DataManager;


public class TestExample extends BaseTest{


    @Test
    void TestExample(){

        DataManager data = DataManager.getInstance();

        //wrapper for get driver
        openBrowser("https://www.saucedemo.com/");


        //data faker for email random
        System.out.println(data.getRandomEmail());

    }
}
