import java.util.Scanner;
class satu{
    String nama, alamat, jenispoli, namadr;
    int obat, vitamin, pendaftaran, dokter, pilih, dr;
    
    void datapasien(){
        System.out.println("Masukan Nama Pasien : "+ nama);
        System.out.println("Masukan Alamat Pasien : "+alamat);
    }
    void pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan Poli");
        System.out.println("1. Poli Gigi");
        System.out.println("2. Poli Anak");
        System.out.println("3. Poli Umum");
        pilih=input.nextInt();

        if (pilih==1){
                jenispoli="Poli Gigi";
        }
        else if (pilih==2){
                jenispoli="Poli Anak";
        }
        else if (pilih==3){
                jenispoli="Poli Umum";
        }
        else{
            System.out.println("Disini gak ada POLIGAMI Cuyy");
        }

        System.out.println("Pilihan Dokter");
        System.out.println("1. dr. Nikol");
        System.out.println("2. dr. Arie");
        System.out.println("3. dr. Agung");
        dr=input.nextInt();

        if (pilih==1){
                namadr="dr. Nikol";
        }
        else if (pilih==2){
                namadr="dr. Arie";
        }
        else if (pilih==3){
                namadr="dr. Agung";
        }
        else{
            System.out.println("Disini gak ada Dokternya Cuyy");
        }
    }
}
class dua
public class pasien {
    
}
