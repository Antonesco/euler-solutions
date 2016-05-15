/**
 * For instance we need find prime numbers
 */
public class s10 {

    public static void main(String[] args){
        System.out.println(new s10().start());
    }

    long maxNumber = 2000000;

    public String start(){
        int sum = 0;
        for (int i = 0; i < maxNumber; i++)
            sum = sum + i;
        return Long.toString(sum);
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return true;
    }
}
