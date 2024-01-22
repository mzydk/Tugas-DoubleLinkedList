public class Node {
    private int data;
    private Node next;
    private Node previous;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    // Getter dan setter untuk data
    public int getData() {
        return data;
    }

    // Getter dan setter untuk node berikutnya
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // Getter dan setter untuk node sebelumnya
    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
