package projectnode;

public class QueueExample<T> {

    private NodeExample<T> entryReference;

    public QueueExample() {
        this.entryReference = null;
    }

    public void enqueue(T object){
        NodeExample<T> newNode = new NodeExample<>(object);
        newNode.setNextNodeRef(entryReference);
        entryReference = newNode;
    }

    public T first(){
        if(!isEmpty()){
            NodeExample<T> firstNode = entryReference;
            while (true){
                if(firstNode.getNextNodeRef() != null){
                    firstNode = firstNode.getNextNodeRef();
                }else {
                    break;
                }
            }
            return firstNode.getContent();
        }
        return null;
    }

    public T dequeue(){
        if(!isEmpty()){
            NodeExample<T> firstNode = entryReference;
            NodeExample<T> auxNode = entryReference;
            while (true){
                if(firstNode.getNextNodeRef() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getNextNodeRef();
                }else {
                    auxNode.setNextNodeRef(null);
                    break;
                }
            }
            return firstNode.getContent();
        }
        return null;
    }

    public boolean isEmpty(){
        return entryReference == null;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("----------------\n     Fila\n----------------\n");

        NodeExample<T> auxNode = entryReference;
        if (entryReference != null){
            while (true){
                returnString.append("[No{conteudo=").append(auxNode.getContent()).append("}]--->");
                if (auxNode.getNextNodeRef() != null){
                    auxNode = auxNode.getNextNodeRef();
                }else {
                    returnString.append("null");
                    break;
                }
            }
        }
        return returnString.toString();
    }
}
