package one.digitalinnovation;

import java.util.TreeSet;

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
            System.out.print(current.getContent() + ", ");
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
            System.out.print(current.getContent() + ", ");
        }
    }

    public void printPreOrder(){
        System.out.println("\n Exibindo PreOrder");
        printPreOrder(this.root);
    }

    private void printPreOrder(BinNode<T> current){
        if (current != null){
            System.out.print(current.getContent() + ", ");
            printPreOrder(current.getLeftNode());
            printPreOrder(current.getRightNode());
        }
    }

    public void remove(T content){
        try {
            BinNode<T> current = this.root;
            BinNode<T> parent = null;
            BinNode<T> child = null;
            BinNode<T> aux = null;

            while (current != null && !current.getContent().equals(content)){
                parent = current;
                if (content.compareTo(current.getContent()) < 0){
                    current = current.getLeftNode();
                }else {
                    current = current.getRightNode();
                }
            }

            if (current == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if (parent == null) {
                if (current.getRightNode() == null) {
                    this.root = current.getLeftNode();
                } else if (current.getLeftNode() == null) {
                    this.root = current.getRightNode();
                }else {
                    for(aux = current, child = current.getLeftNode();
                        child.getRightNode() != null;
                        aux = child, child = child.getLeftNode()
                    ){
                        if (child != current.getLeftNode()){
                            aux.setRightNode(child.getLeftNode());
                            child.setLeftNode(root.getLeftNode());
                        }
                    }
                    child.setRightNode(root.getRightNode());
                    root = child;
                }
            }else if(current.getRightNode() == null){
                if(parent.getRightNode() == current){
                    parent.setLeftNode(current.getLeftNode());
                }else {
                    parent.setRightNode(current.getLeftNode());
                }
            }else if(current.getLeftNode() == null){
                if(parent.getRightNode() == current){
                    parent.setLeftNode(current.getRightNode());
                }else {
                    parent.setRightNode(current.getRightNode());
                }
            }else {
                for (
                        aux = current, child = current.getLeftNode();
                        child.getRightNode() != null;
                        aux = child, child = child.getRightNode()
                ){
                    if (child != current.getLeftNode()){
                        aux.setRightNode(child.getLeftNode());
                        child.setLeftNode(current.getLeftNode());
                    }
                    child.setRightNode(current.getRightNode());
                    if (parent.getLeftNode() == current){
                        parent.setLeftNode(child);
                    }else {
                        parent.setRightNode(child);
                    }
                }

            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }

}
