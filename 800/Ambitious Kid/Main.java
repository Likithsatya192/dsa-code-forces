import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mini = Long.MAX_VALUE;
        for(int i = 0; i<n; i++){
            long val = sc.nextLong();
            mini = Math.min(mini, Math.abs(val));
        }
        System.out.println(mini);
        sc.close();
    }
}