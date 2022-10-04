import java.util.Scanner;

public class For {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Numero de Loop Desejada: ");
        int N = sc.nextInt();

        int soma = 0;
        for(int i=0; i<N; i=i+1){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
    }
}
