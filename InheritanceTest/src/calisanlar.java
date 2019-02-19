public class calisanlar {

    private String ad;
    private String soyad;
    private int id;

    public calisanlar(String ad,String soyad,int id){

        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
    }

    public void bilgileriGoster(){
        System.out.println("Adı: "+ad+"\nSoyadı: "+soyad+"\nid: "+id);

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
