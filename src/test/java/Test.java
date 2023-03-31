import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
    public static void main(String[] args) {

        System.out.println(getResult(3));
    }

    public static int getResult(int n){
        if(n == 5){
            return 15;
        } else  {
            return 3 * getResult(n+1);
        }
    }



}
