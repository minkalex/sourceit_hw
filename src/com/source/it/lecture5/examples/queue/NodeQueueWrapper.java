package com.source.it.lecture5.examples.queue;

public class NodeQueueWrapper {
    private QueueNode tail;
    public NodeQueueWrapper(QueueNode node) {
        tail = node;
    }

    public void addNode(QueueNode node) {
        node.setNext(tail);
        tail = node;
    }

    public QueueNode getHead() {

        if (tail.getNext() == null) {
            System.out.println(tail.getValue());
            System.out.println("null");
            tail = null;
            System.exit(0);
        }

        QueueNode current = tail.getNext();
        QueueNode prev = tail;
        while (current.getNext() != null) {
            current = current.getNext();
            prev = prev.getNext();
        }
        prev.setNext(null);
        return current;
    }

        public void printQueue() {
        QueueNode current = tail;
        while (current != null) {
            System.out.print(current.getValue() + " --> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void printQueueRecurcive() {
        printRecurcive(tail);
        System.out.println("null");
    }

    private void printRecurcive(QueueNode current) {
        System.out.print(current.getValue() + " --> ");
        if (current.getNext() != null) {
            printRecurcive(current.getNext());
        }
    }

    /**
     * Removes Node from list that is located on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     **/
    public void remove(int position) {
        int size = 0;
        int counter = 0;
        QueueNode current = tail;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        if (position <= size) {
            size += 1;
            int positionFromTail = size - position;
            current = tail;
            while (current != null) {
                counter++;
                if (counter == positionFromTail) {
                    if (current.getNext() != null) {
                        System.out.print(current.getNext().getValue() + " --> ");
                        current = current.getNext();
                    } else {
                        break;
                    }
                } else {
                    System.out.print(current.getValue() + " --> ");
                }
                current = current.getNext();
            }
            System.out.println("null");
        } else {
            System.out.println("Position exceeds queue length!");
        }
    }

    /**
     * Adds Node to list on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     * @param node node should be inserted at position
     */
    public void addNode(int position, QueueNode node) {
        int size = 0;
        int counter = 0;
        QueueNode current = tail;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        if (position <= size) {
            size += 1;
            int positionFromTail = size - position;
            current = tail;
            while (current != null) {
                counter++;
                if (counter == positionFromTail) {
                    if (current.getNext() != null) {
                        node.setNext(current.getNext());
                        current.setNext(node);
                        System.out.print(current.getValue() + " --> ");
                    } else {
                        node.setNext(null);
                        current.setNext(node);
                        System.out.print(current.getValue() + " --> " + current.getNext().getValue() + " --> ");
                        break;
                    }
                } else {
                    System.out.print(current.getValue() + " --> ");
                }
                current = current.getNext();
            }
            System.out.println("null");
        } else {
            System.out.println("Position exceeds queue length!");
        }
    }

    /**
     * Gets then Node that located on the position starting from the tail (end of the list)
     * if position is more than list size - prints error message
     * @param position number of the Node starting from the tail
     * @return Node that located on the position from the tail (end of list) if position exists in list
     */
    public QueueNode getFromHead(int position) {
        int size = 0;
        int counter = 0;
        int elem = 0;
        Integer next = 0;
        QueueNode current = tail;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        if (position <= size) {
            size += 1;
            int positionFromTail = size - position;
            current = tail;
            while (current != null) {
                counter++;
                if (counter == positionFromTail) {
                    elem = current.getValue();
                    if (current.getNext() != null) {
                        System.out.print(current.getNext().getValue() + " --> ");
                        next = current.getNext().getValue();
                        current = current.getNext();
                    } else {
                        next = null;
                        break;
                    }
                } else {
                    System.out.print(current.getValue() + " --> ");
                }
                current = current.getNext();
            }
            System.out.println("null");
        } else {
            System.out.println("Position exceeds queue length!");
        }
        System.out.println("Node: current value - " + new QueueNode(elem).getValue() + ", next value - " + next + ".");
        return new QueueNode(elem);
    }
}
