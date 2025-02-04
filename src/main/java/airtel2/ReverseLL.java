package airtel2;

public class ReverseLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original list:");
        printListt(head);

        // Reversing the linked list
        reversee(head);

        System.out.println("Reversed list:");
        printListt(head);

    }

    private static void reversee(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            // Save next node
            next = current.next;

            // Reverse the current node's pointer
            current.next = prev;

            // Move the prev and current pointers one step forward
            prev = current;
            current = next;
        }

        // After the loop, prev will be the new head
        head = prev;
    }

    private static void printListt(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " - > ");
            curr = curr.next;
        }
    }
}
