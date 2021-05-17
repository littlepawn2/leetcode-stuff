
public class MergeTwoSortedLists {

	public static void main(String[] args) {

	}
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode next1 = l2;
        if(l1 == null) {
    		return l2;
    	}
        while(next1 != null) {
        	ListNode next2 = l1;
        	ListNode last = null;
        	while(next2 != null) {
        		if(next1.val <= next2.val) {
        			ListNode toinsert = next1;
        			next1 = next1.next;
        			
        			toinsert.next = next2;
        			if(last == null) {
        				l1 = toinsert;
        			} else {
        				last.next = toinsert;
        			}
        			break;
        		}
        		last = next2;
        		next2 = next2.next;
        		if(next2 == null) {
        			last.next = next1;
        			next1 = next1.next;
        			last.next.next = null;
        		}
        	}
        }
        return l1;
    }
    /*
	public ListNode merge(ListNode l1, ListNode l2) { //a better merge algorithm than #21
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
	*/
    
    public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

}
