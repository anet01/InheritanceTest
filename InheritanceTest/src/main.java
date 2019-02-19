import java.util.Scanner;

public class main {
    public static void main(String[] args){
    String islemler="1.Yazılımcı İşlemleri\n"
            +"2.Yönetici İşlemleri\n"
            +"Çıkmak için q'ya basınız";
        Scanner scanner=new Scanner(System.in);
        yazilimcilar yaz1=new yazilimcilar("Berkay","Bahçeci",23,"C#,Java,Sql");
        yoneticiler yon1=new yoneticiler("Uğur","Türkgüven",76,66);

        while (true){
            System.out.println(islemler);
            String gislem=scanner.next();

            if (gislem.equals("q")){

                System.out.println("Programdan Çıkılyor...");
                break;
            }

            else if (gislem.equals("1")){
                String yazislemler="1.Format at\n"
                        +"2.Bilgileri Göster\n"
                        +"Çıkmak için q'ya basınız.";
                while (true){
                    System.out.println(yazislemler);
                    String yazsecim=scanner.next();

                    if (yazsecim.equals("1")){
                        System.out.println("Yüklenecek İşletim Sistemini Giriniz.");
                        String isletimSistemi=scanner.next();
                        yaz1.formatAt(isletimSistemi);

                    }
                    else if (yazsecim.equals("2")){
                        yaz1.bilgileriGoster();

                    }
                    else if (yazsecim.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden Çıkılıyor.");
                        break;
                    }
                    else{
                        System.out.println("Hatalı İşlem Yaptınız.");
                    }

                }

            }
            else if (gislem.equals("2")){
                String yoneticiİslemler="1.Zam Yap\n"
                        +"2.BilgileriGoster\n"
                        +"Çıkmak için q'ya bas";
                while (true){
                    System.out.println(yoneticiİslemler);
                    String yoneticisecim=scanner.next();

                    if (yoneticisecim.equals("q")){

                        System.out.println("Yönetici işlemlerinden Çıkılıyor.");
                        break;
                    }
                    else if (yoneticisecim.equals("1")){
                        int zamMiktari;
                        System.out.println("Yapmak istediğiniz zam miktarını giriniz.");
                        zamMiktari=scanner.nextInt();
                        yon1.zamyap(zamMiktari);
                    }
                    else if(yoneticisecim.equals("2")){
                        yon1.bilgileriGoster();

                    }
                    else
                    {
                        System.out.println("Hatalı işlem Yaptınız.");
                    }
                }




            }

            else{
                System.out.println("Hatalı İşlem Yaptınız.");
            }
        }



    }

}
