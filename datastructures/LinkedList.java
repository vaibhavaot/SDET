package SDET.datastructures;

/**
 * 
 * @author vaibhavmhatre
 * Q. How to reverse a single Linked list?
 * 
 */

public class LinkedList {
	
	Node head;
	
	Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null) {
			next = curr.nextNodeRef;//step1
			curr.nextNodeRef =prev; //step2
			prev = curr;//step3
			curr = next;//step4
		}
		head =prev;
		return head;
	}
	void addNode(Node newNode) {
		if(head == null) {
			head =newNode;
			return;
		}
		Node temp =head;
		while(temp.nextNodeRef != null) {
			temp = temp.nextNodeRef;
		}
		temp.nextNodeRef =newNode;
	}
	void traverseAndPrint(Node head) {
		System.out.println("Element in the LinkedList:");
		while(head !=null) {
			System.out.println(head.value);
			head = head.nextNodeRef;
		}
	}

	public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.addNode(new Node(10));
	list.addNode(new Node(20));
	list.addNode(new Node(30));
	list.addNode(new Node(40));
	list.addNode(new Node(50));
	
	list.traverseAndPrint(list.head);
	list.traverseAndPrint(list.reverse(list.head));
	}

}
