class Lingkaran 
{
    public static final double PI = 3.14; 
    public static final double PI_2 = 22/7;
    
    int r; 

    public double luas()
    {
        if (this.r % 7 == 0) {
            return Lingkaran.PI_2 * this.r * this.r; 
        } else {
            return Lingkaran.PI * this.r * this.r;
        }
    }

    public double keliling()
    {
        if (this.r % 7 == 0) {
            return 2 * Lingkaran.PI_2 * this.r;
        } else {
            return 2 * Lingkaran.PI * this.r;
        }
        
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
        System.out.println(lingkaranKecil.luas());
    }
}