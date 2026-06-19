import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            boolean ok = false;

            long actualA = 2*b - c;
            if(actualA > 0 && actualA % a == 0) ok = true;

            long actualB = a + c;
            if(actualB % 2 == 0) {
                long mid = actualB / 2;
                if(mid > 0 && mid % b == 0) ok = true;
            }

            long actualC = 2*b - a;
            if(actualC > 0 && actualC % c == 0) ok = true;

            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}