import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt();
        }

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }

        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }

    }
}
