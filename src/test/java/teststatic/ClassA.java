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

    }

    @Test
    public void TC_01(){

    }
}
