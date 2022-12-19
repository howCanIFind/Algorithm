package infrearnJavaAlgorithm.recursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_말단노드까지의_가장_짧은_경로_BFS {
    static class Node {
        int data;
        Node lt, rt;
        public Node(int val) {
            data = val;
            lt = rt =null;
        }
    }
    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i=0; i<len; i++) {
                Node current = queue.poll();
                if (current.lt==null && current.rt==null) return level;
                if (current.lt!=null) queue.offer(current.lt);
                if (current.rt!=null) queue.offer(current.rt);
            }
            level++;
        }
        return 0;
    }
    Node root;
    public static void main(String[] args) {
        Tree_말단노드까지의_가장_짧은_경로_BFS tree = new Tree_말단노드까지의_가장_짧은_경로_BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
