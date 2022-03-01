package easy.mergeTwwSortedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    @Test
    void test1() {
        //given
        MergeTwoSortedLists.ListNode list1 = new MergeTwoSortedLists.ListNode(1);
        list1.next = new MergeTwoSortedLists.ListNode(2);
        MergeTwoSortedLists.ListNode temp = list1.next;
        temp.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(1);
        list2.next = new MergeTwoSortedLists.ListNode(3);
        temp = list2.next;
        temp.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists test = new MergeTwoSortedLists();

        //when
        MergeTwoSortedLists.ListNode result = test.mergeTwoLists(list1,list2);
        //then
        assertEquals(result.val, 4);
    }

}