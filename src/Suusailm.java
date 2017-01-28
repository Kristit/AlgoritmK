/**
 * Created by kristitammet on 25/01/2017.
 *
 *
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */

public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

            doIt(kraadid1);
            doIt(kraadid2);
        }

        private static void doIt(int[] array) {
            int positiveCount = 0;
            int negativeCount = 0;
            for (int i : array) {
                if (i > 0) {
                    positiveCount++;
                }
                if (i < 0) {
                    negativeCount++;
                }
            }
            System.out.println("Positiivseid temperatuure on rohkem: " + (positiveCount-negativeCount));
        }
    }