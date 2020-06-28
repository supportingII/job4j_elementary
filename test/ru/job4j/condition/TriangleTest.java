package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(1.0, 2.0, 1.0);
        assertThat(result, is(false));
    }
}