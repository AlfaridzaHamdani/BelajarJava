import java.util.Scanner;

public class menghitungJumlahHurufVokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahVokal = 0;
        int total;

        String kalimat = input.next().toLowerCase();

        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            } else {

            }
        }

        total = kalimat.length() - jumlahVokal;

        System.out.println("Jumlah konsonan : " + total);
        System.out.println("Jumlah vokal : " + jumlahVokal);

        if (total >= jumlahVokal) {
            System.out.println("Konsonan lebih banyak atau sama");
        } else {
            System.out.println("Vokal lebih banyak");
        }

        input.close();
    }
}
