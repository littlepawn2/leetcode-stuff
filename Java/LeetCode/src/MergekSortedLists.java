
public class MergekSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode mergeKLists(ListNode[] lists) {
		ListNode ans = null;
		for(var list : lists) {
			ans = merge(ans, list); //change to this.merge when submitting
		}
		return ans.next;
    }
	
	public static ListNode merge(ListNode l1, ListNode l2) { //a better merge algorithm than #21 //remove static when submitting
		ListNode head = new ListNode();
		ListNode current = head;
		while(l1 != null || l2 != null) {
			ListNode temp;
			if(l1 == null) {
				temp = l2;
				l2 = l2.next;
			} else if(l2 == null) {
				temp = l1;
				l1 = l1.next;
			} else {	
				if(l1.val > l2.val) {
					temp = l2;
					l2 = l2.next;
				} else {
					temp = l1;
					l1 = l1.next;
				}
			}
			current.next = temp;
			current = temp;
		}
		return head.next;
	}
	
	
	
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

}
