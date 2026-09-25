import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String ans1 = "";
        for(int i=str1.length()-1; i>=0; i--){
            ans1 += str1.charAt(i);
        }
        System.out.println(ans1);

        String str2 = sc.nextLine();
        StringBuilder ans2 = new StringBuilder(str2).reverse();
        System.out.println(ans2);

    }
}
