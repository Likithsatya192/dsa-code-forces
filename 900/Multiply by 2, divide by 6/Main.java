import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long countof3 = 0, countof2 = 0;
            while(n>0 && n%3==0){
                countof3++;
                n/=3;
            }
            while(n>0&&n%2==0){
                countof2++;
                n/=2;
            }
            if(n>1 || countof2 > countof3){
                System.out.println(-1);
            }else{
                System.out.println(countof3 + (countof3 - countof2));
            }
        }
        sc.close();
    }
}