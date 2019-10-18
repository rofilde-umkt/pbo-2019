import java.util.Scanner;

class Percabangan 
{
    public static void main(String[] args) 
    {
        int umur;
        Scanner keyboard = new Scanner(System.in);
        
        for(int i = 1; i <= 5; i++ ){
            System.out.print("Berapakah umur Anda? ");
            umur = keyboard.nextInt();

            if (umur >= 50) {
                System.out.println("Anda telah tua");
            } else if(umur <50 && umur >= 22){
                System.out.println("Anda telah dewasa");
            } else if(umur < 22 && umur >= 12) {
                System.out.println("Anda Remaja");
            } else {
                System.out.println("Anda Masih Bayi");
            } 
        }

    }

    
}