package t5.collections.multiMap;

/**
 * Created by X501A on 22.07.2017.
 */
public class MainMultiMap {
    public static void main(String[] args) {
        MultiMapImpl<String,Integer> multiMap = new MultiMapImpl<>();

        multiMap.put("Banana",3);
        multiMap.put("Cherry",5);
        multiMap.put("Apple",4);
        multiMap.put("Banana",8);
        multiMap.put("Banana",6);

        System.out.println(multiMap.toString());
    }
}
