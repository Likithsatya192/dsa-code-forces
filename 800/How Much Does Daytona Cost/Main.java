import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            boolean flag = false;
            for(int i = 0; i<n; i++){
                long val = sc.nextLong();
                if(val==k){
                    flag = true;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}