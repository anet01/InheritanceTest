public class yoneticiler extends calisanlar {

    private int sorumluOlduguKisiSayisi;

    public yoneticiler(String ad,String soyad,int id,int sorumluOlduguKisiSayisi){
        super(ad,soyad,id);
        this.sorumluOlduguKisiSayisi=sorumluOlduguKisiSayisi;
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Sorumlu Olduğu Kişi Sayısı: "+sorumluOlduguKisiSayisi);

    }

    public void zamyap(int zamMiktari){

        System.out.println(getAd()+""+zamMiktari+"TL Zam Yaptı");
    }

}
