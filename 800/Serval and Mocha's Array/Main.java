import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            boolean flag = false;
            long hcf = 0;
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            for(int i = 0; i<n-1; i++){
                for(int j = i+1; j<n; j++){
                    hcf = GCD(arr[i], arr[j]);
                    if(hcf<=2){
                        flag = true;
                    }
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
    private static long GCD(long a, long b){
        while(a!=0 && b != 0){
            if(a>b) a = a % b;
            else b = b % a;
        }
        return a == 0? b: a;
    }
}