class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode temp = head.next;
        while(temp != null) {
            if(prev.val == temp.val) {
                temp = temp.next;
            } else {
                prev.next = temp;
                prev = temp;
                temp = temp.next;
            }
        }
        prev.next = temp;
        prev = temp;
        return head;
    }
}