package com.study4j.algotithms.middle;

public class AddTwoNumbers {
	
	public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(8);
        ListNode l6 = new ListNode(6);

        l4.next = l5;
        l5.next = l6;

        ListNode a = addTwoNumbers(l1, l4);
        System.out.println(a);
	}

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    	int carry = 0;
    	
    	ListNode first;
    	ListNode l = new ListNode(0);
    	first = l;
    	while(l1 != null || l2 != null) {
    		
    		int x = l1 == null ? 0 : l1.val;
    		int y = l2 == null ? 0 : l2.val;
    		
    		int sum = x + y + carry;
    		
    		ListNode node = new ListNode(sum % 10);
    		l.next= node;
    		l = node;
    		carry = sum/10;
    		
    		l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
    		
    	}
    	if(carry != 0) {
    		ListNode node = new ListNode(carry);
    		l.next = node;
    	}
    	
    	return first.next;
    	
    }
    
    public static class ListNode {
    	
    	int val;
    	
    	ListNode next;
    	
    	ListNode(int x) {
    		val = x;
    	}
    	
    }
	
}
