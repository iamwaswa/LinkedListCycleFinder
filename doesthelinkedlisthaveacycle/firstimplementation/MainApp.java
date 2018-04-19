package doesthelinkedlisthaveacycle.firstimplementation;

import java.util.ArrayList;
import java.util.List;

/**
 * The MainApp class describes the class
 * with the main method of the program
 * Time complexity: O(N)
 * Space complexity: O(N)
 * @author Waswa Olunga
 */

public class MainApp {

	public static void main(String[] args) {

		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode second = head.setNext(2);
		LinkedListNode third = second.setNext(3);
		LinkedListNode fourth = third.setNext(4);
		LinkedListNode fifth = fourth.setNext(second);
		/*LinkedListNode sixth = fifth.setNext(5);
		LinkedListNode seventh = sixth.setNext(6);*/


		System.out.println(containsCycle(head));

	}

	private static boolean containsCycle(LinkedListNode node){

		if (node == null || node.getNext() == null){
			return false;
		}

		List<LinkedListNode> visitedNodes = new ArrayList<>();
		LinkedListNode currentNode = node;

		do {

			visitedNodes.add(currentNode);
			currentNode = currentNode.getNext();

			if (visitedNodes.contains(currentNode)){
				return true;
			}

		} while (currentNode.getNext() != null);

		return false;
	}

}