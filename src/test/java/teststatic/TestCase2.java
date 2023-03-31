package teststatic;

import java.util.ArrayList;
import java.util.List;

public class TestCase2 {

    public static void handleData(ArrayList<String> list, ArrayList<String>list2){
        int count = 0;
        int temp = list.size();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(list.size());
        arrayList.add(list2.size());
        for (int i = 0; i < arrayList.size(); i++) {
            if(temp< arrayList.get(i)){
               temp = arrayList.get(i);
            }
        }
        try {
            while (count<temp){
                try {
                    System.out.println(list.get(count));
                }catch (RuntimeException e){

                }
                System.out.println(list2.get(count));
                count++;
            }
        }catch (IndexOutOfBoundsException e){

        }

        int[] student = {10, 20,5};
        System.out.println(student[0] + student[student.length-1]);
    }

    public static void main(String[] args) {
        ArrayList<String>arrayList1 = new ArrayList<>();
        ArrayList<String>arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList1.add("4");
        arrayList1.add("5");
        arrayList1.add("6");
        arrayList1.add("7");
        handleData(arrayList,arrayList1);
    }
}
