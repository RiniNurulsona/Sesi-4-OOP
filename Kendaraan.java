public class Kendaraan {
    String merk;
    int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }


    public void info() {
        System.out.println("Kendaraan: " + merk + ", Tahun: " + tahun);
    }

    // Method Overloading
    public void info(String warna) {
        System.out.println("Kendaraan: " + merk + ", Tahun: " + tahun + ", Warna: " + warna);
    }
}