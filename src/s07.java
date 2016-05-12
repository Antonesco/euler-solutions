/**
 * Created by Electron on 12.05.2016.
 */
public class s07 {

    public static void main(String[] args){
        System.out.println(new s07().start());
    }

    public String start(){
        for (int i = 2, count = 0; ; i++) {
            if (isPrime(i)){
                count ++;
                if (count == 10001)
                    return Integer.toString(i);
            }
        }
    }

    public static boolean isPrime(int num){
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i +=2)
            if (num % i == 0) return false;
        return true;
    }

}
