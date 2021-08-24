package santana.eduardo.stack;

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
        if(!isEmpty()){
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
}
