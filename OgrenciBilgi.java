/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [25.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("=== OGRENCI BILGI SISTEMI ===");
    System.out.print("Öğrenci Ad =");
    String ad = input.nextLine();
    System.out.print("Öğrenci Soyad =");
    String soyad = input.nextLine();
    System.out.print("Öğrencinin Numarasi = ");
    int numara = input.nextInt();
    System.out.print("Öğrencinin Yasi = ");
    int yas = input.nextInt();
    System.out.print("Öğrencinin GPA (0.00-4.00) = ");
    double gba = input.nextDouble();

    


    System.out.println("\n=== OGRENCI BILGI SISTEMI ===\n");

    System.out.println("Öğrencinin Adi ve Soyadi = "+ad+" "+soyad);
    System.out.println("Öğrencinin Numarasi = "+numara);
    System.out.print("Öğrencinin Yasi = "+yas);
    System.out.printf("\nÖğrencinin GPA =%.2f ",gba);

    if (gba<=3)

    System.out.println("\nDurum = Öğrenci başarisiz");

    else 

    System.out.println("\nDurum = Öğrenci başarili");


    input.close();
    


}
    
}

