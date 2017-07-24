package t5.collections.multiMap;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created by X501A on 22.07.2017.
 */
public class MultiMapImpl<K,V> extends HashMap<K, V> implements MultiMap<K,V>{
    private HashMap<K,List<V>> multiMap = new HashMap<K, List<V>>();


    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)){
            List<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key,values);
        }else{
            List<V> values = new ArrayList<V>();
            values.add(value);
            multiMap.put(key,values);
        }
        return value;
    }

    @Override
    public int countValues(K key) {
        return 0;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        return null;
    }

    @Override
    public String toString() {
        String string = "";
        for ( K key : multiMap.keySet()){
            string = string + key + " = [";
            for(V value : multiMap.get(key)){
                string = string + value + ",";


            }
            string = string + "]";
        }
        return string;
    }
}
