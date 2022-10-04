import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0){
            x = sc.nextInt();
            System.out.println("Numero Digitado Diferente de 0");
        }

        System.out.println("Done!!! \nNumero Certo!!!");
        sc.close();
    }
}
