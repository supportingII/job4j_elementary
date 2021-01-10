package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenException() {
        Fact.calc(-1);
    }

    @Test
    public void whenFact5Then120() {
        int rsl = Fact.calc(5);
        assertThat(rsl, is(120));
    }
}
