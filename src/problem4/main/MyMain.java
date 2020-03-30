/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

public class MyMain {
        public static void main(String[] args) {
                MyQueue myQueue = new MyQueue();
                Scanner sc = new Scanner(System.in);
                MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
                System.out.println("Enter the length of number that you want to insert.");
                int length = sc.nextInt();
                for (int i = 0; i < length; i++) {
                        int m = sc.nextInt();
                        binarySearchTree.insert(m);
                }
                System.out.println("Preorder traversal is ");
                binarySearchTree.traversePreorder(binarySearchTree.getRoot());
                System.out.println("\n");
                System.out.println("*____________________________/_________________________");
                System.out.println("Now preorder sucessor of all node are as below");
                binarySearchTree.preOrder(binarySearchTree.getRoot());
                myQueue.display();

        }
}
