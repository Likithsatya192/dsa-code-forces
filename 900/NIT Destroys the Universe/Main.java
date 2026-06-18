import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            long count = 0;
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
                if(arr[i] == 0){
                    count++;
                }
            }
            boolean flag = false;
            int left = 0, right = (int)n - 1;
            while(left<n && arr[left]==0){
                left++;
            }
            while(right>=0 && arr[right]==0){
                right--;
            }
            for(int i = left; i<=right; i++){
                if(arr[i] == 0){
                    flag = true;
                    break;
                }
            }
            if(count==n) System.out.println(0);
            else if(flag) System.out.println(2);
            else System.out.println(1);
        }
    }
}