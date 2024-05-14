package org.example;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ArrayListTest {
    private ArrayList<String> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
    }

    @Test
    public void testAdd() {
        list.add("item");
        assertTrue(list.contains("item"));
    }

    @Test
    public void testRemove() {
        list.add("item");
        list.remove("item");
        assertTrue(list.isEmpty());
    }
}
