import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int pos = 0, neg = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 1) pos++;
                else neg++;
            }

            int ans = 0;

            while (pos < neg) {
                pos++;
                neg--;
                ans++;
            }

            if (neg % 2 == 1) ans++;

            System.out.println(ans);
        }
    }
}