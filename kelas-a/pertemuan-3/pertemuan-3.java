/**
 * deskriupsi
 * @author Rofilde Hasudungan<rofilde@gmail.com>
 */
class Mobil{
    byte jumlahRoda; 
    String nomorPlat; 
    byte kapasitas;

}

/**
 * Ini ialah kelas Supir digunakan untuk vblllalllba
 * cara pakai seperti ...... 
 */
class Supir
{
    // nama supir
    // tipe String 
    String nama;
    String gelar;
    String sim;
    char jenisKelamin;

    /**
     * Method ini digunakan untuk menyuruh supir mengendarai mobil
     * @param mobil
     */
    public void mengendari(Mobil mobil) 
    {
        System.out.println(this.nama.toUpperCase() + " Mengendari mobil " + mobil.nomorPlat);
    }

    public int hitungUmur()
    {
        return 10 * 20;
    }

    public String namaLengkap()
    {
        return this.nama + " " + this.gelar;
    }
}

class Traveling
{
    public static void main(String[] args) 
    {
        Mobil sedan_merah = new Mobil();
        sedan_merah.jumlahRoda = 4;
        sedan_merah.nomorPlat = "KT 1";
        sedan_merah.kapasitas = 6;

        Supir pak_ogah = new Supir();
        pak_ogah.nama = "Ogah O.";
        pak_ogah.sim = "C123A";
        pak_ogah.jenisKelamin = 'L';

        pak_ogah.mengendari(sedan_merah);

        String firstName="      Acong     ";
        String lastName="Baba";

        System.out.println(firstName.trim().concat(" ".concat(lastName)));
        
        System.out.println(firstName.equals(lastName));

        int angka1  = 1000000;
        int angka2 = 10000000;
        long hasil = angka1 + angka2;
        System.out.println(hasil);

    }
}