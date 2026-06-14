import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            String str = sc.next();
            int i = 0, j = (int)n-1;
            while(i<=j){
                char left = str.charAt(i);
                char right = str.charAt(j);
                if(left != right){
                    i++;
                    j--;
                }else{
                    System.out.println((j - i + 1));
                    break;
                }
                
            }
            if(i>j){
                System.out.println(0);
            }
        }
        sc.close();
    }
}