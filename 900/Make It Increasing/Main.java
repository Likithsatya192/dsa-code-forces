import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long ans = 0;
            long[] arr = new long[(int)n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            for(int i = (int)n-2; i>=0; i--){
                while(arr[i]>=arr[i+1]){
                    ans++;
                    arr[i] /= 2;
                    if(arr[i]==0){
                        break;
                    }
                }
                if(arr[i]==0 && arr[i+1]==0){
                    ans = -1;
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}