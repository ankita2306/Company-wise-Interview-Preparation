package airtel;

public class MergeSortedLinkedLists {
    public static void main(String[] args) {
        // Creating first sorted linked list: 1 -> 3 -> 5
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        // Creating second sorted linked list: 2 -> 4 -> 6
        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        // Merging the two lists
        MergeSortedLinkedLists obj = new MergeSortedLinkedLists();
        Node mergedList = obj.mergeSortedLists(list1, list2);

        // Printing the merged sorted list
        printList(mergedList);
    }

    private Node mergeSortedLists(Node list1, Node list2) {
        Node dummy = new Node(-1); // Dummy node to simplify merging
        Node current = dummy;     // Pointer to construct the merged list

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next; // Return head of the merged list
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
