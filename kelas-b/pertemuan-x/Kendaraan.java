class Kendaraan
{
    String warna;

    public void jalan() {
        System.out.println("Kendaraan Berjalan");
    }
}

class KendaraanDarat extends Kendaraan
{
    int jumlahRoda;
}

class MobilSedan extends KendaraanDarat 
{
    public MobilSedan()
    {
        jumlahRoda = 4;
    }
}

class Truck extends KendaraanDarat 
{
    public Truck()
    {
        jumlahRoda = 6;
    }
}

class Bajai extends KendaraanDarat 
{
    public Bajai()
    {
        jumlahRoda = 3;
    }
}


class KendaraanLaut extends Kendaraan
{
    
}

class KendaraanUdara extends Kendaraan
{
    int jumlahSayap;
    
    /**
     * Method overriding
     */
    public void jalan()
    {
        System.out.println("Pesawat udara Terbang");
    }
}

class Transportasi
{
    public static void main(String[] args) {
        KendaraanDarat mobil = new KendaraanDarat();
        mobil.jalan();

        KendaraanLaut kapal = new KendaraanLaut();
        kapal.jalan();

        KendaraanUdara pesawat = new KendaraanUdara();
        pesawat.jalan();
    }
}