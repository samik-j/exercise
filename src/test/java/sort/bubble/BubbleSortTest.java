package sort.bubble;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @Test
    public void shouldSortWhenOrderIsReversed() {
        // given
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);

        // when
        BubbleSort.sort(list);

        // then
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(result, list);
    }

    @Test
    public void shouldSortWhenOrderIsRandom() {
        // given
        List<Integer> list = Arrays.asList(3, 2, 4, 1, 5);

        // when
        BubbleSort.sort(list);

        // then
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(result, list);
    }
}