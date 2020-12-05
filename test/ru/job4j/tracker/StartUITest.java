package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answer = {"Test"};
        Input input = new StubInput(answer);
        Tracker tracker = new Tracker();
        StartUI.createNewItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Test");
        assertThat(created.getName(), is(expected.getName()));
    }
}
