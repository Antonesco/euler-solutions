public class s09 {

    public static void main (String[] args){
        System.out.println(new s09().run());
    }

    private static int number = 1000;

    /**
     * Method for calculate equal numbers until 1000
     * @return Assertion Error
     */
    public String run(){
        for (int i = 1; i < number; i++){
            for (int j = i + 1; j < number; j++){
                int k = number - i - j;
                if (i * i + j * j == k * k){
                    return Integer.toString(i * j * k);
                }
            }
        }
        throw new AssertionError("Not found");
    }



}
