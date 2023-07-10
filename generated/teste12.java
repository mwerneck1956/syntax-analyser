import java.util.ArrayList;
import java.util.Scanner;

public class teste12 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Object> even(int n) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        ArrayList<Object> _r1 = odd(n - 1);
        if (n == 0) {
            _returnList.add(n == 0);
            return _returnList;
        } else {
            _returnList.add((int) _r1.get(0));
            return _returnList;
        }

    }

    public static ArrayList<Object> odd(int n) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        ArrayList<Object> _r2 = even(n - 1);
        if (n == 0) {
            _returnList.add(false);
            return _returnList;
        } else {
            _returnList.add((int) _r2.get(0));
            return _returnList;
        }

    }

    public static void main(String[] args) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        boolean r;
        ArrayList<Object> _r3 = even(3);

        r = (boolean) _r3.get(0);
        if (r) {
            System.out.print('P');
            System.out.print('A');
            System.out.print('R');
        } else {
            System.out.print('I');
            System.out.print('M');
            System.out.print('P');
            System.out.print('A');
            System.out.print('R');
        }

    }
}