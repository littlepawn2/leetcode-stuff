
public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int listLength = 0;
        ListNode next = head;
        ListNode last = head;
        
        while(next != null) {
        	listLength++;
        	next = next.next;
        }
        
        listLength -= n;
        
        if(listLength == 0) {
        	head = head.next;
        	return head;
        }
        
        for(int i=1; i<listLength; i++) {
        	last = last.next;
        }
        
        last.next = last.next.next;
        
        return head;
    }
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
