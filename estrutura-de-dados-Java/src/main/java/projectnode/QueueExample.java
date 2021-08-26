package projectnode;

public class QueueExample<T> {

    private NodeExample<T> entryReference;

    public QueueExample() {
        this.entryReference = null;
    }

    public void enqueue(T object){
        NodeExample newNode = new NodeExample(object);
        newNode.setNextNodeRef(entryReference);
        entryReference = newNode;
    }

    public T first(){
        if(!isEmpty()){
            NodeExample firstNode = entryReference;
            while (true){
                if(firstNode.getNextNodeRef() != null){
                    firstNode = firstNode.getNextNodeRef();
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
            NodeExample firstNode = entryReference;
            NodeExample auxNode = entryReference;
            while (true){
                if(firstNode.getNextNodeRef() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getNextNodeRef();
                }else {
                    auxNode.setNextNodeRef(null);
                    break;
                }
            }
            return (T) firstNode.getContent();
        }
        return null;
    }

    public boolean isEmpty(){
        return entryReference == null ? true :  false;
    }

    @Override
    public String toString() {
        String returnString = "----------------\n";
        returnString += "     Queue\n";
        returnString += "----------------\n";
        NodeExample auxNode = entryReference;
        if (entryReference != null){
            while (true){
                returnString += "[Node{content=" + auxNode.getContent() + "}]--->";
                if (auxNode.getNextNodeRef() != null){
                    auxNode = auxNode.getNextNodeRef();
                }else {
                    returnString += null;
                    break;
                }
            }
        }
        return returnString;
    }
}
