import java.util.Arrays;

public class X {

    public static void main(String[] args) {
        String[][] x = new String[13][7];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if ((i % 2 == 0)) {
                    if (j == (i / 2) ) {
                        x[i][j] = ("X");
                    }
                    else {
                        x[i][j] = (" ");
                    }
                } else {
                    x[i][j] = (" ");
                }
            }
            x [0] [6] = x [0] [0];
            x [2] [5] = x [2] [1];
            x [4] [4] = x [4] [2];
            x [8] [2] = x [8] [4];
            x [10] [1] = x [10] [5];
            x [12] [0] = x [12] [6];
            System.out.println(Arrays.toString(x[i]).replaceAll(",", "").replaceAll("\\[", "").replaceAll("\\]", ""));
        }
    }
}


