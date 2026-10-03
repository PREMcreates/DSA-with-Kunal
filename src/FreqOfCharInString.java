import java.util.Scanner;

public class FreqOfCharInString {
    static void FindFreq(String s){
        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                char ch = (char)(i+'a');
                System.out.println(ch+" "+freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        FindFreq(str);
    }
}
