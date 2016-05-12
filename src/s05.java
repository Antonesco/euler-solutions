import java.math.BigInteger;

public class s05 {

    public static int gcd(int x, int y){
        if (x < 0 || y < 0)
            throw new IllegalArgumentException("Negative number");
        while ( y != 0){
            int z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

    private static BigInteger lcm(BigInteger x, BigInteger y){
        return x.divide(x.gcd(y)).multiply(y);
    }

    public String start(){
        BigInteger allLcm = BigInteger.ONE;
        for (int i = 1; i <= 20; i++)
            allLcm = lcm(BigInteger.valueOf(i), allLcm);
        return allLcm.toString();
    }

    public static void main (String[] args){
        System.out.println(new s05().start());
    }

}
