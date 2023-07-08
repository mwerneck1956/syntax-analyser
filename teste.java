import java.util.ArrayList;
import java.util.Scanner;


public class teste {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int nlines;
        int i;

            nlines = 5 ;

            i = nlines ;

            for(int _a1 = 0; _a1 < nlines ; _a1 ++ ) {

                        for(int _a2 = 0; _a2 < i ; _a2 ++ ) {
                                    System.out.print('*');
                        };

                        i = i - 1 ;
                        System.out.print('\n');
            };
    }
}