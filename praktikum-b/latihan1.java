import java.util.Scanner;

class Hidangan
{
    public String nama;
    public int harga;

    public Hidangan(String nama, int harga)
    {
        this.nama = nama;
        this.harga = harga;
    }
}

class Pesanan
{
    public static void main(String[] args) 
    {
        int jawaban=1;
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int pesanan = 1;
        Hidangan nasiGoreng = new Hidangan("Nasi Goreng", 15000);
        Hidangan nasiAyam = new Hidangan("Nasi Ayam", 12000);
        Hidangan esTeh = new Hidangan("Es Teh", 5000);
        Hidangan esJeruk = new Hidangan("Es Jeruk", 7000);
        
        while(pesanan <= 4) {
            System.out.printf("\n1. %10s %d\n", nasiGoreng.nama, nasiGoreng.harga);
            System.out.printf("2. %10s %d\n", nasiAyam.nama, nasiAyam.harga);
            System.out.printf("3. %10s %d\n", esTeh.nama, esTeh.harga);
            System.out.printf("4. %10s %d\n", esJeruk.nama, esJeruk.harga);
            System.out.print("Pesan Apa?[1-5] ");
            pesanan = keyboard.nextInt();
            if(pesanan == 1)
                total += nasiGoreng.harga;
            else if(pesanan == 2)
                total += nasiAyam.harga;
            else if(pesanan == 3)
                total += esTeh.harga;
            else if(pesanan == 4)
                total += esJeruk.harga;    
        }
        System.out.println("\nTotal " + total);
    }
}