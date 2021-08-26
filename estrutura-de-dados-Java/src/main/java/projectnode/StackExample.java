package projectnode;

public class StackExample<T> {

    private NodeExample<T> entryReference;

    public StackExample() {
        this.entryReference = null;
    }

    public void push(NodeExample<T> newNodeExample){
        NodeExample<T> auxReference = entryReference;
        entryReference = newNodeExample;
        entryReference.setNextNodeRef(auxReference);
    }

    public NodeExample<T> pop(){
        if(!this.isEmpty()){
            NodeExample<T> noPopped = entryReference;
            entryReference = entryReference.getNextNodeRef();
            return noPopped;
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
        String returnString = "----------------\n";
        returnString += "     Stack\n";
        returnString += "----------------\n";

        NodeExample<T> auxNodeExample = entryReference;

        while (true){
            if (auxNodeExample != null){
                returnString += "[Node{content=" + auxNodeExample.getContent() +"}]\n";
                auxNodeExample = auxNodeExample.getNextNodeRef();
            }else break;
        }
        returnString += "================\n";
        return returnString;
    }
}
