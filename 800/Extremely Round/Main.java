import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Long> arr = new ArrayList<>();
        for(int i = 1; i<=999999; i++){
            if(check(i)){
                arr.add((long)i);
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            int count = 0;
            for(long val: arr){
                if(val<=n){
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(count);
        }
    }
    private static boolean check(long x){
        int countDigits = 0;
        int countZeros = 0;
        while(x != 0){
            if(x % 10 == 0) countZeros++;
            countDigits++;
            x /= 10;
        }
        return countDigits - 1 == countZeros;
    }
}