/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
        public static void traversePreOrder(TreeNode currentNode) {
                if (currentNode != null) {
                        System.out.print(currentNode.getData() + " ");
                        traversePreOrder(currentNode.getLeft());
                        traversePreOrder(currentNode.getRight());
                }
        }

        public static void traversePostOrder(TreeNode currentNode) {
                if (currentNode != null) {
                        traversePostOrder(currentNode.getLeft());
                        traversePostOrder(currentNode.getRight());
                        System.out.print(currentNode.getData() + " ");
                }
        }
}



