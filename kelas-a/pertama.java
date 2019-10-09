// Kelas Utama
class UMKT
{
  public static void main(String[] args)
  {
  	System.out.println("Hello World");
    
    MataKuliah pbo = new MataKuliah();
    pbo.kode = "INF11101";
    pbo.nama = "Bahasa Pemrograman Berbasis Objek";
    MataKuliah kalkulus = new MataKuliah();
    kalkulus.kode = "INF30001";
    kalkulus.nama = "Kalkulus";
    
    Dosen aslia = new Dosen();
    aslia.nama = "Asslia";
    Dosen naufal = new Dosen();
    naufal.nama = "Naufal A.";
    
    
    Mahasiswa acong = new Mahasiswa();
    acong.nama = "Acong Kusuma";
    acong.nim  = "18000001";
    acong.dosenPA = naufal;
    
    System.out.println(acong.nama);
    acong.mengerjakanTugas(pbo);
    acong.belajar(kalkulus);
    acong.belajar(pbo);
    
    Mahasiswa siti = new Mahasiswa();
    siti.nama = "Siti Kumalasari";
    siti.nim  = "180003";
    
    siti.mengerjakanTugas(kalkulus);

    Dosen jul = new Dosen();
    jul.nama = "Siti M. Kom";
    jul.mengajar(pbo);
    jul.memberiTugas(pbo, acong);

    System.out.println("Dosen PA si " + acong.nama + " ialah " + acong.dosenPA.nama);
  }
}


class Mahasiswa
{
	  public String nama;
    public String nim;
    public Dosen dosenPA;

   
  	public void belajar(MataKuliah matakuliah)
    {
    	  System.out.println(this.nama + " Belajar " + matakuliah.nama);
    }
  
	  public void mengerjakanTugas(MataKuliah matakuliah)
    {
    	  System.out.println(this.nama + " Mengerjakan Tugas " + matakuliah.nama);
    }
}

class MataKuliah
{
    public String kode;
    public String nama;
}

class Dosen 
{
  public String nidn;
  public String nama;

  public void mengajar(MataKuliah matakuliah) 
  {
    System.out.println(this.nama + " Mengajar " + matakuliah.nama);
  }

  public void memberiTugas(MataKuliah matakuliah, Mahasiswa mahasiswa)
  {
      System.out.println(this.nama + " Memberi Tugas " + matakuliah.nama + " ke " + mahasiswa.nama);
  }
}