import java.util.ArrayList;
import java.util.Scanner;

class Ponto {
    int a;
    float b;
}

public class teste {
    static ArrayList returnsList = new ArrayList();
    static Scanner scanner = new Scanner(System.in);

    public static void sum(int x, int y) {
        int a = 5 + 3;
        int b = 10;
        returnsList.clear();
        returnsList.add(a);
        returnsList.add(b);
    }

    public static void main(String[] args) {
        int a = 10;
        sum(10, 20);
    }
}