import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 3 Numero: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    public static int max(int valor_a, int valor_b, int valor_c){
        int aux;

        if(valor_a > valor_b && valor_a > valor_c){
            aux = valor_a;
        } else if (valor_b > valor_c ) {
            aux = valor_c;
        } else {
            aux = valor_c;
        }
        return aux;
    }

    public static void showResult(int higher){
        System.out.println("Higher = " + higher);
    }

}
