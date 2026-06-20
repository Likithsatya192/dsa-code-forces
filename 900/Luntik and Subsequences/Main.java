import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            int count_ones = 0, count_zeros = 0;
            for(int i = 0; i<n; i++){
                long val = sc.nextLong();
                if(val == 0){
                    count_zeros++;
                }
                if(val == 1){
                    count_ones++;
                }
            }
            long ways = (1L<<count_zeros) * count_ones;
            System.out.println(ways);
        }
    }
}