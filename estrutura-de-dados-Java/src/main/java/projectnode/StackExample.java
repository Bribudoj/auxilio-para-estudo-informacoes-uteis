package projectnode;

public class StackExample {

    private NodeExample refNodeExampleStackEntry;

    public StackExample() {
        this.refNodeExampleStackEntry = null;
    }

    public void push(NodeExample newNodeExample){
        NodeExample auxReference = refNodeExampleStackEntry;
        refNodeExampleStackEntry = newNodeExample;
        refNodeExampleStackEntry.setNodeRef(auxReference);
    }

    public NodeExample pop(){
        if(!this.isEmpty()){
            NodeExample noPopped = refNodeExampleStackEntry;
            refNodeExampleStackEntry = refNodeExampleStackEntry.getNodeRef();
            return noPopped;
        }
        return null;
    }

    public NodeExample top(){
        return refNodeExampleStackEntry;
    }

    private boolean isEmpty() {
        return refNodeExampleStackEntry == null ? true : false;
    }

    @Override
    public String toString() {
        String returnString = "----------------\n";
        returnString += "     Stack\n";
        returnString += "----------------\n";

        NodeExample auxNodeExample = refNodeExampleStackEntry;

        while (true){
            if (auxNodeExample != null){
                returnString += "[Node{content=" + auxNodeExample.getContent() +"}]\n";
                auxNodeExample = auxNodeExample.getNodeRef();
            }else break;
        }
        returnString += "================\n";
        return returnString;
    }
}
