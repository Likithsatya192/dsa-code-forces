import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            long xor = 0;
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
                xor ^= arr[i];
            }
            long xor2 = 0;
            for(int i = 0; i<n; i++){
                long val = xor ^ arr[i];
                xor2 ^= val;
            }
            if(xor2!=0){
                System.out.println(-1);
            }else{
                System.out.println(xor);
            }
        }
        sc.close();
    }
}