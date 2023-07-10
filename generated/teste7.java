import java.util.ArrayList;
import java.util.Scanner;

public class teste7 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        Int[][] x;
        int i;
        int z;
        int k;

        k = 5;

        x = new int[][k];

        i = 0;

        for (int _a1 = 0; _a1 < k; _a1++) {

            x[i] = new int[k];

            i = i + 1;
        }

        i = 0;

        for (int _a2 = 0; _a2 < k; _a2++) {

            x[i][i] = 2 * i + 1;

            i = i + 1;
        }

        z = x[3][3];

    }
}