class Angkot
{
    String jurusan;
    String warna;
    String nomor;
}

class Penumpang
{
    String nama;

    public void menumpang(Angkot angkot)
    {
        System.out.println(this.nama + " menumpang angkot nomor " + angkot.nomor);
        System.out.println("Angkot nomor "+ angkot.nomor + " Jurusan " + angkot.jurusan);
    }
}

class Perjalanan
{
    public static void main(String[] args) 
    {
        Penumpang ali = new Penumpang();
        ali.nama = "Ali Sadikin";
        Angkot angkot_1 = new Angkot();
        angkot_1.jurusan = "Pasar Pagi";
        angkot_1.warna = "Hijau";
        angkot_1.nomor = "B";
        ali.menumpang(angkot_1);
    }
}