package projectnode;

public class StackExample<T> {

    private NodeExample<T> entryReference;

    public StackExample() {
        this.entryReference = null;
    }

    public void push(T object){
        NodeExample<T> newNode = new NodeExample<>(object);
        NodeExample<T> auxReference = entryReference;
        entryReference = newNode;
        entryReference.setNextNodeRef(auxReference);
    }

    public NodeExample<T> pop(){
        if(!this.isEmpty()){
            NodeExample<T> poppedNode = entryReference;
            entryReference = entryReference.getNextNodeRef();
            return poppedNode;
        }
        return null;
    }

    public NodeExample<T> top(){
        return entryReference;
    }

    private boolean isEmpty() {
        return entryReference == null;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("----------------\n     Pilha\n----------------\n");

        NodeExample<T> auxNodeExample = entryReference;

        while (true){
            if (auxNodeExample != null){
                returnString.append("[Node{content=").append(auxNodeExample.getContent()).append("}]\n");
                auxNodeExample = auxNodeExample.getNextNodeRef();
            }else break;
        }
        returnString.append("================\n");
        return returnString.toString();
    }
}
