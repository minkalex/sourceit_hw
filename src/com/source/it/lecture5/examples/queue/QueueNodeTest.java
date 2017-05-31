package com.source.it.lecture5.examples.queue;

public class QueueNodeTest {
    public static void main(String[] args) {
        NodeQueueWrapper queue = new NodeQueueWrapper(new QueueNode(1));
        queue.addNode(new QueueNode(2));
        queue.addNode(new QueueNode(5));

        queue.printQueue();

        /*1*/
        /*System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();

        System.out.println(queue.getHead().getValue());
        queue.printQueue();*/

        /*2*/
        /*queue.remove(3);*/

        /*3*/
        /*queue.addNode(3, new QueueNode(4));*/

        /*4*/
        queue.getFromHead(1);
    }
}
