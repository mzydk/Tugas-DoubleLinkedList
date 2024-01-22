public class DoubleLinkedList {
    private Node head;
    private Node tail;

    // Constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method untuk menambahkan node di akhir linked list
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
    }

    // Method untuk membaca data node berikutnya
    public int readNext(int data) {
        Node currentNode = findNode(data);
        if (currentNode != null && currentNode.getNext() != null) {
            return currentNode.getNext().getData();
        } else {
            return -1; // Menandakan bahwa tidak ada node berikutnya
        }
    }

    // Method untuk membaca data node sebelumnya
    public int readPrevious(int data) {
        Node currentNode = findNode(data);
        if (currentNode != null && currentNode.getPrevious() != null) {
            return currentNode.getPrevious().getData();
        } else {
            return -1; // Menandakan bahwa tidak ada node sebelumnya
        }
    }

    // Method untuk mencari node dengan data tertentu
    private Node findNode(int data) {
        Node currentNode = head;
        while (currentNode != null && currentNode.getData() != data) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    // Method untuk mencetak isi linked list dari head ke tail
    public void printForward() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    // Method untuk mencetak isi linked list dari tail ke head
    public void printBackward() {
        Node currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getPrevious();
        }
        System.out.println();
    }
}
