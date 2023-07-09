import java.util.ArrayList;
import java.util.Scanner;

class Ponto {
    float x;
    float y;

    Ponto () {

    }
}

public class teste4 {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Ponto p;
        float x;
        float y;

            p = new Ponto();

            p.x = 10.0f;

            p.y = 10.0f;
            System.out.print('(');
            System.out.print(p.x);
            System.out.print(',');
            System.out.print(' ');
            System.out.print(p.y);
            System.out.print(')');
            System.out.print('\n');
    }
}