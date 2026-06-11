import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long sum = 0;
            for(int i = 0; i<n-1; i++){
                long val = sc.nextLong();
                sum += val;
            }
            System.out.println(-1L * sum);
        }
        sc.close();
    }
}