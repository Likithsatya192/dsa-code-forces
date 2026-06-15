import java.util.*;
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
            Arrays.sort(arr);
            long maxi = arr[(int)n-1];
            long mini = arr[0];
            if(maxi == mini){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.print(maxi + " ");
                for(int i = 0; i<(int)n-1; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}