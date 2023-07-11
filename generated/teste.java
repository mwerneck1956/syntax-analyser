import java.util.ArrayList;
import java.util.Scanner;


public class teste {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

          ArrayList<Object> _returnList = new ArrayList<Object>(); 

        int q;
        int res;
        int quo;
        int n;

            n = 13;

            q = 5;
            ArrayList<Object> _r1 =  divMod(n, q);

            quo = (int) _r1.get(0);
            res = (int) _r1.get(1); 
            System.out.print('Q');
            System.out.print(':');
            System.out.print(quo);
            System.out.print('\n');
            System.out.print('R');
            System.out.print(':');
            System.out.print(res);
            System.out.print('\n');

          return _returnList; 

    }

    public static ArrayList<Object> divMod(int n, int q) {

          ArrayList<Object> _returnList = new ArrayList<Object>(); 

            _returnList.add(n / q);
            _returnList.add(n % q);

          return _returnList; 

    }
}