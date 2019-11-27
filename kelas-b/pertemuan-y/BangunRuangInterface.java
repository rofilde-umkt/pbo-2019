interface BangunRuangInterface 
{
    double volume();
    double luas();
}

interface MewarnaiInterface 
{
    String setWarna(String warna);
}

class LimasSegitiga implements BangunRuangInterface, MewarnaiInterface
{
    public double volume()
    {
        return 0;
    }

    public double luas()
    {
        return 0;
    }

    @Override
    public String setWarna(String warna) {
        
        return warna;
    }

}

class LimasSegidelapan implements BangunRuangInterface
{
    public double volume()
    {
        return 0;
    }

    public double luas()
    {
        return 0;
    }
}