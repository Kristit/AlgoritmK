import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by kristitammet on 25/01/2017.
 * * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */

public class KuulusNumber {

    public static void main(String[] args) {
        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        int counter=0, max=0, maxnumber=0;
        HashMap map = new HashMap();

        for (int i=0;i<naide.length;i++) {
            if (naide[i] != 3) {
                int number = naide[i];
                for (int j = 0; j < naide.length; j++) {
                    if (naide[j] == number) {
                        counter++;
                    }
                }

                map.put(number,counter);
                if (counter>max){
                    max=counter;
                    maxnumber=number;
                }
                counter=0;
            }
        }
        System.out.println(maxnumber);
    }
}


