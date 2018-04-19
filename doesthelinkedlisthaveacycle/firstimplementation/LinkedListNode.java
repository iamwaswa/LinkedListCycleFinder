package doesthelinkedlisthaveacycle.firstimplementation;

/**
 * The LinkedListNode class describes
 * a node in a LinkedList
 * @author Waswa Olunga
 */

public class LinkedListNode {

	private int value;
	private LinkedListNode next;


	public LinkedListNode(int value) {
		this.value = value;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public LinkedListNode setNext(LinkedListNode next) {
		this.next = next;
		return this.next;
	}

	public LinkedListNode setNext(int nextValue) {
		this.next = new LinkedListNode(nextValue);
		return this.next;
	}

}