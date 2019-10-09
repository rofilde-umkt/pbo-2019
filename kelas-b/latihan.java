/**
 * Deskripsi paket/program yang dibuat
 * @author Rofilde Hasudungan <rofilde@umkt.ac.id>
 * Lisensi MIT
 */
class Mahasiswa 
{
    String nim;
    String nama; 
    String alamat; 

    /*
     Method ini digunakan untuk menyuruh Mahasiswa belajar.
     */
    public void belajar(MataKuliah mataKuliah)
    {
        // Variabel umur digunakan untuk menampung data umur dari mahasiswa
        long umur;
        String nama = "AKi";

        System.out.println(this.nama.toUpperCase() + " belajar " + mataKuliah.nama + nama);
    }

    /**
     * Method ini digunakan untuk memberikan tugas matakuliah ke Mahasiswa
     * @param mata_kuliah merupakan object dari kelas MataKuliah
     */
    public void mengerjakanTugas(MataKuliah mata_kuliah)
    {
        System.out.println(this.alamat);
        
    }
}

class MataKuliah
{
    String kode;
    String nama;
}

class Dosen 
{
    String nidn;
    String nama;

    public void mengajar(MataKuliah mata_kuliah)
    {
        System.out.println(this.nama + " mengajar " + mata_kuliah.nama);
    }
}


class UMKT
{
    public static void main(String[] args)
    {
        Mahasiswa ijul = new Mahasiswa();
        ijul.nama = "Ijul Zulkarnaen";
        ijul.nim = "180001";
        Mahasiswa nina = new Mahasiswa();
        nina.nama = "Nina Zubair";
        nina.nim = "160001";

        Dosen awang = new Dosen();
        awang.nidn = "1100001";
        awang.nama = "Awang Aminudin";

        Dosen nanang = new Dosen();
        nanang.nama = "Nanang, S.Kom.";
        nanang.nidn = "100100";

        


        MataKuliah pbo = new MataKuliah();
        pbo.kode = "INF001";
        pbo.nama = "Pemrograman Berbasis Objek ";

        awang.mengajar(pbo);
        ijul.belajar(pbo);
        nina.belajar(pbo);

        nanang.mengajar(pbo);
    }
}

class Sapi
{
    int umur; 

    int nama; 

    public static void main(String[] args)
    {
        System.out.println("Hello 1");
        System.out.print("Hello 2\n");
        System.out.print("Hello 3\n");
        System.out.printf("Hello %d\n", 5);
    }

    public void makan()
    {
        System.out.println("Makan rumput"); 
    }
}

class Lingkaran
{
    // Ini ialah konstanta 
    public static final double PI = 3.14;
    public static final double EARTH_GRAVITY = 9.83;

    int umur = 0;

    public static void main(String[] args)
    {
        double jari2 = 7;

        double luas = Lingkaran.PI * jari2 * jari2;

        System.out.println("Luas Lingkaran ialah " + luas);
    }

}

class Bola
{
    public static void main(String[] args)
    {
        double jari2 = 7;
        double volume = 4/3 * Lingkaran.PI * jari2 * jari2 * jari2;

        System.out.println("Volume bola ialah " + volume);
    }
}
