package teststatic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassB {

    static  String okbede;
    String get = ClassA.getTaiKhoan();
    String test;


    @BeforeClass
    public void beforeClass(){
        get();
    }

    @Test
    public void TC_01(){
        String local = ClassA.getTaiKhoan();

        ClassA.setTaiKhoan("check");

        System.out.println(ClassA.getTaiKhoan());

    }

    public static void get(){
        System.out.println("okbe");
    }
}
