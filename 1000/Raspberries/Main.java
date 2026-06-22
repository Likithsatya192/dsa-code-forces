import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                ans = Math.min(ans, (k - a[i] % k) % k);
            }

            if (k == 4) {
                int even = 0;

                for (int x : a) {
                    if (x % 2 == 0) even++;
                }

                if (even >= 2) ans = 0;
                else if (even == 1) ans = Math.min(ans, 1);
                else ans = Math.min(ans, 2);
            }

            System.out.println(ans);
        }
    }
}