package class02;
//time O(n)
//space O(1) 
// iterative way to solve reverse linkedlist 
public class ReverseLinekedList {
	
	ListNode head;
	
	private class ListNode{
		int value;
		ListNode next;
		
		public ListNode(int value) {
			this.value = value;
			this.next = null;
		}
	}
	
	public ListNode reverse(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		// if 判断的是list是0个node或者list只有一个node的情况
		ListNode cur = head;
		ListNode next = head;
		ListNode prev = null;
		
		while(cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		
		return prev;
	}
	
	
}
