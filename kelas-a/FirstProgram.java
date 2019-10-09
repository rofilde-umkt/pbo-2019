import java.util.Scanner;

public class FirstProgram
{
    public static void main(String[] args)
    {
        System.out.println("Hallo Program Kalkulator Sayur!");
        System.out.println("Program ini akan menambahkan dua buah angka!");
        System.out.println("Masukan dua buah angka");
        
        short n1, n2;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Angka Pertama : ");
        n1 = keyboard.nextInt();
        
        System.out.print("Angka Kedua : ");
        n2 = keyboard.nextInt();
        
        System.out.println("Jumlah kedua angka tersebut ialah ");
        System.out.println(n1 + n2);
        
    }
}