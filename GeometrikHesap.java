/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [25.10.2025]
 * Aciklama: Gorev 2 - Geometrik Hesaplama Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("\n== GEOMETRİK HESAPLAMALAR ==\n");
        System.out.print("Yari Çapi Giriniz = ");
        double yariÇap = input.nextDouble();
        final double PI = 3.14159;
        double daireAlani = PI*Math.pow(yariÇap, 2);
        double daireÇevre = 2*PI*yariÇap;
        double daireÇapi = 2*yariÇap;
        double kureHacmi = (4.0/3.0)*PI*Math.pow(yariÇap, 3);
        double kureYuzeyAlani = 4*PI*Math.pow(yariÇap, 2);

        System.out.println("\nSONUÇLAR = ");
        System.out.printf("\nDAİRENİN ÇAPI       : %.2f cm",daireÇapi);
        System.out.printf("\nDAİRENİN ALANI      : %.2f cm^2",daireAlani);
        System.out.printf("\nDAİRENİN ÇEVRESİ    : %.2f cm",daireÇevre);
        System.out.printf("\nKÜRENİN HACMİ       : %.2f cm^3",kureHacmi);
        System.out.printf("\nKÜRENİN YÜZEY ALANI : %.2f cm^2",kureYuzeyAlani);
        
        input.close();
    }
    
}

