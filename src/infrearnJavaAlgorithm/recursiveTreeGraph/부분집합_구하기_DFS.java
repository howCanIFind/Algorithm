package infrearnJavaAlgorithm.recursiveTreeGraph;

public class 부분집합_구하기_DFS {
    static int n;
    static int[] ch;
    public static void DFS(int L) {
        if (L==n+1) {
            String tmp = "";
            for (int i=1; i<=n; i++) {
                if (ch[i]==1) tmp += (i+" ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1; // 사용한다
            DFS(L+1);
            ch[L] = 0; // 사용하지 않는다
            DFS(L+1);
        }
    }
    public static void main(String[] args) {
        n = 3;
        ch = new int[n+1];
        DFS(1);

    }
}
