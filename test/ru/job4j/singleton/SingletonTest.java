package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.singleton.four.TrackerSingleFour;
import ru.job4j.tracker.singleton.one.TrackerSingleOne;
import ru.job4j.tracker.singleton.three.TrackerSingleThree;
import ru.job4j.tracker.singleton.two.TrackerSingleTwo;

import static org.junit.Assert.assertSame;

public class SingletonTest {

    @Test
    public void whenEnum() {
        TrackerSingleOne result = TrackerSingleOne.getInstance();
        TrackerSingleOne expected = TrackerSingleOne.getInstance();
        assertSame(result, expected);
    }

    @Test
    public void whenStaticField() {
        TrackerSingleTwo result = TrackerSingleTwo.getInstance();
        TrackerSingleTwo expected = TrackerSingleTwo.getInstance();
        assertSame(result, expected);
    }

    @Test
    public void whenStaticFinalField() {
        TrackerSingleThree result = TrackerSingleThree.getInstance();
        TrackerSingleThree expected = TrackerSingleThree.getInstance();
        assertSame(result, expected);
    }

    @Test
    public void whenPrivateStaticFinalClass() {
        TrackerSingleFour result = TrackerSingleFour.getInstance();
        TrackerSingleFour expected = TrackerSingleFour.getInstance();
        assertSame(result, expected);
    }
}
