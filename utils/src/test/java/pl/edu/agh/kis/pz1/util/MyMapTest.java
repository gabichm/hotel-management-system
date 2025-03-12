package pl.edu.agh.kis.pz1.util;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyMapTest extends TestCase {
    public List<Integer> key1 = Arrays.asList(1,2,3,4,5);
    public List<String> value1 = Arrays.asList("one", "two", "three", "four", "five");
    public List<Integer> key2 = Arrays.asList(34,46,23,6,3,2,7);
    public List<Integer> value2 = Arrays.asList(68,92,46,12,6,4,14);
    public MyMap<Integer,String> map1 = new MyMap<>();
    public MyMap<Integer,Integer> map2 = new MyMap<>();
    @Test
    public void testPutMethod() {
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");
        map1.put(4,"four");
        map1.put(5, "five");
        map2.put(34, 68);
        map2.put(46,92);
        map2.put(23,46);
        map2.put(6,12);
        map2.put(3,6);
        map2.put(2,4);
        map2.put(7,14);
        assertEquals(key1.size(), map1.size());
        assertEquals(value2.size(), map2.size());
    }

    @Test
    public void testRemove() {map1.put(1,"one");
        map1 = createMap1();
        map2 = createMap2();
        assertTrue(map1.remove(1));
        assertFalse(map1.remove(7));
        assertEquals(map1.size(), 4);
        assertTrue(map2.remove(2));
        assertFalse(map2.remove(68));
        assertTrue(map2.remove(23));
        assertFalse(map2.remove(17));
    }
    @Test
    public void testGet() {
        map1 = createMap1();
        map2 = createMap2();
        assertEquals(map1.get(2), "two");
        assertEquals(map1.get(5), "five");
        assertEquals(Optional.ofNullable(map2.get(34)), Optional.ofNullable(68));
        assertEquals(Optional.ofNullable(map2.get(2)), Optional.ofNullable(4));

    }
    @Test
    public void testKeys() {
        map1 = createMap1();
        map2 = createMap2();
        List<Integer> keys1 = map1.keys();
        List<Integer> keys2 = map2.keys();
        List<Integer> realKey1 = Arrays.asList( 2,3,4,5);
        List<Integer> realKey2 = Arrays.asList(34,46, 23, 6,3,2, 7);
        for(int i = 0; i < 4; ++i) {
            assertEquals(keys1.get(i), realKey1.get(i));
            assertEquals(keys2.get(i), realKey2.get(i));
        }
        assertEquals(keys2.get(4), realKey2.get(4));

    }

    @Test
    public void testContains() {
        Map map1 = createMap1();
        Map map2 = createMap2();
        for(int i = 2; i < 6; ++i) {
            assertTrue(map1.contains(i));
        }
        assertFalse(map1.contains(1));
        assertFalse(map1.contains(7));
        assertTrue(map2.contains(34));
        assertTrue(map2.contains(46));
        assertTrue(map2.contains(6));
        assertTrue(map2.contains(3));
        assertFalse(map2.contains(68));
        assertFalse(map2.contains(92));
    }
    @Test
    private MyMap createMap1() {
        map1.put(2,"two");
        map1.put(3,"three");
        map1.put(4,"four");
        map1.put(5, "five");
        return map1;
    }
    @Test
    private MyMap createMap2() {
        map2.put(34, 68);
        map2.put(46, 92);
        map2.put(23, 46);
        map2.put(6, 12);
        map2.put(3, 6);
        map2.put(2, 4);
        map2.put(7, 14);
        return map2;
    }
}