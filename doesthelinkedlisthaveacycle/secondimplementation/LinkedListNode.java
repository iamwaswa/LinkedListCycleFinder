package doesthelinkedlisthaveacycle.secondimplementation;

/**
 * The LinkedListNode class describes
 * a node in a LinkedList
 * @author Waswa Olunga
 */

public class LinkedListNode {

	private int value;
	private LinkedListNode next;
	private boolean visited;


	public LinkedListNode(int value) {
		this.value = value;
		visited = false;
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

	public boolean isVisited() {
		return visited;
	}

	public void setVisitedAsTrue() {
		visited = true;
	}

}