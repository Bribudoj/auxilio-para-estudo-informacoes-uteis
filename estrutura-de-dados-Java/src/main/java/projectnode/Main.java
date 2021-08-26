package projectnode;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add("Queijo");
        list.add(23241);

        NodeExample<Object> nodeExample1 = new NodeExample<>("content Node1");
        list.add(nodeExample1);

        NodeExample<Object> nodeExample2 = new NodeExample<>(list);
        nodeExample1.setNextNodeRef(nodeExample2);

        NodeExample<Object> nodeExample3 = new NodeExample<>("content Node3");
        nodeExample2.setNextNodeRef(nodeExample3);

        NodeExample<Object> nodeExample4 = new NodeExample<>(1);
        nodeExample3.setNextNodeRef(nodeExample4);

        System.out.println(nodeExample1);
        System.out.println(nodeExample1.getNextNodeRef());
        System.out.println(nodeExample1.getNextNodeRef().getNextNodeRef());
        System.out.println(nodeExample1.getNextNodeRef().getNextNodeRef().getNextNodeRef());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        StackExample myStack = new StackExample();

        myStack.push(new NodeExample(1));
        myStack.push(new NodeExample(2));
        myStack.push(new NodeExample(3));
        myStack.push(new NodeExample(4));
        myStack.push(new NodeExample(5));
        myStack.push(new NodeExample(6));
        myStack.push(new NodeExample(7));

        System.out.println(myStack);

        myStack.pop();
        System.out.println(myStack);

        myStack.push(new NodeExample(7));

        System.out.println(myStack);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        QueueExample<String> myqueue = new QueueExample<>();

        myqueue.enqueue("first");
        myqueue.enqueue("second");
        myqueue.enqueue("third");
        myqueue.enqueue("fourth");


        System.out.println(myqueue);

        System.out.println(myqueue.dequeue());

        System.out.println(myqueue);

        myqueue.enqueue("ultimo");


        System.out.println(myqueue.first());
        System.out.println(myqueue);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        LinkedListExample<String> myLinkedList = new LinkedListExample<>();

        myLinkedList.add("teste1");
        myLinkedList.add("teste2");
        myLinkedList.add("teste3");
        myLinkedList.add("teste4");

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));

        myLinkedList.remove(3);
        System.out.println(myLinkedList);
    }
}
