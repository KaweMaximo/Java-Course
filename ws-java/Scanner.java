import java.util.Locale;

public class Scanner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados Digitados: ");
        System.out.println(x); // MARIA
        System.out.println(y); // 30
        System.out.println(z); // 2.2

        sc.close();
    }
}
