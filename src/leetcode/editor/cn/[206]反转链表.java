import leetcode.editor.cn.model.ListNode;


//leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public ListNode reverseList(ListNode head) {
        //try use recursion
        return reverseAndGetHead(head);
    }

    public ListNode reverseAndGetHead(ListNode head){
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode nextHead = reverseAndGetHead(head.next);
        head.next.next=head;
        head.next=null;
        return nextHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
