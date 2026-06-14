import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            if(b>d){
                System.out.println(-1);
            }else{
                long val = d - b;
                a += val;
                b += val;
                if(a<c){
                    System.out.println(-1);
                }else{
                    val += a-c;
                    System.out.println(val);
                }
            }
        }
        sc.close();
    }
}