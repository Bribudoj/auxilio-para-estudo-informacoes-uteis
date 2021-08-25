package projectnode;

public class QueueExample<T> {

    private NodeExample refNodeExampleQueueEntry;

    public QueueExample() {
        this.refNodeExampleQueueEntry = null;
    }

    public void enqueue(T object){
        NodeExample newNode = new NodeExample(object);
        newNode.setNodeRef(refNodeExampleQueueEntry);
        refNodeExampleQueueEntry = newNode;
    }

    public T first(){
        if(!isEmpty()){
            NodeExample firstNode = refNodeExampleQueueEntry;
            while (true){
                if(firstNode.getNodeRef() != null){
                    firstNode = firstNode.getNodeRef();
                }else {
                    break;
                }
            }
            return (T) firstNode.getContent();
        }
        return null;
    }

    public T dequeue(){
        if(!isEmpty()){
            NodeExample firstNode = refNodeExampleQueueEntry;
            NodeExample auxNode = refNodeExampleQueueEntry;
            while (true){
                if(firstNode.getNodeRef() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getNodeRef();
                }else {
                    auxNode.setNodeRef(null);
                    break;
                }
            }
            return (T) firstNode.getContent();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNodeExampleQueueEntry == null ? true :  false;
    }

    @Override
    public String toString() {
        String returnString = "----------------\n";
        returnString += "     Queue\n";
        returnString += "----------------\n";
        NodeExample auxNode = refNodeExampleQueueEntry;
        if (refNodeExampleQueueEntry != null){
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
