package org.example;
import org.example.GreetingUtil;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingUtilTest {

    @Test
    public void testGreetUser() {
        String name1 = "Петя";
        String name2 = "Вася";
        String name3 = "Димончик";

        String greeting1 = GreetingUtil.greetUser(name1);
        String greeting2 = GreetingUtil.greetUser(name2);
        String greeting3 = GreetingUtil.greetUser(name3);

        assertEquals("Здаров, Петёк!", greeting1);
        assertEquals("Здаров, Васёк!", greeting2);
        assertEquals("Привет, Димончик!", greeting3);
    }
}
