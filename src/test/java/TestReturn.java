public class TestReturn {


    static String check = "okbede";

    public static void main(String[] args) {
        TestReturn testReturn = new TestReturn();
        testReturn = testReturn.returnCheck();
    }

    public TestReturn returnCheck(){
        return this;
    }
}
