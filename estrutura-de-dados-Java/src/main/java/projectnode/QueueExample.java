package projectnode;

public class QueueExample {

    private Node refNodeQueueEntry;

    public QueueExample() {
        this.refNodeQueueEntry = null;
    }

    public void enqueue(Node newNode){
        newNode.setNodeRef(refNodeQueueEntry);
        refNodeQueueEntry = newNode;
    }

    public Node first(){
        if(!isEmpty()){
            Node firstNode = refNodeQueueEntry;
            while (true){
                if(firstNode.getNodeRef() != null){
                    firstNode = firstNode.getNodeRef();
                }else {
                    break;
                }
            }
        }
        return null;
    }

    public Node dequeue(){
        if(!isEmpty()){
            Node firstNode = refNodeQueueEntry;
            Node auxNode = refNodeQueueEntry;
            while (true){
                if(firstNode.getNodeRef() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getNodeRef();
                }else {
                    auxNode.setNodeRef(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNodeQueueEntry == null ? true :  false;
    }

    @Override
    public String toString() {
        String returnString = "\n";
        Node auxNode = refNodeQueueEntry;
        if (refNodeQueueEntry != null){
            while (true){
                returnString += "[Node{content=" + auxNode.getContent() + "}]--->";
                if (auxNode.getNodeRef() != null){
                    auxNode = auxNode.getNodeRef();
                }else {
                    returnString += null;
                    break;
                }
            }
        }
        return returnString;
    }
}
