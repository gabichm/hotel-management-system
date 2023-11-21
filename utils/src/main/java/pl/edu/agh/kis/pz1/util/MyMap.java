package pl.edu.agh.kis.pz1.util;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K,V> implements Map<K,V> {
    private final List<K> keys;
    private final List<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

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

    @Override
    public V get(K key) {
        if(keys.contains(key)) {
            return values.get(keys.indexOf(key));
        }
        return null;
    }

    @Override
    public List keys() {
        return keys;
    }

    @Override
    public boolean contains(K key) {
        for(K key_element: keys) {
            if (key_element.equals(key)) {return true;}
        }
        return false;
    }
    public int size() {
        return keys.size();    }
}
