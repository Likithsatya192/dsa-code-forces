import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            ArrayList<Long> lst = new ArrayList<>();
            lst.add(0L);
            for(long i = 0; i<n; i++){
                long val = sc.nextLong();
                lst.add(val);
            }
            lst.add(x);
            long btw = Long.MIN_VALUE;
            for(int i = 1; i<lst.size(); i++){
                if(i==lst.size()-1){
                    btw = Math.max(btw, 2 * (lst.get(i) - lst.get(i-1)));
                }
                else{
                    btw = Math.max(btw, lst.get(i) - lst.get(i-1));
                }
            }
            System.out.println(btw);
        }
        sc.close();
    }
}