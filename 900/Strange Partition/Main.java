import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long maxi = 0, mini = 0;
            for(int i = 0; i<n; i++){
                long val = sc.nextLong();
                maxi += Math.ceil(val * 1.0 / x);
                mini += val;
            }
            mini = (long)Math.ceil(mini * 1.0 / x);
            System.out.println(mini + " " + maxi);
        }
        sc.close();
    }
}