package infrearnJavaAlgorithm.greedy;

import java.util.Scanner;

public class 친구인가_Uion_find {
    static int[] unf;
    public static int Find(int v) {
        if (v==unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }

}
