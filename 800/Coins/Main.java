import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(k > n){
                System.out.println("No");
                continue;
            }
            if((n & 1)==0){
                System.out.println("Yes");
            }else{
                if((k & 1) == 0){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }
        }
        sc.close();
    }
}