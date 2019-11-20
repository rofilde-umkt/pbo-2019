class Perkuliahan
{
    public static void main(String[] args) 
    {
        Mahasiswa yuli = new Mahasiswa();
        Mahasiswa andi = new Mahasiswa(4);
        Mahasiswa doni = new Mahasiswa(7);
        
        System.out.println(andi.getSemester());
        andi.sayHello();
    }
}

class Mahasiswa 
{
    private String nim;
    private String nama;
    private int semester;
    private int batasSemester;

    public Mahasiswa()
    {
        System.out.println("I'm Alive");
        this.semester = 1;
        this.batasSemester = 14;
    }

    public Mahasiswa(int semester) 
    {
        this.semester = semester;
        this.batasSemester = 14;
    }

    public void sayHello()
    {
        System.out.println("Hello PBO");
    }

    public void sayHello(String teks)
    {
        System.out.println("Hello " + teks);
    }

    public void sayHello(String teks, String bahasa)
    {
        System.out.println("Hello " + teks);
    }

    public void imAlive()
    {
        System.out.println("Saya Hidup");
    }

    public void setSemester(int semester) 
    {
        this.semester = semester;
    }
    
    public String isDo()
    {
        if (this.semester > this.batasSemester) {
            return "Anda DO";
        }

        return "Masih Bisa Santai";
    }

    public int getSemester() 
    {
        return this.semester;
    }
}


class Dosen 
{
    private String nama;

}

