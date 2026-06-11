import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            HashMap<Long, Long> mpp = new HashMap<>();
            long n = sc.nextLong();
            for(int i = 0; i<n; i++){
                long arr = sc.nextLong();
                mpp.put(arr, mpp.getOrDefault(arr,0L)+1);
            }
            if(mpp.size()>=3){
                System.out.println("NO");
            }else{
                long freq1 = mpp.values().iterator().next();
                long freq2 = (long) mpp.values().toArray()[mpp.size()-1];
                if(freq1 == freq2){
                    System.out.println("YES");
                }else if(n%2==1 && Math.abs(freq1 - freq2)==1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}