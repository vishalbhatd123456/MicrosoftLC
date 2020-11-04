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
    public boolean isPalindrome(ListNode head) {
        List<Integer> al = new ArrayList<>();
        //convert the linked list into array list
        ListNode currNode = head;
        while(currNode!=null){
            al.add(currNode.val);
            currNode = currNode.next;
        }
        
        //two pointer technique to check in they are palindrome
        int low = 0;
        int high = al.size()-1;
        while(low < high){
            if(!al.get(low).equals(al.get(high))){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
