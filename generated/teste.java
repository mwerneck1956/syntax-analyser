import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q;
        int w;
        int n;

        n = 13;

        q = 5;
        divMod(n, q);
        w = (int) returnsList.get(1);

        z = 2 * w + 1;
        System.out.print('Z');
        System.out.print(':');
        System.out.print(z);
        System.out.print('\n');
    }

    public static void divMod(int n, int q) {
        returnsList.clear();
        returnsList.add(n / q);
        returnsList.add(n % q);
        return;
    }
}