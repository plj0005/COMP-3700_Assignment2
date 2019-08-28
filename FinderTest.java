import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @Test
    void test1_findMax() {
        int[] array = null;
        assertNull(Finder.findMax(array));
    }

    @Test
    void test2_findMax() {
        int[] array = new int[] {};
        assertNull(Finder.findMax(array));
    }

    @Test
    void test3_findMax() {
        int[] array = new int[] {2, 3, 1, 7, 4, 5};
        assertEquals(Finder.findMax(array), 7);
    }

    @Test
    void test1_findMin() {
        int[] array = null;
        assertNull(Finder.findMin(array));
    }

    @Test
    void test2_findMin() {
        int[] array = new int[] {};
        assertNull(Finder.findMin(array));
    }

    @Test
    void test3_findMin() {
        int[] array = new int[] {2, 3, 1, 7, 4, 5};
        assertEquals(Finder.findMin(array), 1);
    }
}