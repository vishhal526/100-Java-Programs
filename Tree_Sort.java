
import java.util.*;

public class Tree_Sort {

    public static Node insert(Node root, int value) {

        if (root == null) {

            root = new Node(value);
            return root;

        } else if (root.value > value) {

            root.leftNode = insert(root.leftNode, value);
        } else {

            root.rightNode = insert(root.rightNode, value);

        }

        return root;

    }

    public static void TreeSort(Node root) {

        if (root == null) {
            return;
        }
        TreeSort(root.leftNode);
        System.out.print(root.value+" ");
        TreeSort(root.rightNode);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of Array = ");
        int len = s.nextInt();
        int[] a = new int[len];
        Node root = null;

        for (int i = 0; i < len; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            a[i] = s.nextInt();
            root = insert(root,a[i]);
        }

        System.out.print("Sorted Array = ");
        TreeSort(root);

    }
}

class Tree {

    
}

class Node {

    public int value;
    public Node rightNode;
    public Node leftNode;

    public Node(int val) {
        this.value = val;
        this.rightNode = this.leftNode = null;
    }

}
