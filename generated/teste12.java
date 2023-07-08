import java.util.ArrayList;
import java.util.Scanner;


public class teste12 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void even(int n) {
            if(n == 0) {
                returnsList.clear();
                returnsList.add(n == 0);
                return;
            }  else {
                returnsList.clear();
                returnsList.add(odd(n - 1);
                 = (int) returnsList.get(0));
                return;
            }
        ;
    }

    public static void odd(int n) {
            if(n == 0) {
                returnsList.clear();
                returnsList.add(false);
                return;
            }  else {
                returnsList.clear();
                returnsList.add(even(n - 1);
                 = (int) returnsList.get(0));
                return;
            }
        ;
    }

    public static void main(String[] args) {
        boolean r;
             even(3);
             r = (boolean) returnsList.get(0);
            if(r) {
                    System.out.print('P');
                    System.out.print('A');
                    System.out.print('R');
            }  else {
                    System.out.print('I');
                    System.out.print('M');
                    System.out.print('P');
                    System.out.print('A');
                    System.out.print('R');
            }
        ;
    }
}