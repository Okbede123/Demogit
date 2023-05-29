import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCa2doituongapi {


    public static void main(String[] args) {
        Map<TestGanDoiTuongAPI2,String> map = new HashMap<>();
        testGanDoiTuongAPI testGanDoiTuongAPI = new testGanDoiTuongAPI();
        TestGanDoiTuongAPI2 testdoiTuongGanDoiTuongAPI2 = new TestGanDoiTuongAPI2();
        TestGanDoiTuongAPI2 testGanDoiTuongAPI2_lan2 = new TestGanDoiTuongAPI2();
        TestGanDoiTuongAPI3 testGanDoiTuongAPI3 = new TestGanDoiTuongAPI3();
        testGanDoiTuongAPI.setTest("set1");
        testGanDoiTuongAPI.setOkbe("bede123 nhe");
//        testGanDoiTuongAPI3.setTestGanDoiTuongAPI2(testdoiTuongGanDoiTuongAPI2);
//        testGanDoiTuongAPI3.getTestGanDoiTuongAPI2();
        testdoiTuongGanDoiTuongAPI2.setTesstt("233");
        testdoiTuongGanDoiTuongAPI2.setCheck(9999);
        testdoiTuongGanDoiTuongAPI2.setTestGanDoiTuongAPI(testGanDoiTuongAPI);
        testGanDoiTuongAPI2_lan2.setTesstt("45674");
        testGanDoiTuongAPI2_lan2.setCheck(8888);
        testGanDoiTuongAPI2_lan2.setTestGanDoiTuongAPI(testGanDoiTuongAPI);

        testGanDoiTuongAPI3.setTestGanDoiTuongAPI2(new TestGanDoiTuongAPI2());
        testGanDoiTuongAPI3.getTestGanDoiTuongAPI2().setTesstt("ok123341");
//        testGanDoiTuongAPI3.getTestGanDoiTuongAPI2().setCheck(4);
//        int t = testGanDoiTuongAPI3.getTestGanDoiTuongAPI2().getCheck();
//        testdoiTuongGanDoiTuongAPI2.setTestGanDoiTuongAPI(testGanDoiTuongAPI);
//        String check = testdoiTuongGanDoiTuongAPI2.getTestGanDoiTuongAPI().getTest();
//        String check2 = testdoiTuongGanDoiTuongAPI2.getTestGanDoiTuongAPI().getOkbe();
//
//        System.out.println(check + " "+ check2);
//        System.out.println(t);
//        System.out.println(testGanDoiTuongAPI3.getTestGanDoiTuongAPI2().getTesstt());
//        System.out.println(testGanDoiTuongAPI3.getTestGanDoiTuongAPI2().getTestGanDoiTuongAPI().getOkbe());

        List<TestGanDoiTuongAPI2>testGanDoiTuongAPI2s = new ArrayList<>();
        testGanDoiTuongAPI2s.add(testdoiTuongGanDoiTuongAPI2);
        testGanDoiTuongAPI2s.add(testGanDoiTuongAPI2_lan2);
        map.put(testdoiTuongGanDoiTuongAPI2,"1");
        map.put(testGanDoiTuongAPI2_lan2,"1");
        setcheck(testGanDoiTuongAPI2s,map);
        //tinhToan(testGanDoiTuongAPI3.getTestGanDoiTuongAPI2());
    }

    public static void tinhToan(TestGanDoiTuongAPI2 testGanDoiTuongAPI2){
        String check = TestGanDoiTuongAPI2.goiStatic();
        System.out.println(testGanDoiTuongAPI2.getTesstt() + " static la "+ check);
    }

    public static void   setcheck(List<TestGanDoiTuongAPI2> api2s,Map<TestGanDoiTuongAPI2,String> map){
        for (int i = 0; i < api2s.size(); i++) {
            System.out.println(api2s.get(i).getTesstt() + " -  "+api2s.get(i).getCheck() + api2s.get(i).getTestGanDoiTuongAPI().getTest());
        }

        for (TestGanDoiTuongAPI2 testGanDoiTuongAPI2: map.keySet()){
            System.out.println(testGanDoiTuongAPI2.getTesstt() + " map key");
        }
    }


    public void test(TestGanDoiTuongAPI2 testGanDoiTuongAPI2){
        TestGanDoiTuongAPI3 testGanDoiTuongAPI3 = new TestGanDoiTuongAPI3();
        testGanDoiTuongAPI3.getTestGanDoiTuongAPI2();
//        testGanDoiTuongAPI2.setTestGanDoiTuongAPI();
    }
}
