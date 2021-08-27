package projectnode;

public class NodeExample<T> {

    private T content;
    private NodeExample<T> nextNodeRef = null;
    private NodeExample<T> previousNodeRef = null;

    public NodeExample(T content){
        this.content = content;
    }

    public NodeExample(T content, NodeExample<T> nextNodeRef){
        this.content = content;
        this.nextNodeRef = nextNodeRef;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public NodeExample<T> getNextNodeRef() {
        return nextNodeRef;
    }

    public void setNextNodeRef(NodeExample<T> nextNodeRef) {
        this.nextNodeRef = nextNodeRef;
    }

    public NodeExample<T> getPreviousNodeRef() {
        return previousNodeRef;
    }

    public void setPreviousNodeRef(NodeExample<T> previousNodeRef) {
        this.previousNodeRef = previousNodeRef;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                '}';
    }

    public String toStringLinked() {
        String str = "Node{" +
                "content='" + content + '\'' +
                '}';
        if(nextNodeRef != null){
            str += "->" + nextNodeRef;
        }else {
            str += "-> null";
        }
        return str;
    }
}
