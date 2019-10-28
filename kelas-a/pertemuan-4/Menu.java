import java.util.Scanner;

public class Menu 
{
    public static void main(String[] args) 
    {
        String pilihan;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Jurusan Anda ");
        pilihan = keyboard.nextLine();

        switch (pilihan) {
            case "informatika":
                System.out.println("Anda Bisa Menjadi Programmer");        
                break;
            case "sipil":
                System.out.println("Anda Bisa Menjadi Tukang");        
                break;
            case "mesin":
                System.out.println("Anda Bisa Menjadi Montir");        
                break;
            default:
                System.out.println("G Jelas");
                break;
        }
    }
    
}