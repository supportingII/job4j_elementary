package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a, b, c, x, expected, rsl;
        a = 10; b = 0; c = 0; x = 2;
        expected = 40;
        rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenNotZero() {
        int a, b, c, x, expected, rsl;
        a = 1; b = 1; c = 1; x = 1;
        expected = 3;
        rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenAZero() {
        int a, b, c, x, expected, rsl;
        a = 0; b = 1; c = 1; x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCZero() {
        int a, b, c, x, expected, rsl;
        a = 1; b = 1; c = 0; x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenXZero() {
        int a, b, c, x, expected, rsl;
        a = 1; b = 1; c = 1; x = 0;
        expected = 1;
        rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }
}