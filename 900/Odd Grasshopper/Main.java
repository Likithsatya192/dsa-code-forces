import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();

            long r = n % 4;

            if ((x & 1) == 0) {
                if (r == 1) x -= n;
                else if (r == 2) x += 1;
                else if (r == 3) x += n + 1;
            } else {
                if (r == 1) x += n;
                else if (r == 2) x -= 1;
                else if (r == 3) x -= (n + 1);
            }

            System.out.println(x);
        }

        sc.close();
    }
}