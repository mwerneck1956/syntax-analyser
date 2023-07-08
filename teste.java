import java.util.ArrayList;
import java.util.Scanner;

class Ponto {
    int x;
    int y;
}

public class teste {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void mult(int x, int y) {
        Ponto a;
        int res;
         a = new Ponto();
         res = (x + y)  + 10;
        returnsList.clear();
        returnsList.add(res) ;
        returnsList.add(a) ;
    }

    public static void sum(int a, int b) {
        int sumRes;
         sumRes = a + b;
        returnsList.clear();
        returnsList.add(sumRes) ;
    }

    public static void main(String[] args) {
        int a;
        int c;
         a = 10;
        mult(10, 20);

         a = (int) returnsList.get(0) ;
        sum(50, 30);

         c = (int) returnsList.get(0) ;
        System.out.print(c);
    }
}