import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            String x = sc.next();
            String y = sc.next();
            if(x.equals(y)){
                System.out.println(0);
            }else{
                int count = 0;
                while(!x.contains(y) && count<=5){
                    x += x;
                    count += 1;
                }
                if (x.contains(y))
                    System.out.println(count);
                else
                    System.out.println(-1);
            }
        }
        sc.close();
    }
}