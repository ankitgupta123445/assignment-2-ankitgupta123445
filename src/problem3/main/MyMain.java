/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student

import problem3.myqueue.MyPriorityQueue;

public class MyMain {
        public static void main(String[] args) {
                MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
                myPriorityQueue.push("arpit", 1);
                myPriorityQueue.push("raghav", 3);
                myPriorityQueue.push("shraddha", 0);
                myPriorityQueue.push("Rahul", 2);
                String pee = myPriorityQueue.peek();
                myPriorityQueue.print();
        }
}

