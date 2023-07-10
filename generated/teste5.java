import java.util.ArrayList;
import java.util.Scanner;

class Ponto {
    int x;
    int y;

    Ponto() {

    }
}

public class teste5 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        Ponto[] p;
        int i;
        int k;

        k = 5;

        p = new Ponto[k];

        i = 0;

        for (int _a1 = 0; _a1 < k; _a1++) {

            p[i] = new Ponto();

            p[i].x = 12 + i;

            p[i].y = 12 - i;

            i = i + 1;
        }
        System.out.print('\n');

    }
}