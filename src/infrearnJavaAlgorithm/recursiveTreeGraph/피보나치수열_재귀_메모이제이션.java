package infrearnJavaAlgorithm.recursiveTreeGraph;

public class 피보나치수열_재귀_메모이제이션 {
    static int[] arr;
    public static int DFS(int n) {
        if (arr[n]>0) return arr[n];
        if (n==1) return arr[n]=1;
        else if (n==2) return arr[n]=1;
        else return arr[n] = DFS(n-2) + DFS(n-1);
    }
    public static void main(String[] args) {
        int n = 45;
        arr = new int[n+1];
        DFS(n);
        for (int i=1; i<=n; i++) System.out.println(arr[i] + " ");
    }
}
