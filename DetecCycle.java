import java.util.HashSet;
import java.util.Set;

public class DetecCycle {
    public static ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        Set<ListNode> hashSeen = new HashSet<>();
        ListNode curr = head;
        while(curr.next!=null){
            if(hashSeen.contains(curr)){
                return curr;
            }
            hashSeen.add(curr);
            curr = curr.next;
        }
        return null;
    }
//To understand this solution, you just need to ask yourself these question.
//Assume the distance from head to the start of the loop is x1
//the distance from the start of the loop to the point fast and slow meet is x2
//the distance from the point fast and slow meet to the start of the loop is x3
//What is the distance fast moved? What is the distance slow moved? And their relationship?
//
// 1    x1 + x2 + x3 + x2
// 2    x1 + x2
// 3    x1 + x2 + x3 + x2 = 2 (x1 + x2)
// 4    Thus x1 = x3
//
//Finally got the idea.
    public static ListNode detectCycle2(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode p_slow = head;
        ListNode p_fast = head;
        while(p_fast != null && p_fast.next != null){
            p_fast = p_fast.next.next;
            p_slow = p_slow.next;
            if(p_fast == p_slow){
                p_fast = head;
                while(p_fast != p_slow){
                    p_fast = p_fast.next;
                    p_slow = p_slow.next;
                }
                return p_fast;
            }
        }
        return null;
    }

}
