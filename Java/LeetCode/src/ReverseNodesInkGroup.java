

public class ReverseNodesInkGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static ListNode reverseKGroup(ListNode head, int k) {
    	ListNode tempHead = new ListNode(0, head);
        ListNode current = tempHead;
        
        BIG_LOOP: while(current.next != null) {
        	{
            	ListNode checker = current;
    	        for(int i=0; i<k; i++) {
    	        	if(checker.next == null) {
    	        		break BIG_LOOP;
    	        	}
    	        	checker = checker.next;
    	        }
            }
        	ListNode p1 = current;
    		ListNode p2 = p1.next;
    		
        	for(int i=0; i<k; i++) {
        		ListNode temp1 = p1;
        		ListNode temp2 = p2;
        		
        		p1 = p2;
        		p2 = p2.next;
        		
        		temp2.next = temp1;
        	}
        	
        	ListNode temp = current;
        	current = current.next;
        	temp.next = p1; 
        	current.next = p2;
        }
        

        return tempHead.next;
    }
    
    public static class ListNode {
    	     int val;
    	     ListNode next;
    	     ListNode() {}
    	     ListNode(int val) { this.val = val; }
    	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    	 }

}
