/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
                System.out.println("Enter the no of element that you want to enter");
                int length = sc.nextInt();
                for (int i = 0; i < length; i++) {
                        myBinarySearchTree.insert(sc.nextInt());
                }
                myBinarySearchTree.traverse(myBinarySearchTree.getRoot());
        }
}


