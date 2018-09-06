package ru.job4j.turn;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {5, 3, 6, 7, 4, 1, 6, 7, 8};
        int[] result = turner.turn(input);
        int[] expect = new int[] {8, 7, 6, 1, 4, 7, 6, 3, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {3, 6, 7, 4, 1, 6, 7, 8};
        int[] result = turner.turn(input);
        int[] expect = new int[] {8, 7, 6, 1, 4, 7, 6, 3};
        assertThat(result, is(expect));
    }
}
