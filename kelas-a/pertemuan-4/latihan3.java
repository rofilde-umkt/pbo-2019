class GradeNilai
{
    int nilai; 
    
    public char huruf()
    {
        if (this.nilai >= 80) {
            return 'A';
        } else if (this.nilai >= 70 && this.nilai < 80) {
            return 'B';
        }  else if (this.nilai >= 60 && this.nilai < 70) {
            return 'C';
        }  else if (this.nilai >= 50 && this.nilai < 60) {
            return 'D';
        } else {
            return 'E';
        }
    }
}

class NilaiMahasiswa
{
    public static void main(String[] args) {
        GradeNilai nilaiPBO = new GradeNilai();
        nilaiPBO.nilai = 55;
        System.out.println("Huruf dari nilai " + nilaiPBO.nilai + " = " + nilaiPBO.huruf());
    }
}