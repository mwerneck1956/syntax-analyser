import java.util.ArrayList;
import java.util.Scanner;

public class teste9 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Object> f(int x) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        int y;

        y = 2 * x + 1;
        if (y < 10) {
            _returnList.add(y);
            _returnList.add(1.5f);
            return _returnList;
        } else {
            _returnList.add(y);
            _returnList.add(1.5f);
            return _returnList;
        }

    }

    public static void main(String[] args) {

        ArrayList<Object> _returnList = new ArrayList<Object>();

        float z;
        ArrayList<Object> _r1 = f(10);

        z = (float) _r1.get(1);
        ArrayList<Object> _r2 = f(10);

        h = 2 * (int) _r2.get(0);

    }
}