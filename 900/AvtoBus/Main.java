import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(n<4 || (n&1)!=0){
                System.out.println(-1);
                continue;
            }
            long mini = (n+5)/6;
            long maxi = (n)/4;
            System.out.println(mini + " " + maxi);
        }
        sc.close();
    }
}