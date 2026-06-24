import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            long[] prefix = new long[(int)(n+1)];
            long[] suffix = new long[(int)(n+1)];
            for(int i = 1; i<=n; i++){
                set.add(s.charAt(i-1));
                prefix[i] = set.size();
            }
            set.clear();
            for(int i = (int)(n); i>=1; i--){
                set.add(s.charAt(i-1));
                suffix[i] = set.size();
            }
            long ans = 0L;
            for(int i = 0; i<n; i++){
                ans = Math.max(ans, prefix[i] + suffix[i+1]);
            }
            System.out.println(ans);
        }
    }
}