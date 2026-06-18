import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            long ans = arr[(int)n-1] - arr[0];
            for(int i = 1; i<n; i++){
                ans = Math.max(ans, arr[i] - arr[0]);
            }
            for(int i = 0; i<n-1; i++){
                ans = Math.max(ans, arr[(int)n-1]-arr[i]);
            }
            for(int i = 0; i<n-1; i++){
                ans = Math.max(ans, arr[i]-arr[i+1]);
            }
            System.out.println(ans);
        }
    }
}