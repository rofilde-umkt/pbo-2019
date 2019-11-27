abstract class BangunRuang 
{
    abstract double luas();
    abstract double keliling();

    private String warna; 

    public void setWarna(String warna)
    {
        this.warna = warna;
    }

    public String getWarna()
    {
        return this.warna;
    }
}

class Segitiga extends BangunRuang
{
    double alas; 
    double tinggi; 
    double sisiKiri;
    double sisiKanan; 

    @Override
    double luas() {
        double luas = 1/2 * alas * tinggi;
        return luas;
    }

    @Override
    double keliling() {
        double keliling = alas + sisiKiri + sisiKanan;
        return 0;
    }
}

class Persegi extends BangunRuang
{
    double panjang;
    double lebar;

    @Override
    double luas() {
        double luas  = panjang * lebar;
        return luas;
    }

    double keliling()
    {
        double keliling  = 2 * (panjang + lebar);

        return keliling;
    }
}

class Imp 
{
    public static void main(String[] args) 
    {
        Persegi kotak = new Persegi();
        kotak.panjang = 5;
        kotak.lebar = 10;
        kotak.setWarna("Merah");
        System.out.println("Kotak Warna " + kotak.getWarna()+ " Luas " +kotak.luas());

    }
}