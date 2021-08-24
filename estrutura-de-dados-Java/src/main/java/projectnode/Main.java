package projectnode;

public class Main {
    public static void main(String[] args) {

        Node node1 = new Node("content Node1");

        Node node2 = new Node("content Node2");
        node1.setNextNode(node2);

        Node node3 = new Node("content Node3");
        node2.setNextNode(node3);

        Node node4 = new Node("content Node4");
        node3.setNextNode(node4);

        System.out.println(node1);
        System.out.println(node1.getNextNode().getNextNode().getNextNode());
    }
}
