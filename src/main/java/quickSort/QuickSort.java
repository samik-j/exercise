package quickSort;

import java.util.Collections;
import java.util.List;

public class QuickSort {

    static void sort(List<Integer> list) {
        sort(list, 0, list.size() - 1);
    }

    private static void sort(List<Integer> list, int l, int r) {
        if (l < r) {
            int splitIndex = partition(list, l, r);
            sort(list, l, splitIndex - 1);
            sort(list, splitIndex + 1, r);
        }
    }

    private static int partition(List<Integer> list, int l, int r) {
        int splitIndex = splitIndex(l, r);
        int splitValue = list.get(splitIndex);

        Collections.swap(list, splitIndex, r);

        int currentIndex = l;
        for (int i = l; i <= r - 1; i++) {
            if (list.get(i) < splitValue) {
                Collections.swap(list, i, currentIndex);
                currentIndex += 1;
            }
        }
        Collections.swap(list, currentIndex, r);

        return currentIndex;
    }

    private static int splitIndex(int l, int r) {
        return l + (r - l) / 2;
    }
}
