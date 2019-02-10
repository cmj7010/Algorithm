public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode list = new ListNode(0);
        ListNode p = list;
        while(l1 != null && l2 != null){
            ListNode node = new ListNode(0);
            if(l1.val > l2.val){
                node.val = l2.val;
                l2 = l2.next;
            }
            else{
                node.val = l1.val;
                l1 = l1.next;
            }
            p.next = node;
            p = p.next;
        }
        if(l1 == null) p.next = l2;
        if(l2 == null) p.next = l1;
        return list.next;
    }

    public ListNode mergeTwoLists_3(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2 == null) {
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    cur.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    cur.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
            cur = cur.next;
        }
        return res.next;
    }

    //recursion mod
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
