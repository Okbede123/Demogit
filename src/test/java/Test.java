import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class Test {


    @BeforeClass
    public void beforeClass()
    {
        System.out.println("1");
    }


    @org.testng.annotations.Test
    public void testc1()
    {
        System.out.println("testcase");
    }



    public static int getResult(int n){
        if(n == 5){
            return 15;
        } else  {
            return 3 * getResult(n+1);
        }
    }



}
