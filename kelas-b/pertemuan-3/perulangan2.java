import java.util.Scanner;

/**
 * perulangan2
 */
class Perulangan2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int umur = -1;

        while (umur != 0) {
            System.out.println("Berapakah umur Anda? ");
            umur = keyboard.nextInt();
            System.out.println("Umur saya " + umur);
        }
    }
}