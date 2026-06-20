import java.util.*;

public class Main {

    static int solve(String s, String target) {
        int n = s.length();

        for (int j = n - 1; j >= 0; j--) {
            if (s.charAt(j) == target.charAt(1)) {

                for (int i = j - 1; i >= 0; i--) {
                    if (s.charAt(i) == target.charAt(0)) {

                        return (j - i - 1) + (n - j - 1);
                    }
                }
            }
        }

        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int ans = Integer.MAX_VALUE;

            ans = Math.min(ans, solve(s, "00"));
            ans = Math.min(ans, solve(s, "25"));
            ans = Math.min(ans, solve(s, "50"));
            ans = Math.min(ans, solve(s, "75"));

            System.out.println(ans);
        }

        sc.close();
    }
}