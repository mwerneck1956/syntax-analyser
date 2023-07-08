import java.util.ArrayList;
import java.util.Scanner;


public class teste10 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void fibonacci(int n) {
            if(n < 1) {
                returnsList.clear();
                returnsList.add(n);
                return;
            } ;
            if(n == 1) {
                returnsList.clear();
                returnsList.add(n);
                return;
            } ;
            returnsList.clear();
            returnsList.add(fibonacci(n - 1);
             = (int) returnsList.get(0) + fibonacci(n - 2);
             = (int) returnsList.get(0));
            return;
    }

    public static void main(String[] args) {
        int v;
             fibonacci(5);
             v = (int) returnsList.get(0);
            System.out.print(v);
    }
}