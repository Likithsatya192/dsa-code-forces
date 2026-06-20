import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println("0 0");
                continue;
            }

            long d = Math.abs(a - b);
            long rem = a % d;

            System.out.println(d + " " + Math.min(rem, d - rem));
        }
    }
}