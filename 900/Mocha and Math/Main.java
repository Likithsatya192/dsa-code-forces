import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long total_end = sc.nextLong();
            for(int i = 1; i<n; i++){
                long val = sc.nextLong();
                total_end &= val;
            }
            System.out.println(total_end);
        }
        sc.close();
    }
}