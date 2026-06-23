import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long p = sc.nextLong();
            long[] a = new long[(int)n];
            long[] b = new long[(int)n];
            for(int i = 0; i<n; i++){
                a[i] = sc.nextLong();
            }
            for(int i = 0; i<n; i++){
                b[i] = sc.nextLong();
            }
            List<Pair> arr = new ArrayList<>();
            for(int i = 0; i<n; i++){
                arr.add(new Pair(b[i], a[i]));
            }
            Collections.sort(arr, Comparator.comparingLong(x -> x.cost));
            long minimumCost = p;
            long alreadyShared = 1;
            for(Pair x: arr){
                long canBeShared = x.share;
                long sharingCost = x.cost;
                if(sharingCost>=p){
                    break;
                }
                if(alreadyShared + canBeShared > n){
                    minimumCost += (n-alreadyShared)*sharingCost;
                    alreadyShared = n;
                    break;
                }else{
                    minimumCost += canBeShared * sharingCost;
                    alreadyShared += canBeShared;
                }
            }
            minimumCost += (n-alreadyShared)*p;
            System.out.println(minimumCost);
        }
        sc.close();
    }
}
class Pair {
    public long cost;
    public long share;
    public Pair(long cost, long share){
        this.cost = cost;
        this.share = share;
    }
}