class BangunRuang
{
    public static void main(String[] args) 
    {
        Tabung kaleng = new Tabung();    
        kaleng.setJari2(7.5);
        kaleng.setTinggi(10.0);
        System.out.println("Volume Kaleng = " + kaleng.volume());
    }
}