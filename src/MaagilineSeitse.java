import java.util.ArrayList;

/**
 * Created by kristitammet on 25/01/2017.
 */
public class MaagilineSeitse {
    public static void main(String[] args) {


        //teen ArrayListi kuhu salvestan need saadud seitsmed
        ArrayList<Integer> kahekordsedseitsmed = new ArrayList<>();

        int[] massiiv = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        // kain massivi listi labi ja otsin seitsmeid
        for (int i = 0; i < massiiv.length; i++) {
            if (massiiv[i] == 7) {
                int seitseKordaKaks = massiiv[i] * 2;

                //lisan selle kohe oma uute ArrayListi
                kahekordsedseitsmed.add(seitseKordaKaks);
            } else {
                kahekordsedseitsmed.add(massiiv[i]);
            }

        }
        System.out.println("Uus massiiv on: " + kahekordsedseitsmed);

        // Nuud leian Summa (Youtube Bucki naide)

        int l = 0;
        double summa = 0;
        //While loop teeb uhte ja sama asj anii mitu x on tingimuse soeldud!

        while (l < kahekordsedseitsmed.size()) {
            summa = summa + kahekordsedseitsmed.get(l);
            l++;
        }
        System.out.println(summa);

        double keskmine = summa / kahekordsedseitsmed.size();
        System.out.println(keskmine);
    }

}
