import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            String str = sc.next();
            long count = 0;
            if(str.contains("...")){
                System.out.println(2);
            }else{
                for(int i = 0; i<str.length(); i++){
                    if(str.charAt(i) == '.'){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}