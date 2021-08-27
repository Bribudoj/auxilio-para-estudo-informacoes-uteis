package projectnode;

public class DoublyLinkedList<T> {

    private NodeExample<T> firstNode;
    private NodeExample<T> lastNode;

    private int listSize;

    public DoublyLinkedList(){
        firstNode = null;
        lastNode = null;
        this.listSize = 0;

    }

    public void add(T content){
        NodeExample<T> newNode = new NodeExample<>(content);
        newNode.setNextNodeRef(null);
        newNode.setPreviousNodeRef(lastNode);
        if(firstNode == null){
            firstNode = newNode;
        }
        if (lastNode != null){
            lastNode.setNextNodeRef(newNode);
        }
        lastNode = newNode;
        listSize++;
    }

    public void add(int index, T content){
        NodeExample<T> auxNode = getNode(index);
        NodeExample<T> newNode = new NodeExample<>(content);
        newNode.setNextNodeRef(auxNode);

        if (newNode.getNextNodeRef() != null){
            newNode.setPreviousNodeRef(auxNode.getPreviousNodeRef());
            newNode.getNextNodeRef().setPreviousNodeRef(newNode);
        }else {
            newNode.setPreviousNodeRef(lastNode);
            lastNode = newNode;
        }

        if (index == 0){
            firstNode = newNode;
        }else {
            newNode.getPreviousNodeRef().setNextNodeRef(newNode);
        }
        listSize++;
    }

    public void remove(int index){
        if (index == 0){
            firstNode = firstNode.getNextNodeRef();
            if(firstNode != null){
                firstNode.setPreviousNodeRef(null);
            }
        }else{
            NodeExample<T> auxNode = getNode(index);
            auxNode.getPreviousNodeRef().setNextNodeRef(auxNode.getNextNodeRef());
            if(auxNode != lastNode){
                auxNode.getNextNodeRef().setPreviousNodeRef(auxNode.getPreviousNodeRef());
            }else{
                lastNode = auxNode.getPreviousNodeRef();
            }
            listSize--;
        }
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }

    private NodeExample<T> getNode(int index){
        NodeExample<T> auxNode = firstNode;
        for (int i = 0; (i < index) && (auxNode != null); i++){
            auxNode = auxNode.getNextNodeRef();
        }
        return auxNode;
    }

    public int size(){
        return listSize;
    }
    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("----------------\n     Lista Duplamente Encadeada\n----------------\n");

        NodeExample<T> auxNode = firstNode;

        for (int i = 0; i < size(); i++){
            returnString.append("[No{conteudo=").append(auxNode.getContent()).append("}]--->");
            auxNode = auxNode.getNextNodeRef();
        }
        returnString.append("null\n================\n");

        return returnString.toString();
    }
}
