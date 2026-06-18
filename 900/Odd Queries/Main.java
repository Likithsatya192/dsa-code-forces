import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long q = sc.nextLong();
            long[] arr = new long[(int)n];
            arr[0] = sc.nextLong();
            for(int i = 1; i<n; i++){
                long val = sc.nextLong();
                arr[i] = val + arr[i-1];
            }
            while(q-- > 0){
                long l = sc.nextLong();
                long r = sc.nextLong();
                long k = sc.nextLong();
                long lenSum = l == 1? arr[(int)r-1]: arr[(int)r-1] - arr[(int)l-2];
                long len = r - l + 1;
                long removeSum = arr[(int)n-1]-lenSum;
                long addSum = removeSum + (len * k);
                if((addSum & 1) != 0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}