package sort.bubble;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    static void sort(List<Integer> list) {
        int n = list.size();

        do {
            for (int i = 0; i < n - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    Collections.swap(list, i, i + 1);
                }
            }
            n = n - 1;
        } while (n > 1);
    }
}
