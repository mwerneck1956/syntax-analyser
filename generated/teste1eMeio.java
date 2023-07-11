import java.util.ArrayList;
import java.util.Scanner;


public class teste1eMeio {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int q;
        int w;
        int n;

            n = 13;

            q = 5;
            ArrayList<Object> _r1 =  divMod(n, q);

            w = (int) _r1.get(1);

            z = 2 * w + 1;
            System.out.print('Z');
            System.out.print(':');
            System.out.print(z);
            System.out.print('\n');


    }

    public static ArrayList<Object> divMod(int n, int q) {

         ArrayList<Object> _returnList = new ArrayList<Object>(); 

            _returnList.add(n / q);
            _returnList.add(n % q);

         return _returnList;

    }
}