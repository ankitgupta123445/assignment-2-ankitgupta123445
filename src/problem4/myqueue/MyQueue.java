/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import java.util.NoSuchElementException;

public class MyQueue {
        private int size = 0;
        private Node head = null;
        private Node tail = null;

        private Node getNode(int index) {
                Node response = head;
                for (int i = 0; i < index && response != null; i++) {
                        response = response.getNext();
                }
                return response;
        }

        private void addFirst(int item) {
                Node node1 = new Node(null, null, item);
                head = node1;
                tail = node1;
                size++;
        }

        private void addAfter(Node node, int item) {
                Node node5 = node.next;
                if (node5 == null) {
                        Node node3 = new Node(null, node, item);
                        tail = node3;
                        node.next = node3;
                        size++;
                }

        }

        private void addAt(int index, int item) {
                if (index < 0 || index > size) {
                        throw new IndexOutOfBoundsException(Integer.toString(index));
                } else if (index == 0) {
                        addFirst(item);

                } else {

                        addAfter(getNode(index - 1), item);
                }
        }

        public void add(int item) {
                addAt(size, item);
        }

        public int remove() {
                if (head == null) {
                        throw new NoSuchElementException("Underflow");
                } else {
                        int removeElement = head.getData();
                        head = head.next;
                        System.out.println(removeElement);
                        size--;
                        return removeElement;
                }
        }

        public int peek() {
                if (head == null) {
                        throw new NoSuchElementException("Underflow");
                } else {
                        System.out.println(head.getData());
                }
                return 0;
        }

        public void display() {
                if (head == null) {
                        System.out.println("Do not exist");
                } else {
                        Node temp = head;
                        for (int i = 0; i < size && temp != null; i++) {
                                int data = temp.getData();
                                System.out.print(data + (i < size - 1 ? "," : " "));
                                temp = temp.getNext();
                        }
                }
                System.out.println("");
        }


        public int poll() {
                System.out.println(head.getData());
                if (head == null) {
                        throw new NoSuchElementException("No element");
                } else {
                        int pollelement = head.getData();
                        head = head.next;
                        size--;
                        return pollelement;
                }
        }


        private static class Node<E> {
                private Node next;
                private Node previous;
                private int data;

                public Node(int data) {
                        this.data = data;
                }

                public Node(Node<E> next, Node previous, int data) {
                        this.next = next;
                        this.previous = previous;
                        this.data = data;
                }

                public Node<E> getPrevious() {
                        return previous;
                }

                public int getData() {
                        return data;
                }

                public Node<E> getNext() {
                        return next;
                }
        }
}
