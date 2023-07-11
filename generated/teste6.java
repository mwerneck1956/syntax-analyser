import java.util.ArrayList;
import java.util.Scanner;

class Ponto {
    int x;
    int y;

    Ponto() {

    }
}

public class teste6 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Object> printP(Ponto p) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        System.out.print('(');
        System.out.print(p.x);
        System.out.print(',');
        System.out.print(p.y);
        System.out.print(')');

        return _returnList;

    }

    public static ArrayList<Object> printV(Ponto[] v, int n) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        int i;
        System.out.print('{');
        if (0 < n) {
            ArrayList<Object> _r1 = printP(v[0]);

            i = 1;

            for (int _a2 = 0; _a2 < n - 1; _a2++) {
                System.out.print(',');
                ArrayList<Object> _r3 = printP(v[i]);

                i = i + 1;
            }
        }
        System.out.print('}');

        return _returnList;

    }

    public static ArrayList<Object> sort(Ponto[] v, int n) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        Ponto aux;
        int i;
        int j;

        i = 0;

        for (int _a4 = 0; _a4 < n - 1; _a4++) {

            j = i + 1;

            for (int _a5 = 0; _a5 < n - (i + 1); _a5++) {
                if (v[i].x < v[j].x) {

                    aux = v[i];

                    v[i] = v[j];

                    v[j] = aux;
                }

                j = j + 1;
            }

            i = i + 1;
        }

        return _returnList;

    }

    public static void main(String[] args) {

        Ponto[] p;
        int i;
        int k;

        k = 5;

        p = new Ponto[k];

        i = 0;

        for (int _a6 = 0; _a6 < k; _a6++) {

            p[i] = new Ponto();

            p[i].x = 12 + i;

            p[i].y = 12 - i;

            i = i + 1;
        }
        ArrayList<Object> _r7 = printV(p, k);

        ArrayList<Object> _r8 = sort(p, k);

        System.out.print('\n');
        ArrayList<Object> _r9 = printV(p, k);

        System.out.print('\n');

    }
}