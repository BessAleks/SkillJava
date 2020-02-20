import java.util.Arrays;

public class Xnew {
    public static void main(String[] args) {
        String[][] x = new String[7][7];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                if ((i == j) || i + j == x.length - 1){
                    x[i][j] = ("X");
                }
                else {
                    x[i][j] = (" ");
                }
            }
            System.out.println(Arrays.toString(x[i]).replaceAll(",", "").replaceAll("\\[", "").replaceAll("\\]", ""));
            System.out.println();
        }
    }
}
