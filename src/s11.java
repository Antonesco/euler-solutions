/**
 * Created by Electron on 15.05.2016.
 */
public class s11 {

    public static void main (String[] args){
        System.out.println(new s11().run());
    }

    public static final int number = 2000000;

    /*
    public static int simpleNumbers(int n) {
        if (n==1)
            return 0;
        for (int i = 2; i < n; i++)
            if (n%i==0){
                return 0;
            }
        return 1;
    }
    */

    public int simpleNumber(int num){


        if (num <= 1)
            return 0;
        if (num == 2 || num == 3)
            return 1;
        else {
            for (int i = 2; i*i <= num; i++){
                if(num % i == 0){
                    return 0;
                }else
                    return 1;
            }
        }
        return 1;
    }

    public String run(){
        int sum = 0;
        for (int i = 0; i < simpleNumber(number); i++){
            sum = sum + i;
        }
        return Integer.toString(sum);
    }

}
