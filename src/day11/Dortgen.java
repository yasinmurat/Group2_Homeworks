package day11;

import java.util.Scanner;

public class Dortgen {
    public static void main(String[] args) {
        //TODO: Dortgen programını geliştiriniz.
        /*
            1. Klavyeden 3 adet girdi alınacaktır.
                kenar:int       -> Karenin kenarı
                kisaKenar:int   -> Dikdörtgenin kısa kenarı
                uzunKenar:int   -> Dikdörtgenin uzun kenarı
            2. alanHesapla(int k1, int k2):int  -> Metodu geliştirilecektir.
            3. Tek bir metot (alanHesapla) iki kez çağırılarak hem karenin hem de
            dikdörtgenin alanı hesaplanacaktır.
            4. cevreHesapla(int k1,int k2):int  -> Metodu geliştirilecektir.
            5. Tek bir metot (cevreHesapla) iki kez çağırılarak hem karenin hem de
            dikdörtgenin çevresi hesaplanacaktır.
            6. Elde edilen toplam alan hesaplanıp ekranda gösterilecektir.
            7. Elde edilen toplam çevre ekranda gösterilecektir.
         */
        Scanner ınput=new Scanner(System.in);
        System.out.print("Kare kenar giriniz :");
        int kareKenar= ınput.nextInt();
        System.out.print("Dikdötgenin Uzun Kenarı Giriniz :");
        int dikdörtgenUzunkenar= ınput.nextInt();
        System.out.print("Dikdörtgenin Kısa Kenarı Giriniz  :");
        int dikdörtgenKısakenar= ınput.nextInt();


        int toplamAlan=alanHesaplama(kareKenar)+alanHesaplama(dikdörtgenKısakenar,dikdörtgenUzunkenar);
        System.out.println("Alanlar Toplmı: "+ toplamAlan);
        int toplamCevre =cevreHesaplama(kareKenar)+cevreHesaplama(dikdörtgenKısakenar,dikdörtgenUzunkenar);
        System.out.println("Çevreler Toplamı  :"+ toplamCevre);

    }
    public static int alanHesaplama(int a){
        return a*a;
    }
    public static int alanHesaplama(int a,int b){

        return a*b;
    }
    public static int cevreHesaplama(int a){

        return a*4;
    }
    public static int cevreHesaplama(int a,int b){
        return 2*(a+b);
    }

}
