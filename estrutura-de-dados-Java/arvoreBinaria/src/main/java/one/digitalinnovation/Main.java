package one.digitalinnovation;

import one.digitalinnovation.model.Obj;

public class Main {
    public static void main(String[] args) {

        BinaryTree<Obj> myTree = new BinaryTree<>();

        Obj teste = new Obj(29);
        myTree.insert(new Obj(13));
        myTree.insert(new Obj(10));
        myTree.insert(new Obj(25));
        myTree.insert(new Obj(2));
        myTree.insert(new Obj(12));
        myTree.insert(new Obj(20));
        myTree.insert(new Obj(31));
        myTree.insert(teste);

        myTree.printInOrder();
        myTree.printPreOrder();
        myTree.printPostOrder();

        myTree.insert(new Obj(32));

        myTree.printInOrder();
        myTree.printPreOrder();
        myTree.printPostOrder();

        myTree.remove(teste);

        myTree.printInOrder();
        myTree.printPreOrder();
        myTree.printPostOrder();

    }
}
