import java.util.Scanner;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputKalimat = input.nextLine().toLowerCase();
        char huruf = input.next().charAt(0);
        int jumlahMuncul = 0;

        for (int i = 0; i < inputKalimat.length(); i++){
            char huruf2 = inputKalimat.charAt(i);
            if (huruf2 == huruf){
                jumlahMuncul++;
            }
        }

        System.out.println(jumlahMuncul);
    }
}