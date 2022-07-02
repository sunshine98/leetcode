package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        int a=0;
        int b=0;
        int r=1;
        for (int i = 0; i <= n; i++) {
            a=b;
            b=r;
            r=a+b;
        }
        return r;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
