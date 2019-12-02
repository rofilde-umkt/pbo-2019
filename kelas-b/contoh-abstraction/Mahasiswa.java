public class Mahasiswa extends Profile implements MahasiswaInterface
{
    private String nim;

    public void setNim(String nim) 
    {
        this.nim = nim;
    }

    public String getNim() 
    {
        return this.nim;
    }

    public void bayarSpp(int jumlah)
    {
        System.out.println(this.getNama() + " Membayar SPP " + jumlah);
    }

    public void belajar(String mataKuliah)
    {
        System.out.println(this.getNama() + " Belajar " + mataKuliah);
    }
    
}