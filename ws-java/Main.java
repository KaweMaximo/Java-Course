import java.util.Locale;

public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        // Print Normal no Terminal
        System.out.println("Olá Mundo\n");

        System.out.println("==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
        int idade = 18;
        System.out.print("Variavel Definido como: ");
        System.out.println(idade);
        System.out.printf("Tenho %d anos",(idade));
        System.out.println("\n==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==\n");

        System.out.println("\n==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
        double metros = 10.925152;
        System.out.printf("O Metros é: %.2f\n",metros);
        System.out.printf("O Metros é: %.4f\n",metros);
        System.out.println("ConcString -- RESULTADO = " + metros + " METROS");
        System.out.printf("VarString -- RESULTADO = %f METROS", metros);
        System.out.println("\n==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==\n");

        System.out.println("\n==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==\n");
        String nome = "Kawe Maximo";
        int idade2 = 19;
        double renda = 2500.0;
        System.out.printf("%s tem %d Anos e Ganha R$ %.2f Reais\n", nome, idade2, renda);
        System.out.println("\n==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==\n");
    }
}