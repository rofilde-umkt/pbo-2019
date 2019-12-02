abstract public class Profile
{
    private String nama;
    private String alamat; 

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama() 
    {
        return this.nama;
    }

    public void setAlamat(String alamat)
    {
        this.alamat = alamat;
    }

    public String getAlamat() 
    {
        return this.alamat;
    }
}