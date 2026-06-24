import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] a = new long[(int)n];
            for(int i = 0; i<n; i++){
                a[i] = sc.nextLong();
            }
            long[] b = new long[(int)n];
            for(int i = 0; i<n; i++){
                b[i] = sc.nextLong();
            }
            long count = 1;
            long[] substringA = new long[(int)(2*n+1)];
            long[] substringB = new long[(int)(2*n+1)];
            for(int i = 1; i<n; i++){
                if(a[i] == a[i-1]){
                    count++;
                }else{
                    substringA[(int)a[i-1]] = Math.max(substringA[(int)a[i-1]], count);
                    count = 1;
                }
            }
            substringA[(int)a[(int)(n-1)]] = Math.max(substringA[(int)a[(int)(n-1)]], count);
            count = 1L;
            for(int i = 1; i<n; i++){
                if(b[i] == b[i-1]){
                    count++;
                }else{
                    substringB[(int)b[i-1]] = Math.max(substringB[(int)b[i-1]], count);
                    count = 1;
                }
            }
            substringB[(int)b[(int)(n-1)]] = Math.max(substringB[(int)b[(int)(n-1)]], count);
            long maxi = Long.MIN_VALUE;
            for(int i = 0; i<=2*n; i++){
                maxi = Math.max(maxi, substringA[i] + substringB[i]);
            }
            System.out.println(maxi);
        }
        sc.close();
    }
}