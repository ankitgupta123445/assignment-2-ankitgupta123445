/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;
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

        public static void main(String[] args) {
                MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
                myBinarySearchTree.insert(25);
                myBinarySearchTree.insert(37);
                myBinarySearchTree.insert(18);
                myBinarySearchTree.insert(15);
                myBinarySearchTree.insert(1);

                System.out.println("Traverse the tree in PreOrder :");
                traversePreOrder(myBinarySearchTree.getRoot());

                System.out.println();

                System.out.println("Traverse the tree in PostOrder :");
                traversePostOrder(myBinarySearchTree.getRoot());
        }
}



