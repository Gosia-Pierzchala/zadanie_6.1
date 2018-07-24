import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(100);
        }

        for (int i = 0; i < tablica.length * 2; i++){
            if(i < tablica.length){
                System.out.print(tablica[i] + " ");
            } else {
                int x = tablica.length - (i - tablica.length) - 1;
                System.out.print(tablica[x] + " ");
            }
        }

    }
}




