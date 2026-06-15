import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            int count = 0;
            for(int i = 1; i<n; i++){
                if((Math.abs(arr[i-1]-arr[i]) & 1) != 1){
                    count += 1;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}