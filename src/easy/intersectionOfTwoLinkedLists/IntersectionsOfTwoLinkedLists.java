package easy.intersectionOfTwoLinkedLists;

import java.util.HashSet;
import java.util.Set;

public class IntersectionsOfTwoLinkedLists {

    // 4, 1
    //  => 8, 4, 5
    // 5, 6, 1

    //4,1,8,4,5,5,6,1,8,4,5,null
    //5,6,1,8,4,5,4,1,8,4,5,null


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    public ListNode getIntersectionNodeOne(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();

        while (headA != null || headB != null) {
            if (nodes.contains(headA)) {
                return headA;
            }

            if (headA != null) {
                nodes.add(headA);
                headA = headA.next;
            }

            if (nodes.contains(headB)) {
                return headB;
            }

            if (headB != null) {
                nodes.add(headB);
                headB = headB.next;
            }
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
