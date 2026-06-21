import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            boolean flag = false;
            int a = -1, b = -1, c = -1;
            for(int i = 1; i<n-1; i++){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    flag = true;
                    a = i;
                    b = i + 1;
                    c = i + 2;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
                System.out.print(a + " " + b + " " + c);
                System.out.println();
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}