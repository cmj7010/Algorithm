public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0) return head;
        if(head.next == null) return head = null;
        int i = 0;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1 != null){
            if(i++ > n){
                p2 = p2.next;
            }
            p1 = p1.next;
        }
        if(p2 == head && i == n ){
            head = head.next;
        }
        else {
            p2.next = p2.next.next;
        }
        return head;
    }
}
