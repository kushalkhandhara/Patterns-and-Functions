public class LinkedList1 
{
    Node head; // Reference to the first node of the list
    private int size;

    LinkedList1(){
        this.size = 0;
    }

    class Node
    {
        String data; // Data stored in the node
        Node next;   // Reference to the next node

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add at the first position
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        newNode.next = head; // Point the new node to the current head
        head = newNode;      // Update head to the new node
    }

    // Add at the last position
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode; // If the list is empty, the new node is the head
            return;
        }
        Node currNode = head;
        while (currNode.next != null)
        {
            currNode = currNode.next; // Traverse to the end of the list
        }
        currNode.next = newNode; // Link the last node to the new node
    }

    // Print the list
    public void printList()
    {
        if (head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null)
        {
            System.out.print(currNode.data + " => ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // Delete First 
    public void deleteFirst() 
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last
    public void deleteLast() 
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        size--;
        if(head.next==null)
        {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void  getSize()
    {
       System.out.println("Size : " + size);
    }

    public static void main(String[] args)
    {
        LinkedList1 list = new LinkedList1();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addLast("d");
        list.deleteFirst();
        list.deleteLast();
        list.addFirst("c");
        list.addLast("d");
        list.printList();
        list.getSize();
    }
}
