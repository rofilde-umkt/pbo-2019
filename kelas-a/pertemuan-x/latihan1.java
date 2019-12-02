abstract class BidangDatar
{
    private String warna;

    abstract public double luas();
    abstract public double keliling();

    public String getWarna()
    {
        return this.warna;
    }

    public void setWarna(String warna) 
    {
        this.warna = warna;
    }
}

class Segitiga extends BidangDatar
{
    double a; 
    double t; 
    double s1;
    double s2;

    @Override
    public double luas() {
        
        return this.a * this.t / 2;
    }

    @Override
    public double keliling() {
        return this.a + this.s1 + this.s2;
    }
}

class Persegi extends BidangDatar
{
    double p; 
    double l; 
    

    @Override
    public double luas() {
        
        return this.p * this.l;
    }

    @Override
    public double keliling() {
        return (this.p + this.l)*2;
    }
}

final class Kotak extends Persegi
{
    double t;

    public double volume()
    {
        return this.luas() * this.t;
    }

    public double luasSelimut()
    {
        return (this.p*this.l + this.p*this.t + this.l*this.l)  * 2;
    }
}


class PerhitunganBidangDatar 
{
    public static void main(String[] args) 
    {
        Segitiga penggaris = new Segitiga();
        penggaris.a = 9.5;
        penggaris.t = 10;
        penggaris.s1 = 8;
        penggaris.s2 = 8;
        penggaris.setWarna("Kuning");

        System.out.println("Luas Lingkaran adalah " + penggaris.luas());
        System.out.println("Keliling Lingkaran adalah " + penggaris.keliling());
        System.out.println("Warna Lingkaran adalah " + penggaris.getWarna());


        Kotak penghapus = new Kotak();
        penghapus.l = 2;
        penghapus.t = 4;
        penghapus.p = 10;
        System.out.println("Volume Kota adalah " + penghapus.volume());

    }
}