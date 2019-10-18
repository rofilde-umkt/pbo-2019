import java.util.Scanner;

/**
 * hitung
 */
class Hitung 
{
    public static void main(String[] args) 
    {
        Scanner papanKetik = new Scanner(System.in);
        
        int total = 0;
        int bilangan = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukan bilangan bulat = ");
            bilangan = papanKetik.nextInt();
            total += bilangan; // total = total + bilangan;
        }
        System.out.println("Total Penjumlahan ialah " + total);
    }
    
}