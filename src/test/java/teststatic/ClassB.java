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

    @Test(groups = {"gr1"})
    public void TC_01(){
        String local = ClassA.getTaiKhoan();

        ClassA.setTaiKhoan("tc 1");

        System.out.println(ClassA.getTaiKhoan());

    }

    public static void get(){
        System.out.println("get 1");
    }
}
