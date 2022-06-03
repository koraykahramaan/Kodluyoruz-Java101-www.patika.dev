import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double biletFiyat;

        System.out.println("Mesafeyi giriniz(KM) : ");
        int mesafe = scan.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        int yas = scan.nextInt();
        if(yas<0) {
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);
        }
        System.out.println("Yolculuk tipini giriniz(1-Tek yön, 2-Gidiş dönüş) :");
        int yolculukTipi = scan.nextInt();
        if(yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı veri girdiniz.");
            System.exit(0);
        }
        biletFiyat = mesafe*0.10;
        if(yas<12) {
            biletFiyat = biletFiyat/2;
        }
        else if (yas>12 && yas<24) {
            biletFiyat = biletFiyat - (biletFiyat*0.10);
        }
        else if(yas>65) {
            biletFiyat = biletFiyat - (biletFiyat*0.30);
        }

        if(yolculukTipi == 2) {
            biletFiyat = biletFiyat - (biletFiyat*0.20);
            biletFiyat *= 2;
        }

        System.out.println("Toplam tutar : " + biletFiyat + " TL");
    }
}
