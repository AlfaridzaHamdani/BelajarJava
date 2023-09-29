import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner Calc = new Scanner(System.in);
        int a;
        int b;
        int hasil;
        int input;

        System.out.println("Masukan Angka Pertama: ");
        a = Calc.nextInt();
        System.out.println("Masukan Angka Kedua: ");
        b = Calc.nextInt();
        System.out.println("Masukan Operasi Yang Akan Dilakukan: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        input = Calc.nextInt();

        switch (input){
            case 1:
                hasil = a + b;
                System.out.println("Hasil dari " + a + " + " + b + " = " + hasil);
                break;
            case 2:
                hasil = a - b;
                System.out.println("Hasil dari " + a + " - " + b + " = " + hasil);
                break;
            case 3:
            hasil = a * b;
                System.out.println("Hasil dari " + a + " * " + b + " = " + hasil);
                break;
            case 4:
            hasil = a / b;
                System.out.println("Hasil dari " + a + " : " + b + " = " + hasil);
                break;
            case 5:
                hasil = a % b;
                System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
                break;
            default:
            System.out.println("Angka yang anda masukan salah.");
        }

        
    }
}
