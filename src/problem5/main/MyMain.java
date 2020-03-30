/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
        public static void main(String[] args) {
                MyCircularQueue myCircularQueue = new MyCircularQueue(3);
                myCircularQueue.add(new Student("deepesh", 0, 0));
                myCircularQueue.add(new Student("Yashdeep", 1, 1));
                myCircularQueue.add(new Student("Deeraj", 1, 0));
                for (int i = 0; i < myCircularQueue.getSize() + 1; i++) {
                        Student s = myCircularQueue.remove();
                        if (s.getBackLog() - s.getAppearingCount() != 0) {
                                myCircularQueue.add(s);
                        }
                }
                myCircularQueue.show();

        }
}
