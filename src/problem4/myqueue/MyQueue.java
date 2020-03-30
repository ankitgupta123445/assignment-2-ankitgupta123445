/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

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
