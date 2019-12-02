interface MahasiswaInterface 
{
    public void bayarSpp();
    public void skripsi();
       
}

interface BemInterface {
    public void demo();
}

interface TsInterface {
    public void latihan();
}


class Mahasiswa implements MahasiswaInterface
{
    public void bayarSpp()
    {

    }

    public void skripsi()
    {

    }
}

class Mapala implements MahasiswaInterface, BemInterface, TsInterface
{
    public void bayarSpp()
    {

    }

    public void skripsi()
    {

    }

    @Override
    public void demo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void latihan() {
        // TODO Auto-generated method stub
        
    }
}

class MahasiswaPecintaLangit implements MahasiswaInterface
{

}

class Implementasi
{
    public static void main(String[] args) {
        Mapala ani = new Mapala();
    }
}