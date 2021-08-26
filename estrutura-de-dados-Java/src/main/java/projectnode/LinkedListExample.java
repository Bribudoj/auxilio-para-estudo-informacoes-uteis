package projectnode;

public class LinkedListExample<T> {

    NodeExample<T> entryRef;

    public LinkedListExample(){
        this.entryRef = null;
    }

    public int size(){
        int listSize = 0;
        NodeExample<T> auxRef = entryRef;

        while (true){
            if (entryRef != null){
                listSize++;
                if (auxRef.getNextNodeRef() != null){
                    auxRef = auxRef.getNextNodeRef();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return listSize;
    }
    private void indexValidation(int index){

        if (index >= size()){
            int lastIndex = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + "desta lista. Esta lista só vai até o índice" + lastIndex + ".");
        }
    }

    public void add(T content){
        NodeExample<T> newNode = new NodeExample<>(content);
        if (this.isEmpty()){
            entryRef = newNode;
            return;
        }
        NodeExample<T> auxNode = entryRef;
        for(int i = 0; i < this.size() - 1; i++){
            auxNode = auxNode.getNextNodeRef();
        }
        auxNode.setNextNodeRef(newNode);
    }

    private NodeExample<T> getNode(int index){
        indexValidation(index);
        NodeExample<T> auxNode = entryRef;
        NodeExample<T> returnNode = null;
        for(int i = 0; i <= index; i++){
            returnNode = auxNode;
            auxNode = auxNode.getNextNodeRef();
        }
        return returnNode;
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    public T remove(int index){
        NodeExample<T> pivotNode = this.getNode(index);
        if (index == 0){
            entryRef = pivotNode.getNextNodeRef();
            return pivotNode.getContent();
        }

        NodeExample<T> previousNode = getNode(index - 1);
        previousNode.setNextNodeRef(pivotNode.getNextNodeRef());
        return pivotNode.getContent();
    }

    public boolean isEmpty(){
        return entryRef == null;
    }

    public String toString() {
        String returnString = "----------------\n";
        returnString += "     Lista\n";
        returnString += "----------------\n";

        NodeExample<T> auxNodeExample = entryRef;

        for (int i = 0; i < size(); i++){
                returnString += "[No{conteudo=" + auxNodeExample.getContent() +"}]--->";
                auxNodeExample = auxNodeExample.getNextNodeRef();
        }
        returnString += "null\n================\n";
        return returnString;
    }
}
