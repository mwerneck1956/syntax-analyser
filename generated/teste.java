import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static void fibonacci(int n) {
        if (n < 1) {
            returnsList.clear();
            returnsList.add(n);
            return;
        }
        ;
        if (n == 1) {
            returnsList.clear();
            returnsList.add(n);
            return;
        }
        ;
        fibonacci(n - 1);
        fibonacci(n - 2);
        returnsList.clear();
        returnsList.add((int) returnsList.get(0) + (int) returnsList.get(0));
        return;
    }

    public static void main(String[] args) {
        int v;
        fibonacci(5);

        v = (int) returnsList.get(0);
        System.out.print(v);
    }
}