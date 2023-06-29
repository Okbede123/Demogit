import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classthu2DemoGit {

    public static void main(String[] args) {
        demoFor();
//        System.out.println("test 29/05-34 lap");
//        System.out.println("29/05/ 34.1 lap");
//        System.out.println("29/05/ 34.2 lap");
//        System.out.println("29/05/ 34.3 lap");
    }
    public static void  demoFor(){
        String name = "test5";
        List<String> listDemo = Arrays.asList("test1","test2","test4","test5");

        for(int i = 0; i < listDemo.size();i++){
            if(name.equals(listDemo.get(i))){
                System.out.println(name + " bang voi "+ listDemo.get(i));
            }
            else
            {
                System.out.println("khong thang nao bang het");
            }
        }

    }
}
