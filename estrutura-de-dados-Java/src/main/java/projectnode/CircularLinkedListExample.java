package projectnode;

public class CircularLinkedListExample<T>{

    private NodeExample<T> head;
    private NodeExample<T> tail;
    private int listSize;

    CircularLinkedListExample(){
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public void add(T content){
        NodeExample<T> newNode = new NodeExample<>(content);
        if(isEmpty()){
            head = newNode;
            tail = head;
            head.setNextNodeRef(tail);
        }else {
            newNode.setNextNodeRef(tail);
            head.setNextNodeRef(newNode);
            tail = newNode;
        }
        listSize++;
    }

    public void remove(int index){
        if(index >= listSize){
            throw new IndexOutOfBoundsException("Indice maior que o tamanho da lista");
        }
        NodeExample<T> auxNode = tail;
        if (index == 0){
            tail = tail.getNextNodeRef();
            head.setNextNodeRef(tail);
        }else if(index == 1){
            tail.setNextNodeRef(tail.getNextNodeRef().getNextNodeRef());
        }else {
            for (int i = 0; i < index-1; i++){
                auxNode = auxNode.getNextNodeRef();
            }
            auxNode.setNextNodeRef(auxNode.getNextNodeRef().getNextNodeRef());
        }
        listSize--;
    }

    public T get(int index){
          return this.getNode(index).getContent();
    }

    private NodeExample<T> getNode(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("A lista esta vazia!");
        }
        if(index == 0){
            return this.tail;
        }
        NodeExample<T> auxNode = tail;
        for (int i = 0; (i < index) && (auxNode != null); i++){
            auxNode = auxNode.getNextNodeRef();
        }
        return auxNode;
    }

    public boolean isEmpty(){
        return listSize == 0;
    }

    public int size(){
        return this.listSize;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("----------------\n     Lista Circular\n----------------\n");

        NodeExample<T> auxNode = tail;

        for (int i = 0; i < size(); i++){
            returnString.append("[No{conteudo=").append(auxNode.getContent()).append("}]--->");
            auxNode = auxNode.getNextNodeRef();
        }
        if(this.size() != 0){
            returnString.append("retorna ao inicio\n================\n");
        }
        else{
            returnString.append("[]\n================\n");
        }
        return returnString.toString();
    }
}
