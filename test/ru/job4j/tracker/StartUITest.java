package ru.job4j.tracker;

import org.hamcrest.core.IsNull;
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

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New item test");
        tracker.add(item);
        String[] answer = {
                String.valueOf(item.getId()),
                "Replace item"
        };
        StartUI.replaceItem(new StubInput(answer), tracker);
        Item replace = tracker.findById(item.getId());
        assertThat(replace.getName(), is("Replace item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Creat item");
        tracker.add(item);
        String[] answer = {
                String.valueOf(item.getId()),
                "Creat item"
        };
        StartUI.deleteItem(new StubInput(answer), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced, is(IsNull.nullValue()));

    }
}
