import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int count_ones = 0, count_zeros = 0;
            for(int i =0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '1'){
                    count_ones++;
                }else{
                    count_zeros++;
                }
            }
            int ans = Math.min(count_ones, count_zeros);
            if((ans & 1) !=0){
                System.out.println("DA");
            }else{
                System.out.println("NET");
            }
        }
        sc.close();
    }
}