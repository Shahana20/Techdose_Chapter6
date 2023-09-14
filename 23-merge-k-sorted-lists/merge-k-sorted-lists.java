/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue  <ListNode> heap = new PriorityQueue<>((o1,o2)->o1.val-o2.val);
        for(ListNode list : lists)
        {
            if(list == null)
            {
                continue;
            }
            heap.add(list);
        }
        ListNode sort = new ListNode(0);
        ListNode temp = sort;
        while(!heap.isEmpty())
        {
            ListNode curr = heap.poll();
            temp.next = curr;
            if(curr.next != null)
            {
                heap.add(curr.next);
            }
            temp = temp.next;
        }
        return sort.next;
    }
}