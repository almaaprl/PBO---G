// subclass Mobil
public class Mobil extends Kendaraan {
    private int jumlahRoda;

    public Mobil(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    public String getDetail() {
        return "Mobil: " + getMerk() + " " + getModel() + " (" + getTahunProduksi() + "), Roda: " + jumlahRoda;
    }
}