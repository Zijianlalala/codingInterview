package chapter2;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 * @author wuzijian
 *
 */
public class T6 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<>();
		print(result,listNode);
		return result;
    }
	private void print(ArrayList<Integer> result, ListNode node) {
		if(node != null) {
			if(node.next!=null) {
				print(result,node.next);
			}
			result.add(node.val);
		}
	}
	public static void main(String[] args) {
		T6 t = new T6();
		ListNode root = new ListNode(0);
		ListNode p = root;
		for(int i = 1; i < 5; i++) {
			ListNode s = new ListNode(i);
			p.next = s;
			p = s;
		}
		System.out.println(t.printListFromTailToHead(root));
	}
}
class ListNode {
	int val;
	ListNode next = null;
	ListNode(int val) {
		this.val = val;
	}
}
