public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        // Menambahkan node ke dalam linked list
        doubleLinkedList.addNode(10);
        doubleLinkedList.addNode(20);
        doubleLinkedList.addNode(30);
        doubleLinkedList.addNode(40);

        // Mencetak linked list dari head ke tail
        System.out.println("Linked List (Forward):");
        doubleLinkedList.printForward();

        // Mencetak linked list dari tail ke head
        System.out.println("Linked List (Backward):");
        doubleLinkedList.printBackward();

        // Membaca data node berikutnya
        int dataToReadNext = 20;
        int nextData = doubleLinkedList.readNext(dataToReadNext);
        System.out.println("Data setelah " + dataToReadNext + ": " + nextData);

        // Membaca data node sebelumnya
        int dataToReadPrevious = 30;
        int previousData = doubleLinkedList.readPrevious(dataToReadPrevious);
        System.out.println("Data sebelum " + dataToReadPrevious + ": " + previousData);
    }
}
