// Kelas pertama (InputPilihan.java)
import java.util.Scanner;

class InputPilihan {
    public int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka pertama:");
        int angka1 = scanner.nextInt();
        System.out.println("Masukkan angka kedua:");
        int angka2 = scanner.nextInt();
        return angka1 + angka2;
    }
}

// Kelas kedua (HitungTotal.java)
class HitungTotal {
    public int hitung(int angka1, int angka2) {
        return angka1 + angka2;
    }
}

// Kelas ketiga (Main.java)
public class CuciMobil {
    public static void main(String[] args) {
        InputPilihan inputPilihan = new InputPilihan();
        int total = inputPilihan.getInput();
        System.out.println("Total: " + total);
    }
}
