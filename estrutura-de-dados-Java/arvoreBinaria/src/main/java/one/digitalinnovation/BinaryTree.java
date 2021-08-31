package one.digitalinnovation;

public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public void insert(T content){
        BinNode<T> newNode = new BinNode<>(content);
        this.root = insert(root, newNode);
    }

    private BinNode<T> insert(BinNode<T> current, BinNode<T> newNode){
        if (current == null){
            return newNode;
        }else if (newNode.getContent().compareTo(current.getContent()) < 0){
            current.setLeftNode(insert(current.getLeftNode(), newNode));
        }else {
            current.setRightNode(insert(current.getRightNode(), newNode));
        }
        return current;
    }

    public void printInOrder(){
        System.out.println("\n Exibindo InOrder");
        printInOrder(this.root);
    }

    private void printInOrder(BinNode<T> current){
        if (current != null){
            printInOrder(current.getLeftNode());
            System.out.println(current.getContent() + ", ");
            printInOrder(current.getRightNode());
        }
    }

    public void printPostOrder(){
        System.out.println("\n Exibindo PostOrder");
        printPostOrder(this.root);
    }

    private void printPostOrder(BinNode<T> current){
        if (current != null){
            printPostOrder(current.getLeftNode());
            printPostOrder(current.getRightNode());
            System.out.println(current.getContent() + ", ");
        }
    }

    public void printPreOrder(){
        System.out.println("\n Exibindo PreOrder");
        printPreOrder(this.root);
    }

    private void printPreOrder(BinNode<T> current){
        if (current != null){
            System.out.println(current.getContent() + ", ");
            printPreOrder(current.getLeftNode());
            printPreOrder(current.getRightNode());
        }
    }
}
