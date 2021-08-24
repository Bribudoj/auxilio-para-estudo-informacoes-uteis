package projectnode;

public class Node<T> {

    private T content;
    private Node<T> nodeRef = null;

    public Node(){
    }

    public Node(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNodeRef() {
        return nodeRef;
    }

    public void setNodeRef(Node<T> nodeRef) {
        this.nodeRef = nodeRef;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                '}';
    }
}
