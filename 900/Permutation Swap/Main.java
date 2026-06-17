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
            int k = (int)Math.abs(arr[0]-1);
            for(int i = 1; i<n; i++){
                k = GCD(k, (int)Math.abs(arr[i] - (i+1)));
            }
            System.out.println(k);
        }
        sc.close();
    }
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b, a % b);
    }
}