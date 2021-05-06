# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
    carry = 0
    start = ListNode()
    last = start
    
    if(l1.val == 0 and l2.val == 0 and l1.next == None and l2.next == None):
        return ListNode(0)
    
    while True:
        if (l1 == None and l2 == None):
            if (carry == 1):
                last.next = ListNode(1)
            return start.next
        
        if l1 == None:
            a = 0
        else:
            a = l1.val
            l1 = l1.next
            
        if l2 == None:
            b = 0
        else:
            b = l2.val
            l2 = l2.next
            
        value = a + b + carry
        
        if value > 9:
            carry = 1
            value = value % 10
        else:
            carry = 0
        
        current = ListNode(value)
        last.next = current
        last = current
        

            
            
            
            
                
            
            