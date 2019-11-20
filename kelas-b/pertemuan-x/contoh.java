class Mahasiswa
{
    private String nim;
    private String nama;
    private int semester; 
    private int maksimalSemester;

    /**
     * Constructor: Method ini dieksekusi secara otomatis saat membuat objek
     * Cirinya: Nama Method sama dengan nama Kelas
     * 
     */ 
    public Mahasiswa()
    {
        this.semester = 1;
        this.maksimalSemester = 14;


    }
    public void sayHello(String kalimat, String apalah)
    {
        System.out.println(kalimat);
    }

    public void sayHello(String kalimat)
    {
        System.out.println(kalimat);
    }

    public void sayHello()
    {
        System.out.println("Hello bro...!");
    }

    public int getSemester() 
    {
        return this.semester;
    }

    public void setSemester(int semester) 
    {
        this.semester = semester;
    }

    public String getLabelSemester() 
    {
        if (getSemester() % 2 == 0) {
            return "Genap"; 
        }

        return "Ganjil";
    }

}


class Kuliah
{
    public static void main(String[] args) 
    {
        Mahasiswa dewi = new Mahasiswa();
        dewi.setSemester(3);
        System.out.println(dewi.getSemester());
        System.out.println(dewi.getLabelSemester());
        dewi.sayHello();

        Mahasiswa sinta = new Mahasiswa();
        sinta.sayHello("Hello Sis...!");
    }
}