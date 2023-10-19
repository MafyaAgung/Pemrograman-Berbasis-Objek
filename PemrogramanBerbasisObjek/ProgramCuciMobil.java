// Kelas Mobil
class Mobil {
    private String merek;
    
    public Mobil(String merek) {
        this.merek = merek;
    }
    
    public String getMerek() {
        return merek;
    }
    
    public void cuci() {
        System.out.println(merek + " sedang dicuci...");
    }
}

// Kelas MesinCuci
class MesinCuci {
    public void hidupkan() {
        System.out.println("Mesin cuci dinyalakan.");
    }
    
    public void matikan() {
        System.out.println("Mesin cuci dimatikan.");
    }
}

// Kelas ProgramCuciMobil
public class ProgramCuciMobil {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobilSaya = new Mobil("Toyota");
        
        // Membuat objek MesinCuci
        MesinCuci mesinCuci = new MesinCuci();
        
        // Menghidupkan mesin cuci
        mesinCuci.hidupkan();
        
        // Memulai mencuci mobil
        mobilSaya.cuci();
        
        // Mematikan mesin cuci
        mesinCuci.matikan();
    }
}
