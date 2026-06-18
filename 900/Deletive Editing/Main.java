import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String x = sc.next();
            String y = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i<y.length(); i++){
                map.put(y.charAt(i), map.getOrDefault(y.charAt(i), 0) + 1);
            }
            StringBuilder finalString = new StringBuilder();
            for(int i = x.length()-1; i>=0; i--){
                char ch = x.charAt(i);
                if(map.containsKey(ch)){
                    if(map.get(ch)>0){
                        map.put(ch, map.getOrDefault(ch, 0) - 1);
                        finalString.append(ch);
                    }
                }
            }
            if(finalString.reverse().toString().equals(y)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}