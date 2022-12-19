package infrearnJavaAlgorithm.recursiveTreeGraph;

// 말단노드까지의 가장 짧은 경로는 BFS로 푸는게 맞음
public class Tree_말단노드까지의_가장_짧은_경로_DFS {
    static class Node {
        int data;
        Node lt, rt;
        public Node(int val) {
            data = val;
            lt = rt =null;
        }
    }

    public int DFS(int level, Node root) {
        if (root.lt==null && root.rt==null) return level;
        else return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
    }
    Node root;
    public static void main(String[] args) {
        Tree_말단노드까지의_가장_짧은_경로_DFS tree = new Tree_말단노드까지의_가장_짧은_경로_DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
