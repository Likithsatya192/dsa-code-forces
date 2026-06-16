import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dx = {-1,1,-1,1};
        int[] dy = {-1,-1,1,1};
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long kingX = sc.nextLong();
            long kingY = sc.nextLong();
            long queenX = sc.nextLong();
            long queenY = sc.nextLong();
            Set<Pair> kingHits = new HashSet<>();
            Set<Pair> queenHits = new HashSet<>();
            for(int i = 0; i<4; i++){
                kingHits.add(new Pair(kingX + a * dx[i], kingY + b * dy[i]));
                kingHits.add(new Pair(kingX + b * dx[i], kingY + a * dy[i]));
                queenHits.add(new Pair(queenX + a * dx[i], queenY + b * dy[i]));
                queenHits.add(new Pair(queenX + b * dx[i], queenY + a * dy[i]));
            }
            int ans = 0;
            for(Pair val: kingHits){
                if(queenHits.contains(val)){
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
    static class Pair {
		long x, y;

		Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Pair pair = (Pair) o;
			return x == pair.x && y == pair.y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
	}
}