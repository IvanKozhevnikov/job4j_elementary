package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        Item[] expected = null;
        assertThat(tracker.findById(item.getId()), is(expected));
    }

    @Test
    public void whenFindByIdItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Search for a Item by id ====" + System.lineSeparator() +
                        "1. === Exit ====" + System.lineSeparator() +
                        "Found item: Item{id=1, name='Item name'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === Search for a Item by id ====" + System.lineSeparator() +
                        "1. === Exit ====" + System.lineSeparator() +
                        "The application is finished" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByNameItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        Item[] findItem = tracker.findByName("Item name");
        String expectedArray = String.valueOf(findItem[0]);
        for (int i = 1; i < findItem.length; i++) {
            expectedArray = expectedArray + System.lineSeparator() + findItem[i];
        }
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getName()), "1"}
        );
        UserAction[] actions = {
                new FindByNameAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Search for a Item by name ====" + System.lineSeparator() +
                        "1. === Exit ====" + System.lineSeparator() +
                        expectedArray + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === Search for a Item by name ====" + System.lineSeparator() +
                        "1. === Exit ====" + System.lineSeparator() +
                        "The application is finished" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAllItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new PrintAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Printing a list of Item ====" + System.lineSeparator() +
                        "1. === Exit ====" + System.lineSeparator() +
                        "The entire list of items" + System.lineSeparator() +
                        "Item{id=1, name='Item name'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === Printing a list of Item ====" + System.lineSeparator() +
                        "1. === Exit ====" + System.lineSeparator() +
                        "The application is finished" + System.lineSeparator()
        ));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Exit ====" + System.lineSeparator() +
                        "The application is finished" + System.lineSeparator()
        ));
    }
}