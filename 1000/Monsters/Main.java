import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            List<long[]> arr = new ArrayList<>();
            for(int i = 0; i<n; i++){
                long val = sc.nextLong();
                arr.add(new long[]{val, i+1});
            }
            for(long[] val: arr){
                val[0] = val[0] % k;
                if(val[0] == 0) val[0] = k;
            }
            arr.sort((a,b) -> {
                if(a[0] != b[0]){
                    return Long.compare(b[0], a[0]);
                }
                return Long.compare(a[1], b[1]);
            });
            for(long[] val: arr){
                System.out.print(val[1] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}