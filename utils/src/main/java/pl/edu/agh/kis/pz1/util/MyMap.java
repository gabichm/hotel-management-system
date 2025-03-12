package pl.edu.agh.kis.pz1.util;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K,V> implements Map<K,V> {
    /**
     * List of map's key's
     */
    private final List<K> keys;
    /**
     * List of maps values
     */
    private final List<V> values;

    /**
     * constructr, initializes key, and values arrays
     */
    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    /**
     * adds element to the map
     * @param key key (not null)
     * @param value value under the key (not null)
     * @return true if element added, false if it just changes a key's value
     */
    @Override
    public boolean put(K key, V value) {
        if(keys.contains(key)) {
            values.set(keys.indexOf(key), value);
            return false;
        }
        keys.add(key);
        values.add(value);
        return true;
    }

    /**
     * Removing element from nap
     * @param key key to remove
     * @return true if success, false if function didn't find a key of that value
     */
    @Override
    public boolean remove(K key) {
        if(keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            values.remove(index);
            return true;
        }
        return false;
    }

    /**
     * find value hiding under the key
     * @param key key (not ull)
     * @return value under key
     */
    @Override
    public V get(K key) {
        if(keys.contains(key)) {
            return values.get(keys.indexOf(key));
        }
        return null;
    }

    /**
     * list all keys
     * @return list of keys
     */
    @Override
    public List keys() {
        return keys;
    }

    /**
     * Checks if map contains specific key
     * @param key value of key to check
     * @return true if it exists, false if it doesn't
     */
    @Override
    public boolean contains(K key) {
        for(K key_element: keys) {
            if (key_element.equals(key)) {return true;}
        }
        return false;
    }

    /**
     * Number of elements in the nap
     * @return number of elements
     */
    public int size() {
        return keys.size();    }
}
