import java.util.Scanner;

public class Matematika
{
    private int bilangan1;
    private int bilangan2; 

    public int penjumlahan()
    {
        int jumlah = this.bilangan1 + this.bilangan2;

        return jumlah;
    }


    public double pembagian()
    {
        double hasil = this.bilangan1 / this.bilangan2;

        return hasil;
    }

    public void setBilangan1(int bilangan)
    {
        this.bilangan1 = bilangan;
    }

    public void setBilangan2(int bilangan)
    {
        if (bilangan == 0) {
            System.out.println("Pembagi tidak boleh 0");
            System.exit(0);
        }
        this.bilangan2 = bilangan;
    }

    public int getBilangan1()
    {
        return this.bilangan1;
    }

    public int getBilangan2()
    {
        return this.bilangan2;
    }
}

class Hitungan
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        Matematika hitungan = new Matematika();
        System.out.println("Masukan Bilangan 1 = ");
        hitungan.setBilangan1(keyboard.nextInt());
        
        System.out.println("Masukan Bilangan 2 = ");
        hitungan.setBilangan2(keyboard.nextInt());
        
        System.out.println(hitungan.getBilangan1());

        
        System.out.println("Jumlahnya ialah " + hitungan.penjumlahan());
        System.out.printf("Hasil Pembagiannya ialah %.2f \n",hitungan.pembagian());
        System.out.println("Jumlah dua kali lipatnya ialah " + hitungan.penjumlahan()*2);

    }
}