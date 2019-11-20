import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Menu 
{
    String nama;
    int harga;

    public void setAttributes(String nama, int harga)
    {
        this.nama = nama;
        this.harga = harga;
    }
}

class Pesanan 
{
    Menu menu;
    int jumlah;

    public int total()
    {
        return this.menu.harga * jumlah; 
    }

    public void setAttributes(Menu menu, int jumlah)
    {
        this.menu = menu;
        this.jumlah = jumlah;
    }
}

class Restoran
{
    public static void main(String[] args) 
    {
        Menu nasiGoreng = new Menu();
        nasiGoreng.setAttributes("Nasi Goreng", 15000);
        Menu sotoBanjar = new Menu();
        sotoBanjar.setAttributes("Soto Banjar", 20000);
        Menu sotoLamongan = new Menu();
        sotoLamongan.setAttributes("Soto Lamongan", 18000);
        Menu esTeh = new Menu();
        esTeh.setAttributes("Es Teh", 3000);
        
        List<Pesanan> daftarPesanan = new ArrayList<Pesanan>();
        
        String lagi = "y";
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        int nomorPesanan;
        int jumlah;
        while (lagi.equals("y")) {
            System.out.println("#----Menu----#");
            System.out.printf("1. %15s %d\n", nasiGoreng.nama, nasiGoreng.harga);
            System.out.printf("2. %15s %d\n", sotoBanjar.nama, nasiGoreng.harga);
            System.out.printf("3. %15s %d\n", sotoLamongan.nama, nasiGoreng.harga);
            System.out.printf("4. %15s %d\n", esTeh.nama, esTeh.harga);
            System.out.print("Masukan Pesanan Anda ");
            nomorPesanan = keyboard.nextInt();
            System.out.print("\nJumlah ");
            jumlah = keyboard.nextInt();
            Pesanan pesanan = new Pesanan();
            
            if (nomorPesanan == 1) {
                pesanan.setAttributes(nasiGoreng, jumlah);
                daftarPesanan.add(pesanan);
            }else if (nomorPesanan == 2) {
                pesanan.setAttributes(sotoBanjar, jumlah);
                daftarPesanan.add(pesanan);
            }else if (nomorPesanan == 3) {
                pesanan.setAttributes(sotoLamongan, jumlah);
                daftarPesanan.add(pesanan);
            }else if (nomorPesanan == 4) {
                pesanan.setAttributes(esTeh, jumlah);
                daftarPesanan.add(pesanan);
            }

            System.out.print("Mau Pesan Lagi? ");
            lagi = keyboard2.nextLine();
            
        }
        
        int total = 0;
        System.out.println("---Pesanan Anda---");
        for (Pesanan pesanan : daftarPesanan) {
            System.out.printf("%15s %3d %d\n", pesanan.menu.nama, pesanan.jumlah, pesanan.total());

            total += pesanan.total();
        }

        System.out.printf("Total Pesanan Anda %d", total);

    }
}