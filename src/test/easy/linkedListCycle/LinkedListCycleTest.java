package easy.linkedListCycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleTest {

    @Test
    void test1() {
        //given
        LinkedListCycle.ListNode list1 = new LinkedListCycle.ListNode(3);
        LinkedListCycle.ListNode list2 = new LinkedListCycle.ListNode(2);
        LinkedListCycle.ListNode list3 = new LinkedListCycle.ListNode(0);
        LinkedListCycle.ListNode list4 = new LinkedListCycle.ListNode(-4);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list2;

        LinkedListCycle test = new LinkedListCycle();

        //when
        boolean result = test.hasCycle(list1);
        //then
        assertTrue(result);
    }


}