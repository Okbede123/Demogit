import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ClassDemogit3 {

    int var = 1;
    static int var1 = 5;
//    public static void main(String[] args) {
////       testMethod(5);
//    }

    @BeforeClass
    public void  beforeClass()
    {
        System.out.println("bf");
    }

    @Test
    public void  tesst()
    {
        testMethod(6);
        System.out.println("test");
    }


    public static void testMethod(int num){

        if(num == 5){
            System.out.println("so 5 1");
        }
        else if (num == 5)
        {
            System.out.println("so 5 2");
        }
    }

}
