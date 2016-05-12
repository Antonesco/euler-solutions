/**
 * Created by Electron on 05.05.2016.
 */
public class s02 {

    public static void main (String[] args){
        System.out.println(new s02().start());
    }

    /*
     *We have 3 position's of numbers
     */
    public String start() {
        int sum = 0;
        int cur = 1;
        int next = 2;

        while (cur <= 4000000) {
            if (cur % 2 == 0)
                sum += cur;
            int z = cur + next;
            cur = next;
            next = z;
        }
        return Integer.toString(sum);
    }

}
