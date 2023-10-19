import java.util.Scanner;

class Pasien {
    String nama;
    String alamat;

    public Pasien(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
}

class Poli {
    String[] daftarDokter = {
        "drg. Ahmad Affandi",
        "dr. Arif Wicaksono",
        "dr. Alfia Putri"
    };

    public void tampilkanDokter() {
        System.out.println("----------------------------------");
        System.out.println("Daftar Dokter");
        for (int i = 0; i < daftarDokter.length; i++) {
            System.out.println((i + 1) + ". " + daftarDokter[i]);
        }
        System.out.println("----------------------------------");
    }
}

public class Case_Kelompok_baru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Pasien : ");
        String namaPasien = input.nextLine();
        System.out.print("Masukkan Alamat Pasien : ");
        String alamatPasien = input.nextLine();

        Pasien pasien = new Pasien(namaPasien, alamatPasien);

        System.out.println("----------------------------------");
        System.out.println("Pilihan Poli:");
        System.out.println("1. Poli Gigi");
        System.out.println("2. Poli Anak");
        System.out.println("3. Poli Umum");
        System.out.print("Pilih Poli : ");
        int pilihanPoli = input.nextInt();

        Poli poli = new Poli();
        poli.tampilkanDokter();

        System.out.print("Pilih Dokter : ");
        int pilihanDokter = input.nextInt();

        System.out.print("Masukkan Biaya Pendaftaran : Rp. ");
        int biayaPendaftaran = input.nextInt();
        System.out.print("Masukkan Biaya Obat : Rp. ");
        int biayaObat = input.nextInt();
        System.out.print("Masukkan Biaya Vitamin : Rp. ");
        int biayaVitamin = input.nextInt();
        System.out.print("Masukkan Biaya Dokter : Rp. ");
        int biayaDokter = input.nextInt();

        int biayaTotal = biayaPendaftaran + biayaObat + biayaVitamin + biayaDokter;

        System.out.println("==================================");
        String poliDipilih = "";
        switch (pilihanPoli) {
            case 1:
                poliDipilih = "Gigi";
                break;
            case 2:
                poliDipilih = "Anak";
                break;
            case 3:
                poliDipilih = "Umum";
                break;
            default:
                poliDipilih = "Poli Tidak Valid";
                break;
        }

        System.out.println("Poli yang dipilih : " + poliDipilih);
        System.out.println("Dokter yang menangani : " + poli.daftarDokter[pilihanDokter - 1]);
        System.out.println("Biaya Pendaftaran : Rp. " + biayaPendaftaran);
        System.out.println("Biaya Obat        : Rp. " + biayaObat);
        System.out.println("Biaya Vitamin     : Rp. " + biayaVitamin);
        System.out.println("Biaya Dokter      : Rp. " + biayaDokter);
        System.out.println("Biaya Pembayaran  : Rp. " + biayaTotal);

        input.close();
    }
}