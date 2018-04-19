package doesthelinkedlisthaveacycle.secondimplementation;

import java.util.ArrayList;
import java.util.List;

/**
 * The MainApp class describes the class
 * with the main method of the program
 * Time complexity: O(N)
 * Space complexity: O(1)
 * @author Waswa Olunga
 */

public class MainApp {

	public static void main(String[] args) {

		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode second = head.setNext(2);
		LinkedListNode third = second.setNext(3);
		LinkedListNode fourth = third.setNext(4);
		LinkedListNode fifth = fourth.setNext(3);
		LinkedListNode sixth = fifth.setNext(5);
		LinkedListNode seventh = sixth.setNext(third);


		System.out.println(containsCycle(head));

	}

	private static boolean containsCycle(LinkedListNode node){

		if (node == null || node.getNext() == null){
			return false;
		}

		LinkedListNode currentNode = node;

		do {

			currentNode.setVisitedAsTrue();
			currentNode = currentNode.getNext();

			if (currentNode.isVisited()){
				return true;
			}

		} while (currentNode.getNext() != null);

		return false;
	}

}