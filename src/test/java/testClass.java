import javax.naming.Context;
import java.util.HashMap;
import java.util.Map;

public class testClass {

    private Map<String,Object> stringObjectMap;

    public testClass(){
         stringObjectMap = new HashMap<>();
    }

    public void setContext(Context key,Object v){
        stringObjectMap.put(key.toString(),v);
    }

    public Object getContext(Context key){
        return stringObjectMap.get(key.toString());
    }
}
