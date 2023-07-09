import java.util.ArrayList;
import java.util.Scanner;


public class teste1 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int q;
        int res;
        int quo;
        int n;

            n = 13;

            q = 5;
            divMod(n, q);

            quo = (int) returnsList.get(0);
            res = (int) returnsList.get(1); 
            System.out.print('Q');
            System.out.print(':');
            System.out.print(quo);
            System.out.print('\n');
            System.out.print('R');
            System.out.print(':');
            System.out.print(res);
            System.out.print('\n');
    }

    public static void divMod(int n, int q) {
            returnsList.clear();
            returnsList.add(n / q);
            returnsList.add(n % q);
            return;
    }
}