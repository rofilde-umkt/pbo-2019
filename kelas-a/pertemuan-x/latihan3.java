import java.util.ArrayList;
import java.util.List;

class MataKuliah
{
    String kode;
    String nama;

    public MataKuliah(String kode, String nama) 
    {
        this.kode = kode;
        this.nama = nama;
    }
}

class Mahasiswa
{
    List<MataKuliah> mataKuliah;

    public Mahasiswa(){
        this.mataKuliah = new ArrayList<MataKuliah>();
    }

    public void ambilMataKuliah(MataKuliah mk)
    {
        this.mataKuliah.add(mk);
    }
}

class Perkuliahan 
{
    public static void main(String[] args) 
    {
        MataKuliah pbo = new MataKuliah("INF2001", "PBO");    
        MataKuliah strukturData = new MataKuliah("INF2002", "Struktur Data");    
        
        Mahasiswa ani = new Mahasiswa();
        ani.ambilMataKuliah(pbo);
        ani.ambilMataKuliah(strukturData);

        for(MataKuliah mk : ani.mataKuliah) {
            System.out.println("Mata Kuliah " + mk.nama);
        }
    }
}