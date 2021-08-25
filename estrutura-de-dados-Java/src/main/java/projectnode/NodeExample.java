package projectnode;

public class NodeExample<T> {

    private T content;
    private NodeExample<T> nodeExampleRef = null;

    public NodeExample(){
    }

    public NodeExample(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public NodeExample<T> getNodeRef() {
        return nodeExampleRef;
    }

    public void setNodeRef(NodeExample<T> nodeExampleRef) {
        this.nodeExampleRef = nodeExampleRef;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                '}';
    }
}
