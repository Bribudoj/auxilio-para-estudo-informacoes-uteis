package projectnode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add("Queijo");
        list.add(23241);

        Node<Object> node1 = new Node<>("content Node1");
        list.add(node1);

        Node<Object> node2 = new Node<>(list);
        node1.setNextNode(node2);

        Node<Object> node3 = new Node<>("content Node3");
        node2.setNextNode(node3);

        Node<Object> node4 = new Node<>(1);
        node3.setNextNode(node4);

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node1.getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode());
    }
}
