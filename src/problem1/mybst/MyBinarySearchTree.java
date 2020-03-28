/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
        private TreeNode root = null;
        private int max = 0;
        private int count = 0;

        public TreeNode getRoot() {
                return root;
        }

        public void insert(int item) {
                TreeNode node = new TreeNode(item);
                if (root == null) {
                        root = node;
                } else {
                        TreeNode temp = root;
                        TreeNode parent = null;
                        while (temp != null) {
                                parent = temp;
                                if (item < temp.getData()) {
                                        temp = temp.getLeft();
                                } else if (item >= temp.getData()) {
                                        temp = temp.getRight();
                                }
                        }
                        if (item <= parent.getData()) {
                                parent.setLeft(node);
                        } else {
                                parent.setRight(node);
                        }
                }
        }
}
