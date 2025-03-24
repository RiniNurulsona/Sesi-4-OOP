public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Generic", 2000);
        kendaraan.info();
        kendaraan.info("Merah"); // Overloading
        
        Mobil mobil = new Mobil("Toyota", 2022);
        mobil.info(); // Overriding

        Motor motor = new Motor("Honda", 2021);
        motor.info(); // Overriding
    }
}