class Bola
{
    int r; 

    public double volume()
    {
        return 4/3 * Lingkaran.PI * r * r * r;
    }
}

class BangunRuang
{
    public static void main(String[] args) 
    {
        Bola bolaKasti = new Bola();
        Bola bolaKaki = new Bola();
        bolaKasti.r = 7;
        bolaKaki.r = 28;

        System.out.println("Volume Bola Kasti ialah " + bolaKasti.volume());
        System.out.println("Volume Bola Kaki ialah " + bolaKaki.volume());
        
    }
}