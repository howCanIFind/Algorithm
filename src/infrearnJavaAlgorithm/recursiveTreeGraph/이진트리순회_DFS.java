package infrearnJavaAlgorithm.recursiveTreeGraph;

public class 이진트리순회_DFS {
    static class Node {
        int data;
        Node lt, rt;
        public Node(int val) {
            data = val;
            lt = rt =null;
        }
    }

    public void DFS(Node root) {
        if (root == null) return;
        else {
            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
        }
    }
    Node root;
    public static void main(String[] args) {
        이진트리순회_DFS tree = new 이진트리순회_DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
