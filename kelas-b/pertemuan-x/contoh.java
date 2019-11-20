class Mahasiswa
{
    private String nim;
    private String nama;
    private int semester; 
    private int maksimalSemester;

    /**
     * Deskripsi: Gunakan constructor ini untuk mahasiswa baru
     * Constructor: Method ini dieksekusi secara otomatis saat membuat objek
     * Cirinya: Nama Method sama dengan nama Kelas
     * 
     */ 
    public Mahasiswa()
    {
        this.semester = 1;
        this.maksimalSemester = 14;


    }

    /**
     * Deskripsi: Gunakan constructor ini untuk mahasiswa transfer atau alih jenjang
     * Constructor: Method ini dieksekusi secara otomatis saat membuat objek
     * Cirinya: Nama Method sama dengan nama Kelas
     * 
     */ 
    public Mahasiswa(int semester)
    {
        this.semester = semester;
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


    public static void suara()
    {
        System.out.println("Aku disini.....!!!!");
    }

    public Mahasiswa makan()
    {
        System.out.println("Makan....Kenyang");

        return this;
    }

    public Mahasiswa tidur()
    {
        System.out.println("Tidur larut");

        return this;
    }

    public void kuliah() {
        System.out.println("Kuliah g mandi");
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


        Mahasiswa andi = new Mahasiswa(4);

        System.out.println(andi.getSemester());

        andi.makan().tidur().kuliah();
    }
}