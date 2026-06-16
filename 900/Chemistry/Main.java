import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            String str = sc.next();
            int[] freq = new int[26];
            for(int i = 0; i<n; i++){
                freq[str.charAt(i)-'a']++;
            }
            int oddFrequency = 0;
            for(int i = 0; i<26; i++){
                oddFrequency += freq[i] % 2;
            }
            if(oddFrequency>k+1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}