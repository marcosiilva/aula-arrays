import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota: " + (i+1));
            notas[i] = sc.nextDouble();
        }

        double media = 0;

        for ( int i = 0; i < notas.length; i++) {
            media += notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        media = media/ notas.length;
        System.out.printf("Média final: %.2f", media);
    }
}
