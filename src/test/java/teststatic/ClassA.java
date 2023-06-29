package teststatic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassA {

    static String taiKhoan1;

    public static void setTaiKhoan(String taiKhoan){
       taiKhoan1 = taiKhoan;
    }

    public static String getTaiKhoan(){
        return taiKhoan1;
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeclass a");
    }

    @Test(groups = {"gr1", "gr2"})
    public void TC_01(){
        System.out.println("tc1 a");
    }

    @Test
    public void TC_02(){
        System.out.println("tc2 b");
    }
}
