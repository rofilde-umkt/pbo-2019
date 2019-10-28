class Lingkaran
{
    public static final double PI = 3.14;
    public static final double PI2 = 22/7;

    protected double jari2;

    public void keliling()
    {

    }

    public double luas()
    {
        return Lingkaran.PI * this.jari2 * this.jari2;
    }

    public void tampilkanLuas()
    {
        System.out.println("Luas Lingkaran ialah " + this.luas());
    }
}