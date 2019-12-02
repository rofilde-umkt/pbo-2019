public class Dosen extends Profile implements DosenInterface
{
    private String nidn;
    
    public void setNidn(String nidn) 
    {
        this.nidn = nidn;
    }

    public String getNidn() 
    {
        return this.nidn;
    }

    public void memberiTugas(String mataKuliah)
    {
        System.out.println(this.getNama() + " Memberi Tugas " + mataKuliah);
    }    
}