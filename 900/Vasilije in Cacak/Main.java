import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long mini = (k * (k+1)/2);
            long maxi = ((n * (n+1))/2 - ((n-k) * (n-k+1))/2);
            if(x>=mini && x<=maxi){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}