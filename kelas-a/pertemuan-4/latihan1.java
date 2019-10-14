class Lingkaran 
{
    public static final double PI = 3.14; 
    
    int r; 

    public double luas()
    {
        return Lingkaran.PI * this.r * this.r; 
    }

    public double keliling()
    {
        return 2 * Lingkaran.PI * this.r;
    }

    public int cariDiamater()
    {
        return this.r * 2;
    }
}

class PerhitunganBangunRuang 
{
    public static void main(String[] args) 
    {
        Lingkaran lingkaranKecil = new Lingkaran();
        lingkaranKecil.r = 7;
        System.out.print(lingkaranKecil.r);
    }
}