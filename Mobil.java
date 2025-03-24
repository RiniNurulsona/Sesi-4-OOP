public class Mobil extends Kendaraan {
    public Mobil(String merk, int tahun) {
        super(merk, tahun);
    }

    // Overriding
    @Override
    public void info() {
        System.out.println("Mobil: " + merk + ", Tahun: " + tahun);
    }
}
