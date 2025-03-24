public class Motor extends Kendaraan {
    public Motor(String merk, int tahun) {
        super(merk, tahun);
    }

    // Overriding
    @Override
    public void info() {
        System.out.println("Motor: " + merk + ", Tahun: " + tahun);
    }
}
