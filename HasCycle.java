import com.sun.deploy.uitoolkit.ui.ConsoleController;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class HasCycle {

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> hashSeen = new HashSet<>();
        if(head.next == null) return false;
        while(head.next != null){
            if(hashSeen.contains(head)){
                return true;
            }else{
                hashSeen.add(head);
                head = head.next;
            }
        }
        return false;
    }

    public static boolean hasCycle_rach(ListNode head){
        if(head== null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow.next !=null && fast.next!=null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow || fast == slow.next){
                return true;
            }
        }
        return false;
    }
    //Destroy the bridge after crossed the river.
    //Point all your guns at your head. If there is a loop,you will shoot yourself eventually.
    public static boolean hasCycle2(ListNode head) {
        ListNode p = head,pre = head;
        while(p != null && p.next != null){
            if (p.next == head) return true;
            p = p.next;
            pre.next = head;
            pre = p;
        }
        return false;
    }
}
