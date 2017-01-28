import java.util.Arrays;

/**
 * Created by kristitammet on 25/01/2017.
 */
public class PikadSonad {
    public static void main(String[] args) {

        int summa=0;

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"};
        System.out.println(Arrays.toString(naide));


        for (int i = 0; i <naide.length ; i++) {
            naide[i].length();
            System.out.println(naide[i].length());

            summa += naide[i].length();
        }

        double keskmine = summa/naide.length;

        System.out.println("Massiivi keskmine on: " +keskmine);

        int vastus = 0;

        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length() > keskmine) {
                vastus++;
            }
        }
        System.out.println("Massiivi keksmisest on " + vastus+ " sona pikemad");
    }
}
