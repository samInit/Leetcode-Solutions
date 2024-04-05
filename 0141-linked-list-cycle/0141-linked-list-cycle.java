/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            visited.add(current);
            current = current.next;
            if (visited.contains(current)) {
                return true;
            }
        }
        return false;
    }
}