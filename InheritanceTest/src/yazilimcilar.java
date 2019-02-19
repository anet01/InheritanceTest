public class yazilimcilar extends calisanlar{

    private String diller;

    public yazilimcilar(String ad,String soyad,int id,String diller){
        super(ad,soyad,id);
        this.diller=diller;

    }
    public void formatAt(String isletim_sistemi){

        System.out.println(getAd()+" "+isletim_sistemi+"yi yüklüyor.");

    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller: "+diller);

    }
}
