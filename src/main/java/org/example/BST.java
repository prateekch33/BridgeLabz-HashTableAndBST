package org.example;

class MyBinaryNode<T extends Comparable<T>> {
    T val;
    MyBinaryNode<T> left;
    MyBinaryNode<T> right;

    public MyBinaryNode(T val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BST<T extends Comparable<T>> {
    MyBinaryNode<T> root;

    public BST() {
        root = null;
    }

    public void insert(T key) {
        root = insertRec(root, key);
    }

    private MyBinaryNode<T> insertRec(MyBinaryNode<T> node, T key) {
        if (node == null) {
            node = new MyBinaryNode<>(key);
            return node;
        }

        if (key.compareTo(node.val) < 0) {
            node.left = insertRec(node.left, key);
        } else if (key.compareTo(node.val) > 0) {
            node.right = insertRec(node.right, key);
        }

        return node;
    }
    private MyBinaryNode<T> search(MyBinaryNode<T> node, T key) {
        if (node == null || node.val == key) {
            return node;
        }

        if (key.compareTo(node.val) < 0) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    public boolean search(T key) {
        return search(root, key) != null;
    }
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        if(bst.search(63)){
            System.out.println("63 is Present");
        } else {
            System.out.println("63 is not Present");
        }
    }
}
