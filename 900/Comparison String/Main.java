import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            String str = sc.next();
            int open = 0, close = 0, ans = 0;
            for(int i = 0; i<n; i++){
                char ch = str.charAt(i);
                if(ch == '<'){
                    open++;
                    close = 0;
                }else{
                    close++;
                    open = 0;
                }
                ans = Math.max(ans, Math.max(open, close));
            }
            System.out.println(ans+1);
        }
        sc.close();
    }
}