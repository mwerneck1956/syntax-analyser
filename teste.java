import java.util.ArrayList;
import java.util.Scanner;

class Ponto {
    int a;
    float b;

    Ponto() {

    }
};

class Coordenada {
    Ponto a;
    Ponto b;

    Coordenada() {

    }
}

public class teste {
    static ArrayList<Object> returnsList = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static void sum(int x, int y) {
        returnsList.clear();
        returnsList.add(x + y);
        return;
    }

    public static void main(String[] args) {
        int a;
        Coordenada x;
        Coordenada[] y;

        x = new Coordenada();

        y = new Coordenada[10];
        sum(10, 30);
        a = (int) returnsList.get(0);
    }
}