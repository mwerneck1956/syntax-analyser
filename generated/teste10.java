import java.util.ArrayList;
import java.util.Scanner;

public class teste10 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Object> fibonacci(int n) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        if (n < 1) {
            _returnList.add(n);
            return _returnList;
        }
        if (n == 1) {
            _returnList.add(n);
            return _returnList;
        }
        ArrayList<Object> _r1 = fibonacci(n - 1);
        ArrayList<Object> _r2 = fibonacci(n - 2);
        _returnList.add((int) _r1.get(0) + (int) _r2.get(0));

        return _returnList;
    }

    public static void main(String[] args) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        int v;
        ArrayList<Object> _r3 = fibonacci(6);

        v = (int) _r3.get(0);
        System.out.print(v);

    }
}