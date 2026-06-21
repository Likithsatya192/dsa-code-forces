import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            List<Long> arr = new ArrayList<>();
            for(int i = 0; i<n*k; i++){
                arr.add(sc.nextLong());
            }
            long pointer = n*k;
            long sum = 0;
            while(k-- > 0){
                pointer -= (n/2+1);
                sum += arr.get((int)pointer);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}