class Perulangan 
{
    public static void main(String[] args) 
    {
        int i;
        
        for (i = 1; i <= 10; i++) {
            System.out.println("Perulangan ke " + i);
        }

        int a = 1;
        while(a != 10) {
            System.out.println("Perulangan ke " + a);
            a++; // a = a + 1;
        }

        int b = 1;

        do {
            System.out.println("Perulangan ke " + b);
            b++; // b = b + 1;
        }while(b != 10);
    }
}