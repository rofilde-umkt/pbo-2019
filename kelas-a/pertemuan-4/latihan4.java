class Perulangan 
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int a=1;
        while(a <= 10) {
            System.out.println(a);
            a = a +1; // a++;
        }


        int b = 1; 
 
        do {
            System.out.println(b);
            b = b +1; // b++;

        }while(b <=10);
    }
}