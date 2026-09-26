import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String str){
        boolean ans = true;
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                ans = false;
                break;
            }
            start++;
            end--;
        }
        if(ans) return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));
    }
}
