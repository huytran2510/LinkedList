public class ReverseSinglyLinkedList {
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }


    public static void printf(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.getVal() + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Creating a sample linked list 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printf(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printf(head);
    }

}
