import dependency.*;

import java.util.*;

import static javax.swing.Spring.height;

public class Main {
    public static void main(String[] args) {
     ListNode node = LinkedListInput.TakeInput();
     ListNode temp = node;
     temp = reverseList(temp);
     while (node!=null){
         System.out.println(node.val);
         node = node.next;
     }
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null)return head;
        ListNode node = reverseList(head.next);
        ListNode tail = null;
        if (node!=null){
            node.next = head;
            head.next = null;
            tail = head;
        }
        return head;

    }

}