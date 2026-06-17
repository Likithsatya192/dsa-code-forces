import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            int counter = 1;
            int maxi = 1;
            for(int i = 1; i<n; i++){
                if(arr[i]-arr[i-1]<=k){
                    counter++;
                }else{
                    counter = 1;
                }
                maxi = Math.max(maxi, counter);
            }
            System.out.println(n-maxi);
        }
        sc.close();
    }
}