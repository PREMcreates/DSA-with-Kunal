import java.util.Scanner;

public class MaxMinInArr {
    static int[] function(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        return new int[] {max,min};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = function((arr));
        System.out.println("Maximum : " + result[0]);
        System.out.println("Minimum : " + result[1]);
    }
}
