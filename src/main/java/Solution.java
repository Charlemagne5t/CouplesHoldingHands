import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minSwapsCouples(int[] row) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = row.length;
        for (int i = 0; i < n; i++) {
            map.put(row[i], i);
        }

        int swaps = 0;
        for (int i = 0; i < n - 1; i += 2) {
            int min = Math.min(row[i], row[i + 1]);
            int max = Math.max(row[i], row[i + 1]);
            if (max - min == 1 && max % 2 == 1) {
                continue;
            }
            if (row[i] % 2 == 1) {
                int index = map.get(row[i] - 1);
                row[index] = row[i + 1];
                map.put(row[index], index);

            } else {
                int index = map.get(row[i] + 1);
                row[index] = row[i + 1];
                map.put(row[index], index);
            }
            swaps++;

        }
        return swaps;
    }
}
