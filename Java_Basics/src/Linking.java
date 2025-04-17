
public class Linking {
	public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        printList(head);
        
        head = reverseList(head);

        System.out.print("\nReversed Linked List:");
        printList(head);
    }

	private static Node reverseList(Node head) {
		Node curr = head;
		Node prev = null;
		Node next;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private static void printList(Node node) {
		while(node!=null)
		{
			System.out.println(node.data+" ");
			node = node.next;
	}
}
}
