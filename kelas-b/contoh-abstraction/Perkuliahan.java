public class Perkuliahan 
{
    public static void main(String[] args) 
    {
        Dosen anto = new Dosen();
        anto.setNama("Antonio");
        anto.setNidn("1100900");    
        Mahasiswa ani = new Mahasiswa();
        ani.setNama("Anita");
        ani.setNim("1909991");
        anto.memberiTugas("PBO");
        ani.bayarSpp(100000);
        ani.belajar("PBO");
    }
    
}