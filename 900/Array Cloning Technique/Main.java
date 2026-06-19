import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            HashMap<Long, Integer> map = new HashMap<>();
            for(int i = 0; i<n; i++){
                long val = sc.nextLong();
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
            long longestFrequency = 0;
            for(int val: map.values()){
                longestFrequency = Math.max(longestFrequency, val);
            }
            if(longestFrequency == n){
                System.out.println(0);
                continue;
            }
            long remaining = n - longestFrequency;
            long ans = 1;
            while(remaining!=0){
                if(remaining>=longestFrequency){
                    ans += longestFrequency;
                    remaining -= longestFrequency;
                    longestFrequency = n - remaining;
                    if(remaining!=0){
                        ans += 1;
                    }
                }else{
                    ans += remaining;
                    remaining = 0;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}