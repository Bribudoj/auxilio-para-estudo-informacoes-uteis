package projectnode;

import projectnode.Node;

public class StackExample {

    private Node refNodeStackEntry;

    public StackExample() {
        this.refNodeStackEntry = null;
    }

    public void push(Node newNode){
        Node auxReference = refNodeStackEntry;
        refNodeStackEntry = newNode;
        refNodeStackEntry.setNodeRef(auxReference);
    }

    public Node pop(){
        if(!this.isEmpty()){
            Node noPopped = refNodeStackEntry;
            refNodeStackEntry = refNodeStackEntry.getNodeRef();
            return noPopped;
        }
        return null;
    }

    public Node top(){
        return refNodeStackEntry;
    }

    private boolean isEmpty() {
        return refNodeStackEntry == null ? true : false;
    }

    @Override
    public String toString() {
        String returnString = "----------------\n";
        returnString += "     Stack\n";
        returnString += "----------------\n";

        Node auxNode = refNodeStackEntry;

        while (true){
            if (auxNode != null){
                returnString += "[Node{content=" + auxNode.getContent() +"}]\n";
                auxNode = auxNode.getNodeRef();
            }else break;
        }
        returnString += "================\n";
        return returnString;
    }
}
