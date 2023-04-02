package dependency;

import java.util.Scanner;

public class LinkedListInput {
    public static ListNode TakeInput() {
        Scanner scanner = new Scanner(System.in);
        ListNode head = null, tail = null;
        int x = scanner.nextInt();

        while (x >= 0) {
            ListNode node = new ListNode(x);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }


            x = scanner.nextInt();
        }
        return head;
    }
}
