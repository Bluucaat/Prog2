package tombok;

import java.util.Arrays;

public class ketDimenzios {
    public static void main(String[] args) {
        int[][] ketd = new int[5][5];
        for (int i = 0; i < ketd.length; i++) {
            for (int j = 0; j < ketd.length; j++) {
                if (i >= j) {
                    ketd[i][j] = 1;
                } else {
                    ketd[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < ketd.length; i++) {
            System.out.println(Arrays.toString(ketd[i]));
        }

    }
}
