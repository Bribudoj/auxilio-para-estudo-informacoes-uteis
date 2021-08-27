package projectnode;

public class DoublyLinkedList<T> {

    private NodeExample<T> firstNode;
    private NodeExample<T> lastNode;

    private int listSize;

    public DoublyLinkedList(){
        firstNode = null;
        lastNode = null;
        this.listSize = 0;
    }

    public int size(){
        return listSize;
    }
}
