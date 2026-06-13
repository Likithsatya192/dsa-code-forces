import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long diff = Long.MAX_VALUE;
            long prev = sc.nextLong();
            for(int i = 1; i < n; i++) {
                long cur = sc.nextLong();
                diff = Math.min(diff, cur - prev);
                prev = cur;
            }
            if(diff<0) System.out.println(0);
            else{
                System.out.println(diff/2+1);
            }
        }
        sc.close();
    }
}