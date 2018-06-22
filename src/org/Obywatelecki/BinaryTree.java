package org.Obywatelecki;

public class BinaryTree {

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    public Node getRoot() {
        return root;
    }

    private Node addHelper(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = addHelper(node.left, data);
        } else if (data > node.data) {
            node.right = addHelper(node.right, data);
        } else {
            return node;
        }

        return node;
    }

    public void add(int data) {
        root = addHelper(root, data);
    }

    private boolean containsHelper(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.data) {
            return true;
        }
        if (value < current.data) {
            return containsHelper(current.left, value);
        } else {
            return containsHelper(current.right, value);
        }
    }

    public boolean contains(int data) {
        return containsHelper(root, data);
    }

    private int findSmmalest(Node root) {
        if (root.left == null) {
            return root.data;
        } else {
            return findSmmalest(root.left);
        }
    }

    private Node deleteHelper(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.left == null) {
                return current.left;
            }
            if (current.right == null) {
                return current.right;
            } else {
                int smallestValue = findSmmalest(current.right);
                current.data = smallestValue;
                current.right = deleteHelper(current.right, smallestValue);
                return current;
            }

        }
        if (value < current.data) {
            current.left = deleteHelper(current.left, value);
            return current;
        }
        current.right = deleteHelper(current.right, value);
        return current;
    }

    public void delete(int data) {
        deleteHelper(root, data);
    }

    private void printHelper(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        printHelper(node.left);
        printHelper(node.right);
    }

    public void print() {
        printHelper(root);
    }

    public String print2(Node node) { //doesn't work :(
        StringBuilder sb = new StringBuilder();
//        if (node == null) {
//            return null;
//        }

        sb.append(node.data);

        if (node.left != null) {
            return print2(node.left);
        }
        if (node.right != null) {
            return print2(node.right);
        }

        return sb.toString();

    }
}
