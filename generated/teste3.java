import java.util.ArrayList;
import java.util.Scanner;


public class teste3 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] x;
        int i;
        int k;

            k = 4;

            x = new int[k];

            x[0] = 0;

            x[3] = 15;
            System.out.print(x[3]);
            System.out.print('\n');

            i = 0;

            for(int _a1 = 0; _a1 < k ; _a1 ++ ) {
                        if(i % 2 == 0) {

                                x[i] = 2 * i;
                        }  else {

                                x[i] = 2 * i + 1;
                        }


                        i = i + 1;
            }

            i = 0;
            System.out.print('{');
            if(0 < k) {
                    System.out.print(x[0]);

                    for(int _a2 = 0; _a2 < k - 1 ; _a2 ++ ) {
                                System.out.print(',');
                                System.out.print(x[i + 1]);

                                i = i + 1;
                    }
            } 
            System.out.print('}');
            System.out.print('\n');
    }
}