package tombok;

import java.util.*;

public class TombAlapok {
    public static void main(String[] args) {
        int[] tomb = new int[10];
        tomb[0] = 5;
        Random r = new Random();


        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = r.nextInt(20);
        }
        System.out.println(Arrays.toString(tomb));

        for(int i = 0; i<tomb.length; i++){
            for(int j = 0; j<tomb.length; j++){
                int temp = 0;
                if(tomb[j] > tomb[i]){
                    temp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tomb));
        Scanner be = new Scanner(System.in);
        int szam = be.nextInt();
            System.out.println(Arrays.binarySearch(tomb, szam)==-1?"nincs benne":"Benne van");

    }
}
