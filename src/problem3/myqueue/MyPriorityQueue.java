/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.node.Node;
public class MyPriorityQueue {

        private Node head = null;
        private int size = 0;

        public void push(String data, int priority) {
                Node temp = new Node(data, priority);
                if (head == null) {
                        head = temp;
                        size = size + 1;
                } else {


                        if (head.getPriority() > priority) {
                                temp.next = head;
                                head = temp;
                                size = size + 1;

                        } else {
                                Node root = head;
                                while (root.next != null &&
                                        root.next.priority < priority) {
                                        root = root.next;
                                }
                                temp.next = root.next;
                                root.next = temp;
                                size++;
                        }

                }

        }

        public String peek() {
                return head.getData();
        }

        public void print() {
                Node temp = head;

                for (int i = 0; i < size && temp != null; i++) {
                        String data = temp.getData();
                        int Rollno = temp.getPriority();
                        System.out.println(Rollno + " " + data + (i < size - 1 ? "," : " "));
                        temp = temp.getNext();
                }
        }


}
