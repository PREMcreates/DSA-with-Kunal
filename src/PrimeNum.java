import java.util.Scanner;

public class PrimeNum {
    static boolean isPrime(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0) count++;
        }
        if(count == 2) return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
}
