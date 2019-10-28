class Tabung 
{
    private double jari2; 
    private double tinggi; 

    public double volume()
    {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jari2 = 3.5;

        return lingkaran.luas() * this.tinggi;
    }

    public void setJari2(double jari2) 
    {
        this.jari2 = jari2;
    }

    public void setTinggi(double tinggi) 
    {
        this.tinggi = tinggi;
    }
}