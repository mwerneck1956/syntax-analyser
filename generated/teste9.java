import java.util.ArrayList;
import java.util.Scanner;


public class teste9 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void f(int x) {
        int y;

            y = 2 * x + 1;
            if(y < 10) {
                returnsList.clear();
                returnsList.add(y);
                returnsList.add(1.5f);
                return;
            }  else {
                returnsList.clear();
                returnsList.add(y);
                returnsList.add(1.5f);
                return;
            }

    }

    public static void main(String[] args) {
        float z;
            f(10);

            z = (float) returnsList.get(1);
            f(10);

            h = 2 * (int) returnsList.get(0);
    }
}