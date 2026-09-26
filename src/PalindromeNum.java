import java.util.Scanner;

public class PalindromeNum {
    static boolean isPalindrome(int num){
        int temp = num;
        int pal = 0;
        while(temp != 0){
            int k = temp%10;
            pal = pal*10 + k;
            temp = temp/10;
        }
        if(pal == num) return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
