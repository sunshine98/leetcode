import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            int aHeight = a[0];
            int bHeight = b[0];
            int diff = aHeight - bHeight;
            if (diff != 0) {
                return -diff;
            } else {
                int aFactor = a[1];
                int bFactor = b[1];
                return aFactor - bFactor;
            }
        });
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] person : people) {
            list.add(person[1], person);
        }
        return list.toArray(new int[people.length][2]);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
