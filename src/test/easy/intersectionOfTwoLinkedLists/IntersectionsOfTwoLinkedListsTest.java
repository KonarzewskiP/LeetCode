package easy.intersectionOfTwoLinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IntersectionsOfTwoLinkedListsTest {

    @Test
    void test1() {
        //given
        IntersectionsOfTwoLinkedLists.ListNode listA1 = new IntersectionsOfTwoLinkedLists.ListNode(2);
        IntersectionsOfTwoLinkedLists.ListNode listA2 = new IntersectionsOfTwoLinkedLists.ListNode(2);
        IntersectionsOfTwoLinkedLists.ListNode listB1 = new IntersectionsOfTwoLinkedLists.ListNode(2);
        IntersectionsOfTwoLinkedLists.ListNode listB2 = new IntersectionsOfTwoLinkedLists.ListNode(2);
//        IntersectionsOfTwoLinkedLists.ListNode listB3 = new IntersectionsOfTwoLinkedLists.ListNode(1);
        IntersectionsOfTwoLinkedLists.ListNode listC1 = new IntersectionsOfTwoLinkedLists.ListNode(4);
        IntersectionsOfTwoLinkedLists.ListNode listC2 = new IntersectionsOfTwoLinkedLists.ListNode(5);
        IntersectionsOfTwoLinkedLists.ListNode listC3 = new IntersectionsOfTwoLinkedLists.ListNode(4);
        listA1.next = listA2;
        listA2.next = listC1;
        listB1.next = listB2;
        listB2.next = listC1;
//        listB3.next = listC1;
        listC1.next = listC2;
        listC2.next = listC3;

        IntersectionsOfTwoLinkedLists test = new IntersectionsOfTwoLinkedLists();

        //when
        IntersectionsOfTwoLinkedLists.ListNode result = test.getIntersectionNode(listA1, listB1);
        //then
        assertEquals(result, listC1);
    }

    @Test
    void test2() {
        //given
        IntersectionsOfTwoLinkedLists.ListNode listA1 = new IntersectionsOfTwoLinkedLists.ListNode(4);
        IntersectionsOfTwoLinkedLists.ListNode listA2 = new IntersectionsOfTwoLinkedLists.ListNode(1);

        IntersectionsOfTwoLinkedLists.ListNode listB1 = new IntersectionsOfTwoLinkedLists.ListNode(5);
        IntersectionsOfTwoLinkedLists.ListNode listB2 = new IntersectionsOfTwoLinkedLists.ListNode(6);
        IntersectionsOfTwoLinkedLists.ListNode listB3 = new IntersectionsOfTwoLinkedLists.ListNode(1);

        IntersectionsOfTwoLinkedLists.ListNode listC1 = new IntersectionsOfTwoLinkedLists.ListNode(8);
        IntersectionsOfTwoLinkedLists.ListNode listC2 = new IntersectionsOfTwoLinkedLists.ListNode(4);
        IntersectionsOfTwoLinkedLists.ListNode listC3 = new IntersectionsOfTwoLinkedLists.ListNode(5);

        listA1.next = listA2;
        listA2.next = listC1;
        listB1.next = listB2;
        listB2.next = listB3;
        listB3.next = listC1;
        listC1.next = listC2;
        listC2.next = listC3;

        IntersectionsOfTwoLinkedLists test = new IntersectionsOfTwoLinkedLists();

        //when
        IntersectionsOfTwoLinkedLists.ListNode result = test.getIntersectionNode(listA1, listB1);
        //then
        assertEquals(result, listC1);
    }

}