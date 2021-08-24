package projectnode;

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
        node1.setNodeRef(node2);

        Node<Object> node3 = new Node<>("content Node3");
        node2.setNodeRef(node3);

        Node<Object> node4 = new Node<>(1);
        node3.setNodeRef(node4);

        System.out.println(node1);
        System.out.println(node1.getNodeRef());
        System.out.println(node1.getNodeRef().getNodeRef());
        System.out.println(node1.getNodeRef().getNodeRef().getNodeRef());
    }
}
