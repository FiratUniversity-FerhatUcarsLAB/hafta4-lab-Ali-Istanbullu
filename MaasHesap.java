/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [26.10.2025]
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */
import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

         final double SGK_ORANI = 0.14;
         final double GELIR_VERGISI_ORANI = 0.15;
         final double DAMGA_VERGISI_ORANI = 0.00759;


         System.out.println("BİLGİ GİRİŞİ =\n ");

         System.out.print("İsim Giriniz = ");
         String ad = input.nextLine();

         System.out.print("Soyisim Giriniz = ");
         String soyad = input.nextLine();

         System.out.print("Aylik Brüt Maasinizi Giriniz = ");
         Double brutMaas = input.nextDouble();

         System.out.print("Bu Ay Mesaisiz Çalişma Gününüzü Giriniz = ");
         int aylikÇalişmaGünü = input.nextInt();

         System.out.print("Günlük Çalişma Saatinizi Giriniz = ");
         int gunlukÇalişmaSaati = input.nextInt();

         System.out.print("Aylik Mesai Saatinizi Giriniz = ");
         int mesaiSaati = input.nextInt();


         double birAydakiÇalişmaSaati = aylikÇalişmaGünü*gunlukÇalişmaSaati;
         double mesaiUcreti = (brutMaas/birAydakiÇalişmaSaati)*mesaiSaati*1.5;
         double toplamGelir = mesaiUcreti+brutMaas;
         double sgkKesinti = toplamGelir*SGK_ORANI;
         double gelirKesintisi = toplamGelir*GELIR_VERGISI_ORANI;
         double damgaakaesintisi = toplamGelir*DAMGA_VERGISI_ORANI;
         double toplamKesinti = gelirKesintisi+damgaakaesintisi+sgkKesinti;
         double netMaas = toplamGelir-toplamKesinti;
         double kesintiOrani  =(toplamKesinti/toplamGelir)*100;
         double günlükMaas = netMaas/aylikÇalişmaGünü;


        
       


          System.out.println("=============================");
          System.out.println("       MAAS BORDROSU         ");
          System.out.println("=============================");
          System.out.println("Çalişan = "+ad+" "+soyad);
          System.out.println("\nGELİRLER =");
          System.out.printf("  Brüt Maaş               = %.2f TL ",brutMaas);
          System.out.printf("\n  Mesai Ücreti (%d saat)  = %.2f TL",mesaiSaati,mesaiUcreti);
          System.out.println("\n------------------------------");
          System.out.printf("  TOPLAM GELİR            = %.2f TL",toplamGelir);
          System.out.println("\n\nKESİNTİLER =");
          System.out.printf("  SGK Kesinti (14.0%%)     = %.2f TL",sgkKesinti);
          System.out.printf("\n  Gelir Vergisi (15.0%%)   = %.2f TL",gelirKesintisi);
          System.out.printf("\n  Damga  Vergisi (0.8%%)   = %.2f TL",damgaakaesintisi);
          System.out.println("\n---------------------------------------");
          System.out.printf("TOPLAM KESİNTİ            = %.2f TL ",toplamKesinti);
          System.out.printf("\nNET MAAŞ                  = %.2f TL",netMaas);
          System.out.printf("\nToplan Kesinti Orani      = %.1f %%",kesintiOrani);
          System.out.printf("\nGünlük Maaş               = %.2f",günlükMaas);
          System.out.println("\n=========================================");
          input.close();

        

    }
    
}
