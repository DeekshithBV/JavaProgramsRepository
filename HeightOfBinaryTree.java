import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class HeightOfBinaryTree {

    private static Node insert(Node root, int data){
        if (root == null)
            return new Node(data);
        else {
            Node cur;
            if (data <= root.data){
                cur = insert(root.left,data);
                root.left = cur;
            } else {
                cur = insert(root.right,data);
                root.right = cur;
            }
        }
        return root;
    }

    private static int height_binary_tree(Node root){
        if (root == null || root.left == null && root.right == null){
            return 0;
        } else {
            int leftDepth = height_binary_tree(root.left);
            int rightDepth = height_binary_tree(root.right);
            if (leftDepth > rightDepth){
                return leftDepth+1;
            } else {
                return rightDepth+1;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Node root = null;
        while (t-- > 0){
            int data = scanner.nextInt();
            root = insert(root,data);
        }
        scanner.close();
        System.out.println(height_binary_tree(root));
    }
}