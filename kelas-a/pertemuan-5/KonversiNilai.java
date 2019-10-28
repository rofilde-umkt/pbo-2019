/**
 * KonversiNilai
 */
public class KonversiNilai 
{

    public char konversi(int nilai)
    {
        if (nilai >= 80 && nilai <= 100) {
            return 'A';
        } else if(nilai >= 70 && nilai < 80) {
            return 'B';
        } else {
            return 'E';
        }
    }
    

    public static void main(String[] args) 
    {
        KonversiNilai konversi = new KonversiNilai();
        
        System.out.println(konversi.konversi(50));
        
    }
}