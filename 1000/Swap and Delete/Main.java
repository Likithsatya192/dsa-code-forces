import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            long count_one = 0, count_zero = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    count_zero++;
                }else{
                    count_one++;
                }
            }
            long length_t = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)=='0' && count_one>0){
                    count_one--;
                    length_t++;
                }else if(s.charAt(i)=='1' && count_zero>0){
                    count_zero--;
                    length_t++;
                }else{
                    break;
                }
            }
            System.out.println(s.length()-length_t);
        }
    }
}