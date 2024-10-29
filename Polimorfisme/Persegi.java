package Polimorfisme;

public class Persegi extends BangunDatar {
    private double sisi;

    public persegi(final String sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}
