import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long q = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
                arr[i] = (arr[i]>q)?0:1;
            }
            long count_of_1 = 0;
            long ways = 0;
            for(int i = 0; i<n; i++){
                if(arr[i] ==1){
                    count_of_1++;
                }else{
                    if(count_of_1>=k){
                        long diff = count_of_1 - k + 1;
                        ways += (diff * (diff + 1)) / 2;
                    }
                    count_of_1 = 0;
                }
            }
            if(count_of_1>=k){
                long diff = count_of_1 - k + 1;
                ways += (diff * (diff + 1)) / 2;
            }
            System.out.println(ways);
        }
        sc.close();
    }
}