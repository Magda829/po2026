package agh.po.lab3;
import java.util.Map;
import java.util.HashMap;
import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void sleepIn() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.sleepIn(false, false));
        assertFalse(cb.sleepIn(true, false));
        assertTrue(cb.sleepIn(false, true));
    }

    @org.junit.Test
    public void diff21() {
        CodingBat cb = new CodingBat();
        assertEquals(2, cb.diff21(19));
        assertEquals(11, cb.diff21(10));
        assertEquals(0, cb.diff21(21));
    }

    @org.junit.Test
    public void countEvens() {
        CodingBat cb = new CodingBat();
        int[] wynik = {3};
        int[] num1 = {2,1,2,3,4};
        assertArrayEquals(wynik, cb.countEvens(num1));
        //assertArrayEquals({3}, cb.countEvens({2,2,0}));
        //assertArrayEquals(1, cb.countEvens({2}));
    }

    @org.junit.Test
    public void helloName() {
        CodingBat cb = new CodingBat();
        assertEquals("Hello X!", cb.helloName("X"));
        assertEquals("Hello Omega!", cb.helloName("Omega"));
        assertEquals("Hello Hello!", cb.helloName("Hello"));
    }

    @org.junit.Test
    public void testMapAB() {
        CodingBat cb = new CodingBat();
        assertEquals(Map.of("a", "Hi", "b", "There", "ab", "HiThere"), cb.mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))));
        assertEquals(Map.of("a", "Hi"), cb.mapAB(new HashMap<>(Map.of("a", "Hi"))));
        assertEquals(Map.of("b", "There"), cb.mapAB(new HashMap<>(Map.of("b", "There"))));
    }

    @org.junit.Test
    public void testWordLen() {
        CodingBat cb = new CodingBat();
        assertEquals(Map.of("a", 1, "bb", 2), cb.wordLen(new String[]{"a", "bb", "a", "bb"}));
        assertEquals(Map.of("this", 4, "and", 3, "that", 4), cb.wordLen(new String[]{"this", "and", "that", "and"}));
        assertEquals(Map.of("code", 4, "bug", 3), cb.wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}
