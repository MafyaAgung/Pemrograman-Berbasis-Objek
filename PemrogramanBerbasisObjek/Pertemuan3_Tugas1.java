package Semester_5.PemrogramanBerbasisObjek;

import java.util.Scanner; 
class hitunglingkaran{
    static double phi=3.14; // static // non static    
    double jarjar;
    double keliling(){
        double keliling;
        keliling = 2*jarjar*phi;
        return keliling;
    }
    double luas(){
        double luas;
        luas=phi*jarjar*jarjar; 
        return luas;
    }
}
public class jarjar {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //double phi=3.14;
    System.out.print("Masukkan Angka Jari-Jari = ");
    hitunglingkaran abc = new hitunglingkaran();
    abc.jarjar = input.nextDouble();
    //double keliling = 2*jarjar*phi;
    //double luas = phi*jarjar*jarjar;
    System.out.println("berikut adalah hasil kalkulasi = "+ abc.keliling());
    System.out.print("berikut adalah hasil kalkulasi = "+ abc.luas());

    }
}