import java.util.Scanner;

public class MissingNumINRange {
    static int FindNum(int[] arr){
        int ans = 0;
        int n = arr.length;
        int[] freq = new int[n+1];
        for(int num: arr){
            freq[num]++;
        }
        for(int i=0; i<=n; i++){
            if(freq[i] == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(FindNum(arr));
    }
}
