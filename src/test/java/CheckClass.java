import org.openqa.selenium.WebElement;

import java.util.*;

public class CheckClass {

    static int count = 0;
    static Map<Object,Integer> saveMap = new HashMap<>();

    Set<Object> mapSet = new HashSet<>();

    static Set<Integer> listFriendNew = new LinkedHashSet<>();


    public static void main(String[] args) {

        test2();

    }



    public static void tinhToan(int numberFriend,List<String> comment,List<String>remove){
        for (String friend:getListFriend()) {
            saveMap.put(friend,getRandom(3));
        }
        for (String friendRemove:remove) {
            if(saveMap.containsKey(friendRemove)){
                saveMap.remove(friendRemove);
            }
        }

        System.out.println(saveMap + " tren");
        for (Integer set:saveMap.values()) {
            listFriendNew.add(set);

        }
        System.out.println(listFriendNew);



        while (count< listFriendNew.toArray().length){
            Integer friend = (Integer) listFriendNew.toArray()[count];
//            System.out.println(friend);
            while (count< numberFriend){
                int random = getRandom(comment.size());
//                System.out.println("commment random "+ comment.get(random));
                break;
            }
            count++;
            tinhToan(numberFriend,comment,remove);
        }


    }



    public static List<String> getListFriend(){
        List<String> ok = new ArrayList<>();
        ok.add("dang quynh hoa");
        ok.add("okbede");
        ok.add("vu van hai");
        ok.add("tram anh");
        ok.add("thu thuy");
        ok.add("dang tran dong");
        ok.add("ho van hoa");
        ok.add("tran thanh");
        ok.add("tuan hung");
        ok.add("van thanh");
        ok.add("bang kieu");
        ok.add("den vau");
        return ok;

    }

    public static List<String> listComment(){
        List<String> comment = new ArrayList<>();
        comment.add("comment 1");
        comment.add("comment 2");
        comment.add("comment 3");
        comment.add("comment 4");
        comment.add("comment 5");
        return comment;

    }



    public static List<String> ListRemove(){
        List<String> get = new ArrayList<>();
        get.add("tram anh");
        get.add("thu thuy");
        get.add("vu van hai");
        get.add("okbede");
        get.add("dang quynh hoa");
        return get;
    }

    public static int getRandom(int lessThan){
        Random random = new Random();
        return  random.nextInt(lessThan);
    }


    public void test(){
        Set<String>strings = new LinkedHashSet<>();
        strings.add("ok");
        strings.add("be");
        strings.add("de");
        strings.add("123");
        Object[] c = strings.toArray();
        System.out.println(c[1]);
    }

    public static void test2(){
        Map<String,String> get = new HashMap<>();
        get.put("ok","1");
        get.put("ok1","2");
        get.put("ok2","3");
        get.put("ok3","4");
        for (int i = 0; i < get.keySet().size(); i++) {
            System.out.println(get.entrySet());
        }
    }

}
