/**
 * Created by Electron on 12.05.2016.
 */
public class s06 {

    public static void main(String[] args){
        System.out.println(new s06().start());
    }

    private static final int N = 100;

    public String start(){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= N; i++){
            sum1 = sum1 + i;
            sum2 = sum2 + i * i;
        }
        return Integer.toString(sum1 * sum1 - sum2);
    }

}
