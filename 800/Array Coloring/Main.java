import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long sum = 0;
            for(int i = 0; i<n; i++){
                long val = sc.nextLong();
                sum += val;
            }
            if((sum & 1) == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}