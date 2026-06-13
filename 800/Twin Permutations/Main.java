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
            for(int i = 0; i<n; i++){
                System.out.print(n + 1 - arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}