import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr1 = new long[(int)n];
            List<Long> arr2 = new ArrayList<>();
            for(int i = 0; i<n; i++){
                arr1[i] = sc.nextLong();
                if(!arr2.isEmpty() && (arr2.get(arr2.size()-1)>arr1[i])){
                    arr2.add(arr1[i]);
                    arr2.add(arr1[i]);
                }else{
                    arr2.add(arr1[i]);
                }
            }
            System.out.println(arr2.size());
            for(long val: arr2){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}