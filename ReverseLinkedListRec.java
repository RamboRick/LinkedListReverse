package class02;
//time 
//space 
public class ReverseLinkedListRec {
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
		ListNode next = head.next;
		
		ListNode newHead = reverse(head.next);
		head.next = null;
		next.next = cur;
		return newHead;
	}
	
	
}

