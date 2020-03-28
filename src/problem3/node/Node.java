/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node {
        private String data;
        public Node next = null;
        public int priority;

        public Node(String data, int priority) {
                this.data = data;
                this.priority = priority;
        }

        public Node(String data) {
                this.data = data;
        }

        public String getData() {
                return data;
        }

        public void setData(String data) {
                this.data = data;
        }

        public Node getNext() {
                return next;
        }

        public void setNext(Node next) {
                this.next = next;
        }

        public int getPriority() {
                return priority;
        }

        public void setPriority(int priority) {
                this.priority = priority;
        }
}
