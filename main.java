import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        int i=0;
        ListNode l1 = new ListNode(i);
        ListNode p = l1;
        while(i<1){
            i++;
            ListNode node = new ListNode(i);
            p.next = node;
            p = node;
        }

//        i = 1;
//        ListNode l2 = new ListNode(i);
//        p= l2;
//        while(i<9){
//            i+=2;
//            ListNode node = new ListNode(i);
//            p.next = node;
//            p = node;
//        }

        //判断链表是否有环

        int pos =-1;
        ListNode curr = RemoveNthNode.removeNthFromEnd(l1,1);
//        if(curr == null) {
//            System.out.println("have not cycle , pos = "+ pos);
//        }
//        else{
//            pos =0;
//            while(curr !=cunt){
//                pos++;
//                cunt = cunt.next;
//            }
//            System.out.println("have cycle, pos="+pos);
//        }
    }

}
