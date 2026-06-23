import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            List<Long> secondLowest = new ArrayList<>();
            long firstMinimum = Long.MAX_VALUE;
            for(int i = 0; i<n; i++){
                long m = sc.nextLong();
                long[] arr = new long[(int)m];
                for(int j = 0; j<m; j++){
                    arr[j] = sc.nextLong();
                    firstMinimum = Math.min(firstMinimum, arr[j]);
                }
                Arrays.sort(arr);
                secondLowest.add(arr[1]);
            }
            long secondLowestSum = 0;
            for(long val: secondLowest){
                secondLowestSum += val;
            }
            Collections.sort(secondLowest);
            long answer = firstMinimum + (secondLowestSum - secondLowest.get(0));
            System.out.println(answer);
        }
        sc.close();
    }
}