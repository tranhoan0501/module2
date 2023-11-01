package _10_DSA_ArrayList_LinkedList.LinkedList;

public class MyLinkedList {
    private int numNodes;
    private Node head;

    public MyLinkedList() {
        numNodes = 0;
        head = null;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        numNodes++;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(Object data) {
        add(data);
    }

    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node previousNode = head;
            for (int i = 0; i < index - 1; i++) {
                previousNode = previousNode.next;
            }
            previousNode.next = previousNode.next.next;
        }

        numNodes--;
    }

    public void remove(Object data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                if (previousNode == null) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
                numNodes--;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList();
        Node currentNode = head;
        while (currentNode != null) {
            newList.add(currentNode.data);
            currentNode = currentNode.next;
        }
        return newList;
    }

    public boolean contains(Object data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }
    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
}
