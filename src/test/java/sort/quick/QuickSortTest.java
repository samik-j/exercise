package sort.quick;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickSortTest {

    @Test
    public void shouldSort() {
        // given
        List<Integer> list = Arrays.asList(5, 2, 3, 4, 8, 6, 1);

        // when
        QuickSort.sort(list);

        // then
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
        assertEquals(result, list);
    }

    @Test
    public void shouldSortIfHasSameValues() {
        // given
        List<Integer> list = Arrays.asList(5, 2, 4, 3, 4, 8, 6, 1, 4);

        // when
        QuickSort.sort(list);

        // then
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6, 8);
        assertEquals(result, list);
    }

}