package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4To4To6To5Then6() {
        int result = Max.max(4, 4, 6, 5);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax4To2To9Then9() {
        int result = Max.max(4, 2, 9);
        assertThat(result, is(9));
    }
}