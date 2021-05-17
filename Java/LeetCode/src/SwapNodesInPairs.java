
public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static ListNode swapPairs(ListNode head) {
    	ListNode tempHead = new ListNode(0, head);
        ListNode current = tempHead;
        if(current.next == null || current.next.next == null) {
        	return head;
        } else {
        	head = current.next.next;
        }
        
        while(current.next != null && current.next.next != null) {
        	ListNode temp1 = current.next;
        	ListNode temp2 = temp1.next;
        	
        	temp1.next = temp2.next;
        	temp2.next = temp1;
        	current.next = temp2;
        	
        	current = temp1;
        }
        return head;
    }
    
    public static class ListNode {
    	     int val;
    	     ListNode next;
    	     ListNode() {}
    	     ListNode(int val) { this.val = val; }
    	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    	 }
	

}
