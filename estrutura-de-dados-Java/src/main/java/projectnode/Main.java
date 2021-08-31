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

        StackExample<Integer> myStack = new StackExample<>();

        System.out.println(myStack.pop());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        System.out.println(myStack);

        myStack.pop();
        System.out.println(myStack);

        myStack.push(7);

        System.out.println(myStack);
        System.out.println(myStack.top());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        QueueExample<String> myqueue = new QueueExample<>();


        myqueue.enqueue("first");
        System.out.println(myqueue);
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

        System.out.println(myLinkedList);
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

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        DoublyLinkedListExample<String> myDoublyLinkedList = new DoublyLinkedListExample<>();

        myDoublyLinkedList.add("teste1");
        myDoublyLinkedList.add("teste2");
        myDoublyLinkedList.add(1,"teste7");
        myDoublyLinkedList.add("teste3");
        myDoublyLinkedList.add("teste4");
        System.out.println(myDoublyLinkedList);
        myDoublyLinkedList.remove(3);
        System.out.println(myDoublyLinkedList);
        myDoublyLinkedList.add("teste5");
        System.out.println(myDoublyLinkedList);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        CircularLinkedListExample<String> myCircularLinkedList = new CircularLinkedListExample<>();

        myCircularLinkedList.add("teste1");
        myCircularLinkedList.add("teste2");
        myCircularLinkedList.add("teste3");
        myCircularLinkedList.add("teste4");
        myCircularLinkedList.add("teste4");
        System.out.println(myCircularLinkedList);
        myCircularLinkedList.remove(3);
        System.out.println(myCircularLinkedList);
        myCircularLinkedList.add("teste5");
        System.out.println(myCircularLinkedList);

        System.out.println(myCircularLinkedList.get(1));

    }
}
