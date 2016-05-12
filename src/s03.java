/**
 * Created by Electron on 07.05.2016.
 */
public class s03 {

    public static void main (String[] args){
        System.out.println(new s03().start());
    }

    public double start() {
        double n = 600851475143L;
        while (true){
            double p = smallNumber(n);
            if (p < n){
                n /= p;
            }else{
                return n;
            }
        }
    }

    private static double smallNumber(double n){
        for (double i = 2, end = Math.sqrt(n); i <= end; i++){
            if (n % i == 0){
                return i;
            }
        }
        return n;
    }

}
