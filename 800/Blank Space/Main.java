import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long maxi = 0, count = 0;
            for(int i = 0; i<n; i++){
                long val = sc.nextLong();
                if(val == 0){
                    count++;
                    maxi = Math.max(maxi, count);
                }else{
                    count = 0;
                }
            }
            System.out.println(maxi);
        }
        sc.close();
    }
}